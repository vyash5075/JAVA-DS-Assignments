/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package miscellaneous;
import java.util.*;
/**
 *
 * @author yash verma
 */
public class lrucache {
    static HashSet<Integer>map;
    static Deque<Integer>dq;
    static int size;
    lrucache(int s)
    {
        dq=new LinkedList<>();
        map=new HashSet<>();
       size=s;
    }
    public void refer(int x)
    {
        if (!map.contains(x)) { 
            if (dq.size() == size) { 
                int last = dq.removeLast(); 
                map.remove(last); 
            } 
        } 
        else{
              int index = 0, i = 0; 
            Iterator<Integer> itr = dq.iterator(); 
            while (itr.hasNext()) { 
                if (itr.next() == x) { 
                    index = i; 
                    System.out.println(index+"+");
                    break; 
                } 
                i++; 
            } 
            dq.remove(index); 
        } 
        dq.push(x); 
        map.add(x); 
    } 
    public void display() 
    { 
        Iterator<Integer> itr = dq.iterator(); 
        while (itr.hasNext()) { 
            System.out.print(itr.next() + " "); 
        } 
    }
    public static void main(String args[])
    {
        lrucache l=new lrucache(3);
        l.refer(1);
        l.refer(2);
        l.refer(3);
        l.refer(1);
        l.refer(4);
        l.refer(5);
        l.display();
    }
}
