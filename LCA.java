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
public class LCA {
	
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		Node root=insert();
		Node x=root;
		Node y=root.left;
		if(x==y)
			System.out.println(y.data);
		else{
			Node ans=lca(root,x,y)
			if(ans!=null)
				System.out.println(ans.data);
			else
				System.out.println("Nodes not found");	
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
	public static Node lca(Node root, Node x,Node y) {
		if(root==null || root==x || root==y)
			return root;
		if(root.data<x.data && root.data<y.data)
			return lca(root.right,x,y);
		else if(root.data>x.data && root.data>y.data)
			return lca(root.left,x,y);
		else {
			Node left=lca(root.left,x,y);
			Node right=lca(root.right,x,y);
			if(left!=null && right!=null)
				return root;
			if(left==null && right==null)
				return null;
			if(right==null)
				return left;
			return right;
		}
	}

	

}
