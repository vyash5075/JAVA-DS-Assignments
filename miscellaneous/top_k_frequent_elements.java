package miscellaneous;
import java.util.*;

/**
 *
 * @author yash verma
 */
public class top_k_frequent_elements {
    
    public static void frequent(HashMap<Integer,Integer>hm,int k)
            
    {
        ArrayList<Integer>al=new ArrayList<>();  
        int key[]=new int [hm.size()];
          int value[]=new int [hm.size()];
          int p=0;
        for(Map.Entry e:hm.entrySet())
     {
        key[p]=(int)e.getKey();
        value[p]=(int)e.getValue();
        p++;
     }
        int temp;
      int temp2;
     for(int i=0;i<key.length-1;i++)
     {
         for(int j=i+1;j<key.length;j++)
         {
             if(value[i]<value[j])
             {
                 temp=key[i];
                 key[i]=key[j];
                 key[j]=temp;
                 
                 temp2=value[i];
                 value[i]=value[j];
                 value[j]=temp2;  
             }
         }
     }
     for(int i=0;i<key.length;i++)
     {
         System.out.println(key[i]+":"+value[i]);
     }
      for(int l=0;l<k;l++)
      {
         al.add(key[l]);
      }
      System.out.println(al);
    }
 public static void main(String args[])
 {
     Scanner sc=new Scanner(System.in);
     int n=sc.nextInt();
     int arr[]=new int[n];
     for(int i=0;i<n;i++)
     {
         arr[i]=sc.nextInt();
     }
     HashMap<Integer,Integer>hmap=new HashMap<>();
     for(int i=0;i<n;i++)
     {
         if(hmap.containsKey(arr[i]))
         {
             hmap.put(arr[i],hmap.get(arr[i])+1);
         }
         else{
             hmap.put(arr[i],1);
         }
     }
     int uniquelements=hmap.size();
//     System.out.println(uniquelements);
     System.out.println("enter the value of  k");
     int k=sc.nextInt();
     if(k>uniquelements)
     {
         System.out.println("invalid");
     }
     else{
         frequent(hmap,k);
     } 
 }
}
