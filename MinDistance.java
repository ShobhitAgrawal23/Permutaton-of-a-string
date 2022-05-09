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
class ExsitPair{
	 int dist;
	 boolean pairFound;
	 ExsitPair(int d,boolean p){
		 dist=d;
		 pairFound=p;
	 }
	}
class FindDistance{
	 ExsitPair minDistance(Node root, Node x,Node y) {
		if(root==null)
			return new ExsitPair(-1,false);
		ExsitPair left=minDistance(root.left,x,y);
		ExsitPair right=minDistance(root.right,x,y);
		if(root==x || root==y) {
			if(left.dist!=-1 || right.dist!=-1)
				return new ExsitPair(Math.max(left.dist,right.dist),true);
			return new ExsitPair(1,false);
		}
		if(left.dist!=-1 && right.dist!=-1)
			return new ExsitPair(left.dist+right.dist,true);;
		if(left.dist!=-1 || right.dist!=-1)
			if(left.pairFound==true)
				return new ExsitPair(Math.max(left.dist,right.dist),true);
			else
				return new ExsitPair(Math.max(left.dist,right.dist)+1,false);
		
		return new ExsitPair(-1,false);
	}
}
public class MinDistance {
	
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		Node root=insert();
		Node x=root.left;
		Node y=root.right.left;
		if(x==y)
			System.out.println(0);
		else {
		FindDistance fd=new FindDistance();
		ExsitPair ans=fd.minDistance(root,x,y);
		if(!ans.pairFound)
			System.out.println("Both or any one of the node not found");
		else
			System.out.println(ans.dist);
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
