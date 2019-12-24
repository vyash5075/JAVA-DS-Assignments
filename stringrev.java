import java.util.*;
//input= ab$c
//output=cb$a
public class stringrev {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String s= sc.next();
        char arr[]=s.toCharArray();
        int k=0;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]>=65&&arr[i]<=90||arr[i]>=97&&arr[i]<=122)
            {
                k++;
                //continue;
            }
        }
        char arr1[]=new char[k];
        char arr2[]=new char[s.length()];
        int j=0;
        for(int i=0;i<arr.length;i++)
        {
              if(arr[i]>=65&&arr[i]<=90||arr[i]>=97&&arr[i]<=122)
              {
                  arr1[j]=arr[i];
                  j++;
              }
              else
              {
                  arr2[i]=arr[i];
              }
        }
        int g=arr1.length-1;
        for(int i=0;i<arr2.length;i++)
        {
            if(arr2[i]=='\0')
            {
                arr2[i]=arr1[g];
                g--;
            }
        }
        for(int i=0;i<arr2.length;i++)
        {
            System.out.print(arr2[i]);
        }
    }
}
