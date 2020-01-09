public class ques61 {
    public static void unsortedlength(int arr[])
    {
        int len=arr.length;
        int i=0;
        int j=len-1;
        int a=0;
        int b=0;
        for( i=0;i<len-1;i++)
        {
            if(arr[i]>arr[i+1])
            {
               a=i;
               break;
            }
        }
        for(j=len-1;j>0;j--)
        {
            if(arr[j-1]>arr[j])
            {
                b=j;
                break;
            }
        }
        System.out.println(a + " to"+ b);
        }
    
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the no. of ebtries in array");
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
            
        }
        unsortedlength(arr);
    }
}
