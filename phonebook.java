import java.util.*;
public class phonebook {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        HashMap<String,Integer>hm=new HashMap<String,Integer>();
        System.out.println("enter the no. pf entries");
        int n=sc.nextInt();
        for(int i=0;i<n;i++)
        {
             String name=sc.next();
             int no=sc.nextInt();
             hm.put(name, no);
        }
        System.out.println("enter the no. of queries");
        int t=sc.nextInt();
        for(int i=0;i<t;i++)
        {
             System.out.println("enter name to find no.");
        String a=sc.next();
        if(hm.containsKey(a))
        {
            System.out.println(a+"="+hm.get(a));
        }
        else{
            System.out.println("not found");
        }
        } 
    }
}
