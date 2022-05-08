package testTree;
import java.util.*;
public class MinDistance {
	public static int ans=-1;
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		Node root=insert();
		int x=s.nextInt();
		int y=s.nextInt();
		minDist(root,x,y);
		System.out.println(ans);
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

	public static int minDist(Node root, int x,int y) {
		if(root==null)
			return -1;
		int left=minDist(root.left,x,y);
		int right=minDist(root.right,x,y);
		if(root.data==x || root.data==y) {
			if(left!=-1 || right!=-1) {
				ans=Math.max(left, right);
				return -1;
			}
			else
				return 1;
		}
		if(left!=-1 && right!=-1) {
			ans=left+right;
			return -1;
		}
		if(left!=-1 || right!=-1)
			return Math.max(left, right)+1;
		return -1;
		
	}

}
