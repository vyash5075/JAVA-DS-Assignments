import java.util.*;
/**
 
 
 Input : n = 3
  2   7   6
  9   5   1
  4   3   8
Output : Magic matrix
Explanation:In matrix sum of each
row and each column and diagonals sum is 
same = 15.

Input : n = 3
  1   2   2 
  2   2   1
  2   1   2
Output : Not a Magic Matrix
Explanation:In matrix sum of each
row and each column and diagonals sum is
not same.
 */
public class magic_square {
    public static boolean magicsquare(int arr[][],int r,int c)
    {
     int forwarddiagonalsum=0;
     int backwarddiagonalsum=0;
     
     
     for(int i=0;i<r;i++)
     {
        forwarddiagonalsum=forwarddiagonalsum+arr[i][i];
     }
     for(int i=0;i<r;i++)
     {
      backwarddiagonalsum=backwarddiagonalsum+arr[i][r-i-1];   
     }
     if(backwarddiagonalsum!=forwarddiagonalsum)
     {
         return false;
     }
     
     for(int i=0;i<r;i++)
     {int rowsum=0;
         for(int j=0;j<c;j++)
         {
             rowsum=rowsum+arr[i][j];
         }
         if(rowsum!=forwarddiagonalsum)
         {
             
             return false;
         }
         
     }
     
     for(int i=0;i<r;i++)
     {int colsum=0;
         for(int j=0;j<c;j++)
         {
             colsum=colsum+arr[j][i];
         }
         if(colsum!=forwarddiagonalsum)
         {
             
             return false;
         }
         
     }
     
     
     return true;
    }
   public static void main(String args[])
   {
       Scanner sc=new Scanner(System.in);
       System.out.println("enter no. of rows");
       int r=sc.nextInt();
       System.out.println("enter no. of columns");
       int c=sc.nextInt();
      int arr[][]=new int[r][c];
      for(int i=0;i<r;i++)
      {
          for(int j=0;j<c;j++)
          {
              arr[i][j]=sc.nextInt();
              
          }
      }
       if(magicsquare(arr,r,c))
       {
            System.out.println("Magic Square"); 
       }
        else
            System.out.println("Not a magic Square");
       }
       
   }
