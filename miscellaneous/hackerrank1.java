import java.util.*;
public class hackerrank1 {
   static String s;
    static String s1="";
 hackerrank1 (String str)
 {
     this.s=str;
 }
  public static String getname()
  {
    char  arr[]= s.toCharArray();
    for(int i=0;i<arr.length;i++)
    {
        if(arr[i]=='$'|| arr[i]=='#')
        {
            s1+=" "+"";
        }
        else{
            s1+=arr[i]+"";
        }
    }
    s1.trim();
    String s2[]=s1.split("\\s+");
    return s2[0];
  }
  public static double getquantity()
  {
     s1.trim();
    String s2[]=s1.split("\\s+");
    double p=Double.parseDouble(s2[1]);
    return p;
 } 
  public static double getprice()
  {
     s1.trim();
    String s2[]=s1.split("\\s+");
    double p=Integer.parseInt(s2[2]);
    return p;
 } 
  public static void main(String args[])
  {
      Scanner sc=new Scanner(System.in);
      String  s=sc.nextLine();
      hackerrank1 p=new hackerrank1(s);
     System.out.println("item name: "+getname ());
     System.out.println("item quantity: "+getquantity());
     System.out.println("item quantity: "+getprice ()); 
    }
}
