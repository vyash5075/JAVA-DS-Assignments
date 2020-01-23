import java.util.*;
/**   input:abc
 *    output:abc,acb,bca,bac,cab,cba
 *
 * @author yash verma
 */
public class generatepermutation {
    public static String swap(String a,int i,int j)
    {
        char arr[]=a.toCharArray();
        char ch;
        ch=arr[i];
        arr[i]=arr[j];
        arr[j]=ch;
        return new String(arr);
    }
    public static void generatepermutations(String str,int start,int end)
    {   
        if(start==end-1)
        {
            System.out.println(str);
        }
        else  
        {  
            for (int i = start; i < end; i++)  
            {
                str = swap(str,start,i);  
                generatepermutations(str,start+1,end);  
                str = swap(str,start,i);  
            }  
        }    
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        int len=str.length();
        generatepermutations(str,0,len);
    }
}
