package Practice;
import java.util.*;
public class QuickSelect {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=s.nextInt();
		}
		System.out.println("Enter the k value for kth largest number you want to find");
		int k=s.nextInt();
		System.out.println(quickSelect(arr,k,0,n-1));
		

	}
	public static int quickSelect(int[] arr,int k,int s,int e) {
		if(s>e)
			return 0;
		int pos=quick(arr,k,s,e);
		if(pos==arr.length-k)
			return arr[pos];
		else if(pos>arr.length-k)
			return quickSelect(arr,k,s,pos-1);
		else
			return quickSelect(arr,k,pos+1,e);
		
	}
	public static int quick(int[] arr,int k,int s,int e) {
		int p=e;
		int i=s,j=e-1;
		while(i<j) {
		  while(arr[i]<arr[p]) {
			  i++;
		  }
		  while(j>=0 && arr[j]>arr[p]) {
			  j--;
		  }
		  if(i<j) {
			  int temp=arr[i];
			  arr[i]=arr[j];
			  arr[j]=temp;
			  i++;
			  j--;
		  }
		}
		int temp=arr[p];
		arr[p]=arr[i];
		arr[i]=temp;
		return i;
	}

}
