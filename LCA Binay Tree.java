package testTree;
import java.util.*;
class Node{
	int data;
	Node left;
	Node right;
	Node(int data){
		this.data=data;
		this.left=null;
		this.right=null;
	}
}
public Class A{	
	Node lca(Node root, Node n1,Node n2)
	{
		if(root==null)
		    return null;
		Node left=lca(root.left,n1,n2);
		Node right=lca(root.right,n1,n2);
		if(root==n1 || root==n2){
		    if(left!=null || right!=null)
		        return root;
		    return root;
		}
		if(left!=null && right!=null)
		    return root;
		if(left!=null)
		    return left;
		if(right!=null)
		    return right;
		return null;
	}
}
public class LCA {
	
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		Node root=insert();
		Node x=root;
		Node y=root.left;
		
		if(x==y)
			System.out.println(y.data);
		else{
			A obj=new A();
			Node ans=obj.lca(root,x,y)
			if(ans!=null)
				System.out.println(ans.data);
			else
				System.out.println("Node not Found");	
		}	
	}
	public static Node insert() {
		Scanner s=new Scanner(System.in);
		int t=s.nextInt();
		if(t==-1) {
			return null;
		}
		Node root=new Node(t);
		System.out.print("left node of"+ root.data);
		root.left=insert();
		System.out.print("right node of"+ root.data);
		root.right=insert();
		return root;
	}
	
	

	

}
