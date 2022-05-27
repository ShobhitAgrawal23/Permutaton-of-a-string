import java.util.*;
public class KthLargest {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		System.out.println("Enter the k value for kth largest number you want to find");
		int k=s.nextInt();
		PriorityQueue<Integer> queue=new PriorityQueue<>(k);
		for(int i=0;i<k;i++) {
			queue.add(s.nextInt());
		}
		for(int i=k;i<n;i++) {
			int x=s.nextInt();
			if(x>queue.peek()) {
				queue.poll();
				queue.add(x);
			}	
		}
		System.out.println(queue.peek());
	}

}
