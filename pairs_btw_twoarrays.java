import java.util.*;
public class subarraysum {
    public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    System.out.println("enter size of array1");
    int n=sc.nextInt();
    int arr[]=new int[n];
     System.out.println("enter size of array2");
    int m=sc.nextInt();
    int arr1[]=new int[m];
    for(int i=0;i<n;i++)
    {
        arr[i]=sc.nextInt();
    }
    System.out.println("enter elements of second array");
    for(int i=0;i<m;i++)
    {
        arr1[i]=sc.nextInt();
    }
    System.out.println("enter  sum no.");
    int k=sc.nextInt();
    for(int i=0;i<n;i++)
    {
        for(int j=0;j<m;j++)
        {
            if(arr[i]+arr1[j]==k)
            {
                System.out.print(arr[i]+","+arr1[j]);
                 System.out.println("");
            }
           
        }
    }
    }
}
