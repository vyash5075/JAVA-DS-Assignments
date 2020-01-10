import java.util.*;
/** Minimum number of bracket reversals needed to make an expression balanced |
 *
 * @author yash verma
 */
public class parenthesis_match_steps2 {
    public static int countMinReversals(String str)
    {
        int len=str.length();
        if(len%2!=0)
        {
            return -1;
        }
       Stack<Character>s=new Stack<>();
       for(int i=0;i<len;i++)
       {
           if(str.charAt(i)=='}'&&!s.empty())
           {
            if(s.peek()=='{')
            {
                s.pop();
            }
            else{
                s.push(str.charAt(i));
            }
           }
           else{
               s.push(str.charAt(i));
           }
       }
       int new_len=s.size();
       int m=0;
       while(!s.empty()&&s.peek()=='{')
       {
           s.pop();
           m++;
       }
        // return ceil(m/2) + ceil(n/2) which is 
        // actually equal to (m+n)/2 + n%2 when 
        // m+n is even. 
        return (new_len/2 + m%2); 
    }
    public static void main(String args[])
    {
        String str="}}{{";
        System.out.println(countMinReversals(str)); 
    }
}
