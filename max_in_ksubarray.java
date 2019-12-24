import java.util.*;
//input 9   3
//  1 2 3   4 5 2 3 6 
// output 3 3 4 5 5 5 6 
public class max_in_ksubarray {
    public static void maxsubarray(int arr[],int n,int m)
    {

        for(int i=0;i<=n-m;i++)
        {
            int max=arr[i];
            for(int j=0;j<m;j++)
            {
                if(max<arr[i+j])
                {
                    max=arr[i+j];
                }
            }
             System.out.print( max+" ");
        }
    }
    public static void main (String args[]){
    Scanner sc=new Scanner(System.in);
    System.out.println("enter the size of array");
    int n=sc.nextInt();
    int arr[]=new int[n];
    System.out.println("enter elements");
    for(int i=0;i<n;i++)
    {
        arr[i]=sc.nextInt();
    }
    System.out.println("enter the max. size of sub array");
    int m=sc.nextInt();
    maxsubarray(arr,n,m);
}    
}

