import java.util.*;
public class binary_tree {
    static class node{
        int data;
        node left;
        node  right;
        node(int d)
        {
            this.data=d;
            left=null; right=null;
        }
    }
  public static boolean checkbst(node root, node left,node right)
  {
      if(root==null)
      {
          return true;
      }
      if(left!=null&&root.data<=left.data)
      {
          return false;
      }
      if(right!=null&&root.data>=right.data)
      {
          return false;
      }
      else{
         return  checkbst(root.left,left,root)&&checkbst(root.right,root,right);
      }
  }
    public static void main(String args[])
    {
        node root=new node(40);
        root.left=new node(20);
        root.right=new node(50);
        root.left.left=new node(10);
        root.left.right=new node(30);
       root.right.right=new node(56);
        root.left.right.left=new node(44);
    boolean c=checkbst(root,null,null);
        if(c==true)
        {
            System.out.println("bst tree");
        }
        else
        {
         System.out.println("not a bst tree");   
        }
    }
}
