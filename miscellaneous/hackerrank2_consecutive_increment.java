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
public class hackerrank2_consecutive_increment {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
       
        String s=sc.nextLine();
        
          String arr[]=s.split("\\s+");
          int n=arr.length;
          int arr1[]=new int[n];
          for(int i=0;i<n;i++)
          {
              arr1[i]=Integer.parseInt(arr[i]);
          }
//           for(int i=0;i<n;i++)
//          {
//            System.out.println(arr1[i]);
//          }
           for(int i=0;i<n-1;i++)
           {
               int flag=0;
               for(int j=i+1;j<n;j++)
               {
                   if(arr1[i]==arr1[j])
                   {
                       arr1[j]=arr1[j]+1;
                       flag=1;
                   }
                  
               }
                if(flag==1)
                {
                  for(int j=0;j<n;j++)
           {
               System.out.print(arr1[j]+" ");
              
           }  
                }
                System.out.println();
           }
     
    }
}
