import java.util.*;
public class addition_without_operator {
    public static int add(int num1,int num2) 
    {
        int h;
        while(num2!=0)
        {
          h=num1 & num2;                  // and gate applied btw binary of num1 and num2 
          num1=num1 ^ num2;               // xor gate applied btw num1 and num 2 and value store to num 1
          num2=h << 1;         // right shift of num2 by 1
        }
        return num1;              // here num2 is zero cz of right shift and num1 would be the final result
    }
public static void main(String args[])
{
    Scanner sc=new Scanner(System.in);
    System.out.println("enter two no.");
    int num1=sc.nextInt();
    int num2=sc.nextInt();
    int result=add(num1,num2);
    System.out.println(num1+" + " +num2+" = " + result); 
}
}
