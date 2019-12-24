import java.util.*;
public class spiralmatrix {
 public static void main(String args[])
 {
     Scanner sc=new Scanner(System.in);
     System.out.println("enter the no. of rows");
     int n=sc.nextInt();
     System.out.println("enter the no. of columns");
     int m=sc.nextInt();
     int arr[][]=new int[n][m];
     for(int i=0;i<n;i++)
     {
         for(int j=0;j<m;j++)
         {
             arr[i][j]=sc.nextInt();
         }
     }
     int rows=0;
     int columns=0;
     while(rows<n&&columns<m)
     {
         for(int i=0;i<m;i++)
         {
             System.out.print(arr[rows][i]+" ");
         }
         rows++;
         for(int i=rows;i<n;i++)
         {
             System.out.print(arr[i][n-1]+" ");
         }
         m--;
         if(rows<n)
         {
             for(int i=m-1;i>=columns;i--)
             {
                 System.out.print(arr[n-1][i]+" ");
             }
             n--;
         }
         if(columns<m)
         {
             for(int i=n-1;i>rows;i--)
             {
                 System.out.print(arr[i][columns]+" ");
             }
             columns++;
         }
     }
 }
}
