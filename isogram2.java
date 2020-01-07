import java.util.*;
/**
 *
 * @author yash verma
 */
public class isogram2 {
    public static boolean isogram(String str)
    {
        int flag=0;
        char arr[]=str.toCharArray();
        Arrays.sort(arr);
        int len=arr.length;
        for(int i=0;i<len-1;i++)
        {
            if(arr[i]==arr[i+1])
            {
                return false;
            }
        }
        return true;
}
     public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the string");
        String s=sc.next();
        s=s.toLowerCase();
        if(isogram(s))
        {
            System.out.println("yes");
        }
        else{
            System.out.println("no");
        }
}
}
