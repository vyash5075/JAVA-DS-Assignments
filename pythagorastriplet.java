import java.util.*;
/**
 *
 * @author yash verma
 */
public class pythagorastriplet {
    public static boolean pythagorastriplet(int arr[],int n)
    {
        Arrays.sort(arr);
         for(int i=n-1;i>=2;i--)
         {
             int l=0;
             int r=i-1;
             while(l<r)
             {
             if(arr[l]+arr[r]<arr[i])
             {
                 l++;
             }
             if(arr[l]+arr[r]>arr[i])
             {
                 r--;
             }
             if(arr[l]+arr[r]==arr[i])
             {
                return true;
             }
         }
         }
         return false;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the no. of testcases");
        int testcases=sc.nextInt();
         while(testcases!=0)
        {
        System.out.println("no. of entries in array");
        int n=sc.nextInt();
        int arr[]=new int[n];
       for(int i=0;i<n;i++)
       {
           int m=sc.nextInt();
           arr[i]=m*m;
       }
       
       boolean b=pythagorastriplet(arr,n);
       if(b==true)
       {
           System.out.println("yes");
       }
       else{
           System.out.println("no");
       }
          testcases--;  
        }
    }
}
