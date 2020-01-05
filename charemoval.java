//input: "apbpleeeef,a,ab,abcg,b,c,dog,e,efg,zzz"
// output: 8

package strings;
import java.util.*;
public class charemoval {
    public static int remove(String str)
    {
        String arr[]=str.split(",");
        int len=arr.length;
        int count=10900;
        int l1=arr[0].length();
        int count1=0;
        for(int i=1;i<len;i++)
        {
            int currlen=arr[i].length();
            char arr1[]=arr[0].toCharArray();
            char arr2[]=arr[i].toCharArray();
            int temp=0;
            if(l1>=currlen)
            {
                for(int j=0;j<currlen;j++)
                {
                    for(int k=0;k<l1;k++)
                    {
                        if(arr1[k]==arr2[j])
                        {
                            temp++;
                            break;
                        }
                    }
                }
                if(temp==currlen)
                {
                    count1=l1-currlen;
                }
            }
            if(count1<count)
            {
                count=count1;
            }
        }
        return count;    
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner (System.in);
        System.out.println("enter string");
        String str=sc.next();
        int n= remove(str);
        System.out.print(n);
    }
}
