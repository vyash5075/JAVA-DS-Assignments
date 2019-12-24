import java.util.*;
public class highestprimefactor {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter no.");
        int n=sc.nextInt();
        int primefactor=0;
        int i=2;
        while(n!=0)
        {
            if(n%i!=0)
            {
                i=i+1;
            }
            else{
                primefactor=n;
                n=n/i;
                if(n==1)
                {
                    System.out.println(primefactor);
                    break;
                }
            }
        }
        
    }
}
