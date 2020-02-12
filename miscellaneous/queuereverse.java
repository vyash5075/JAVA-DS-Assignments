/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package array;
import java.util.*;
/**     n=6     
 *   input 1,2,3,4,5,6
 *              3
 *    output 3,2,1,4,5,6
 * @author yash verma
 */
public class queuereverse {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        Queue <Integer>q1=new LinkedList<>();
        for(int i=0;i<n;i++)
        {
            q1.add(sc.nextInt());
        }
        System.out.println("enter the no. of elements");
        int m=sc.nextInt();
        Stack<Integer>s=new Stack<>();
        for(int i=0;i<m;i++)
        {
            s.push(q1.peek());
            q1.remove();
        }
            Queue<Integer>q2=new LinkedList<>();
            while(!s.isEmpty())
            {
                q2.add(s.pop());
            }
            while(!q1.isEmpty())
            {
                q2.add(q1.peek());
                q1.remove();
            }
            System.out.println(q2);
        }
        
    }

