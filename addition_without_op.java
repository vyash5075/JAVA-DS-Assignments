import java.util.*;
public class addition_without_op {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int num1=sc.nextInt();
        int num2=sc.nextInt();
        while(num1!=0)
        {
            num2++;
            num1--;
        }
        System.out.println("result="+num2);
    }
}
