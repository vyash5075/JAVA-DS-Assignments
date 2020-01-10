import java.util.*;
/**
 *    Minimum number of bracket reversals needed to make an expression balanced |
 * @author yash verma
 */
public class paranthesis_match_steps {
    static int countMinReversals(String str){
      int len = str.length();
      if(len%2!=0)
      {
          return -1;
      }
      int open=0;
      int close=0;
      for(int i=0;i<len;i++)
      {
          if(str.charAt(i)=='{')
          {
             open++; 
          }
          else{
              if(open==0)
              {
                  close++;
              }
              else{
                  open--;
              } 
             
          }
      }
      int ans=(close/2)+(open/2);
      close=close%2;
      open=open%2;
      if(close!=0)
      {
          ans=ans+2;
      }
      return ans;
    }
      
    public static void main(String args[])
    {
        String str="}}{{";
        System.out.println(countMinReversals(str)); 
    }
}
