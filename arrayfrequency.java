import java.util.*;
public class arrayfrequency {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of array");
        int n =sc.nextInt();
        int arr[]=new int[n];
        int dup[]=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
            dup[i]=-1;
        }
        for(int i=0;i<arr.length;i++)
        {
            int count=1;
            for(int j=i+1;j<arr.length;j++)
            {
                if(arr[i]==arr[j])
                {
                    count++;
                    dup[j]=0;
                }
            }
            if(dup[i]!=0)
            {
                dup[i]=count;
            }
        }
        System.out.println("frequency of each elelemnt is");
        
           for(int i=0;i<n;i++)
           {
               if(dup[i]!=0)
               {
                   System.out.println(arr[i]+"comes"+dup[i]+"times");
               }
           }
    }
}
