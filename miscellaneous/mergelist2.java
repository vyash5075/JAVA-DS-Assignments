/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package array;
import java.util.*;
/**
 *
 * @author yash verma
 */
public class mergelist2 {
    /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

   public static void main(String args[])
   {
       Scanner sc=new Scanner(System.in);
       System.out.println("enter the no. of inputs");
      int n=sc.nextInt();
      sc.nextLine();
      ArrayList<Integer>al=new ArrayList<>();
      for(int i=0;i<n;i++)
      {
        String s=sc.nextLine();
       String arr[]=s.split("\\s+");
       
       for(int j=0;j<arr.length;j++)
       {
          // System.out.println(arr[j]);
           al.add(Integer.parseInt(arr[j]));
       }  
      } 
     Collections.sort(al);
     System.out.print(al+"->");
     int count=0;
     int sum=0;
     for(int i=0;i<al.size();i++)
     {
         sum=sum+al.get(i);
         count++;
     }
     System.out.println("total elements"+count);
     int total=sum/5;
     if(total%2==0)
     {
         System.out.println("even");
     }
     else
     {
        System.out.println("even");
     }
   }
}
