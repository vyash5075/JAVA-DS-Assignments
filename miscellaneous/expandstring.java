/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package strings;
import java.util.*;
/**    
 *      input: 1-4,5,6-10,11,12-15
 *         output:1,2,3,4,5,6,7,,8,910,11,12,13,14,15
 * @author yash verma
 */
public class expandstring {
    static ArrayList<Integer>al=new ArrayList<>();
    
    public static void expand(String arr[],int n)
    {
        for(int i=0;i<n;i++)
        {
            String s=arr[i];
            String ar[]=s.split("\\-");
            if(ar.length==1)
            {
                al.add(Integer.parseInt(s));
            }
            else if(s.length()>=3||s.length()==4)
            {
                expr(s);
            } 
        }
        return;
    }
    public static void expr(String s)
    {
        String arr2[]=s.split("\\-");
        int a=Integer.parseInt(arr2[0]);
        int b=Integer.parseInt(arr2[1]);
        for(int k=a;k<=b;k++)
                {
                 al.add(k);
                }
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        String arr[]=s.split(",");
        int n=arr.length;
       expand(arr,n);
       System.out.println(al);
    }
}
