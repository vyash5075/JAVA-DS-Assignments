/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package array;
import java.util.*;
/**
 *
 * input: 6
 *    [ 8,12,11,4,2,1]
 * b=2;
 * output: 16
 */
public class hackerrank2 {
    public static int evaluate(int b,int arr[])
    {
        int p=b;
        Arrays.sort(arr);
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==p)
            {
                p=p+p;
                System.out.println(b); 
            }
        }
        return p;
    }
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int arr[]=new int[n];
      for(int i=0;i<n;i++)
      {
          arr[i]=sc.nextInt();
      }
      System.out.println("enter baseno.");
      int b=sc.nextInt();
      int a= evaluate(b,arr);
      System.out.println(a);
    }
}
