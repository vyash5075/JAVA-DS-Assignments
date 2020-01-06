import java.util.*;
/**
 *   input:{4, 4, 1, 1, 1, 3}
 *   output:4431
 * @author yash verma
 */
public class max_no_formation_divby3 {
    public static boolean largest3multiple(int arr[])
    {
        int n=arr.length;
        int sum = 0; 
        for (int i = 0; i < arr.length; i++)  
        { 
            sum += arr[i]; 
        } 
         Arrays.sort(arr);
        if(sum%3==0)
        {   
            return true;
        }
        
        else{
            int remainder=sum%3;
                if(remainder==1)
                {
                int temparr[]=new int[2];
                temparr[0]=-1;
                temparr[1]=-1;
                for(int i=0;i<n;i++)
                {
                    if(arr[i]%3==1)
                    {
                        removeandprintresult(arr,n,i,-1);
                        return true; 
                    }
                    if(arr[i]%3==2)
                    {
                        if(temparr[0]==-1)
                        {
                         temparr[0]=i;   
                        }
                        else if( temparr[1]==-1){
                            temparr[1]=i;
                        }
                    }
                }
                if(temparr[0]!=-1&&temparr[1]!=-1)
                {
                   removeandprintresult(arr,n ,temparr[0],temparr[1]);
                   return true;
                }
                }
                else if(remainder==2)
                {
                    int temparr1[]=new int[2];
                    temparr1[0]=-1;
                    temparr1[1]=-1;
                    for(int i=0;i<n;i++)
                    {
                        if(arr[i]%3==2)
                        {
                            removeandprintresult(arr, n, i, -1);
                            return true;
                        }
                        if(arr[i]%3==1)
                        {
                            if(temparr1[0]==-1)
                            {
                                temparr1[0]=i;
                            }
                            else if(temparr1[1]==-1)
                            {
                               temparr1[1]=i;
                            }
                        }
                    }
                    if(temparr1[0]!=-1&&temparr1[1]!=-1)
                    {
                      removeandprintresult(arr, n, temparr1[0], temparr1[1]);
                      return true;
                    }
                }
        }
        System.out.print("Not possible"); 
        return false; 
       
        
    }
    public static void removeandprintresult(int arr[],int n,int ind1,int ind2)
    { 
        for (int i = n - 1; i >= 0; i--) 
        { 
            if (i != ind1 && i != ind2)  
            { 
                System.out.print(arr[i]); 
            } 
        } 
    } 
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the no. of entries");
        int n=sc.nextInt(); 
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        largest3multiple(arr);
    }
}
