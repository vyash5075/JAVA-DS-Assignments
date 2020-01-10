import java.util.*;
/**     input:6
 *             2,3,4,5,6,8
 *    output:   two no. are
                [2, 4, 6]
                [3, 5, 8]
                result604
 *
 * @author yash verma
 */
public class minimum_no_formation {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("eter the no. of entries");
        int n =sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        minimum(arr);
    }
    public static void minimum(int arr[])
    {
        ArrayList<Integer>ar=new ArrayList<>();
        ArrayList<Integer>ar1=new ArrayList<>();
        Arrays.sort(arr);
        int a=0;
        int b=0;
        for(int i=0;i<arr.length;i++)
        {
            if(i%2==0)
            {
                a=a*10+arr[i];
                ar.add(arr[i]);
                
            }
            else{
                 b=b*10+arr[i];
                ar1.add(arr[i]);
               
            }
        }
        
        System.out.println("two no. are");
        
       System.out.println(ar);
        System.out.println(ar1);
        int result= a+b;
        System.out.println("result"+result);
    }
}