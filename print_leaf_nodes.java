import java.util.*;
public class print_leaf_nodes {
class node{
    int data;
    node left;
    node right;
    node(int d)
    {
        this.data=d;
        node left=null;
        node right=null;
    }
}
static node root;
public print_leaf_nodes()
{
    root=null;
}
public print_leaf_nodes(int key)
{
    root=new node(key);
}
public node insert(node root,int data)
{
    node temp=new node(data);
    if(root!=null)
    {
        if(data<root.data)
    {
        insert(root.left,data);
        if(root.left==null)
        {
            root.left=temp;
        }
    }
        else{
            insert(root.right,data);
            if(root.right==null)
            {
                root.right=temp;
            
            }
            
            }
        return root;
            
        }
    return root;
    
}

public static void preorder(node root)
{
    if(root==null)
    {
        return;
    }
    else
    {
       System.out.println(root.data);
      
       preorder(root.left);
       preorder(root.right);
       
    }
    return;
}
public void getleafnodes(node root)
{
    if(root==null)
    {
        return;
    }
    else
    {
        if(root.left==null&&root.right==null)
        {
            System.out.println(root.data);
            
        }
        else
        {
            getleafnodes(root.left);
            getleafnodes(root.right);
        }
    }
}
    
    
  public static void main(String args[])
  {
   print_leaf_nodes bst=new print_leaf_nodes(50);
    bst.insert(bst.root,30);
    bst.insert(bst.root,56);
    bst.insert(bst.root,86);
        bst.insert(bst.root,59);
        
    bst.insert(bst.root,20);
        bst.insert(bst.root,35);
            bst.insert(bst.root,33);
    System.out.println("bst in preorder");
    preorder(bst.root);
    System.out.println("leaf nodes are");
    bst.getleafnodes(bst.root);
    
    
    
    
  }
}

