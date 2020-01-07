import java.util.*;
/**
 *
 * @author yash verma
 */
public class seating {
    public static int seating(int arr[])
    {
        int rows=arr[0]/2;
        int cols=2;
        int start=1;
        int flag=0;
        int arr2[][]=new int[rows][cols];
        int arr3[][]=new int[rows][cols];   // build temporary  array for maintaing the seats  
        for(int i=0;i<rows;i++)
        {
            for(int j=0;j<cols;j++)
            {
             arr2[i][j]= start;
             start++;
             arr3[i][j]=0;
            }
        }
        
      /*  for(int i=0;i<rows;i++)
        {
            for(int j=0;j<cols;j++)
            {
                System.out.print(arr2[i][j]+" ");
            }
        }
        */
        System.out.println(" "); 
        for(int i=1;i<arr.length;i++)
        {
            for(int j=0;j<rows;j++)
            {
                for(int k=0;k<cols;k++)
                {
                    if(arr[i]==arr2[j][k])
                    {
                        arr3[j][k]=1;
                    }
                }
            }
        }
       /*  for(int i=0;i<rows;i++)
        {
            for(int j=0;j<cols;j++)
            {
                System.out.print(arr3[i][j]+ " ");
            }
        }
        */ 
        for(int i=0;i<rows;i++)
        {
            for(int j=0;j<cols;j++)
            {
              
                if(i==rows-1)
                {
                    if(j==0)
                    {
                        if(arr3[i][j]==arr3[i][j+1])
                        {
                            flag++;
                        }
                        else{
                            
                        }
                    }
                }
                if(arr2[i][j]%2!=0&&i!=rows-1)
                {
                   if(arr3[i][j]==arr3[i][j+1]&&arr3[i][j]==arr3[i+1][j])
                   {
                       flag+=2;
                   }
                   else if(arr3[i][j]==arr3[i][j+1]||arr3[i][j]==arr3[i+1][j])
                   {
                       flag++;
                   }  
                }
                 if(arr2[i][j]%2==0&& i!=rows-1)
                {
                   if(arr3[i][j]==arr3[i+1][j])
                   {
                       flag++;
                   }
                   
                }   
            }
        }    
        return flag;
    }
    public static void main(String args[])
   {
    Scanner sc=new Scanner(System.in);
  //  System.out.println("enter the no. of entries"); 
    int arr[]={12,2,6,7,11};
    int m=seating(arr);
    //System.out.println(" ");
    System.out.println("total no. of pairs formed="+ m);
   }  
}
