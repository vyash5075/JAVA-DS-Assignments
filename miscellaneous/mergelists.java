import java.util.*;
/**
 *
 * @author yash verma
 */
public class mergelists {
   public static void main(String args[])
   {
       Scanner sc=new Scanner(System.in);
       System.out.println("enter the no. of inputs");
      int n=sc.nextInt();
     sc.nextLine();
      ArrayList<Integer>al=new ArrayList<>();
      for(int i=0;i<n;i++)
      {
        String s=sc.nextLine();
       String arr[]=s.split("\\s+");
       
       for(int j=0;j<arr.length;j++)
       {
           if(!arr[j].isEmpty())
           {
           System.out.println(arr[j]);
           al.add(Integer.parseInt(arr[j]));
           }
       }  
      } 
     Collections.sort(al);  
    System.out.println(al);
   }
   
   