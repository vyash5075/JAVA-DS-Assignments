import java.util.*;
public class merge_sorted-arrays {
   public static void merge(int arr[],int arr2[])
    {
        int i=0;
        int j=0;
        int k=0;
        int arr3[]=new int[arr.length+arr2.length];
        while(i<arr.length&&j<arr2.length)
        {
            if(arr[i]<arr2[j])
            {
                arr3[k]=arr[i];
                i++;
                k++;
            }
            else{
                arr3[k]=arr2[j];
                j++;
                k++;
            }
        }
        while(i<arr.length)
        {
            arr3[k]=arr[i];
            i++;k++;
        }
        while(j<arr2.length)
        {
            arr3[k]=arr2[j];
            j++;k++;
        }
        for(int l=0;l<arr3.length;l++)
        {
            System.out.println(arr3[l]);
        }
    }
    public static void main(String args[])
    {
        ques46 q=new ques46();
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of 1st array");
        int m=sc.nextInt();
        int arr[]=new int[m];
        for(int i=0;i<m;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.println("enter the size of second array");
        int n=sc.nextInt();
        int arr2[]=new int[n];
        for(int j=0;j<n;j++)
        {
            arr2[j]=sc.nextInt();
        }
        System.out.println("enter the size of second ");
         q.merge(arr,arr2);
        
    }
}
