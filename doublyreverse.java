import java.util.*;
/**
 *
 * @author yash verma
 */
public class doublyreverse {
    static class node{
     int data;
     node prev;
     node next;
     node(int d)
     {
         this.data=d;
         node next=null;
         node prev=null;
     }
    }
    static node head;
    public static node insert(node head,int data)
   {
        node temp=new node(data);
       
        if(head==null)
        {
           head=temp;
        }
        else{
            node p=head;
            while(p.next!=null)
            {
                p=p.next;
            }
            p.next=temp;
        }
        return head;
        
    }
    public static node reverse(node head)
    {
        node p=null;
        node q=null;
        node temp=head;
        while(temp!=null)
        {
            p=temp.next;
            temp.next=q;
            q=temp;
            temp=p;
        }
        head=q;
        return head;
    }
    public static void display(node head)
   {
       node p=head;
       while(p!=null)
       {
           System.out.print(p.data+"->");
           p=p.next;
       }
       System.out.println("");
   }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of list");
        int n=sc.nextInt();
                System.out.println("enter elements");

        for(int i=0;i<n;i++)
        {
          head=insert(head,sc.nextInt());
        }
        display(head);
       head= reverse(head);
       display(head);
    }
}
