public class subarrayindex {
    public static void subarray(int arr[],int n,int m)
    {
        int sum_total;
        int flag=0;
        for(int i=0;i<n;i++)
        {
         sum_total=0;   
            for(int j=i;j<n;j++)
            {
                sum_total=sum_total+arr[j];
            
              if(sum_total==m)
            {
                int k=j;
                System.out.println(m+"between -> ["+i+","+k+"]");
                flag++;
            }
              if(sum_total>m||j==n)
              
                  break;
            }  
        }
        if(flag==0)
        {
            System.out.println("no subarray found");
            
        }
        else
        {
            
        }
    }
    public static void main(String args[])
    {
        
        Scanner sc=new Scanner (System.in);
        System.out.println("enter the size of array");
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
            
        }
        System.out.println("enter sum");
        int m=sc.nextInt();
        subarray(arr,n,m);
    }
}
