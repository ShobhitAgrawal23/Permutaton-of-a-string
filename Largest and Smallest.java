import java.util.*;
class PairLS{
	int lar;
	int sma;
	PairLS(int l,int s){
		lar=l;
		sma=s;
	}
}
public class LargestAndSmallest {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=s.nextInt();
		}
		System.out.println("Largest no. "+largest(arr));
		System.out.println("Smallest no. "+smallest(arr));
		System.out.println("Largest and smallest nos. "+LrSm(arr).lar+" "+LrSm(arr).sma);

	}
	public static int largest(int[] arr) {
		int max=arr[0];
		for(int i=1;i<arr.length;i++) {
			if(arr[i]>max)
				max=arr[i];
		}
		return max;
	}
	public static int smallest(int[] arr) {
		int min=arr[0];
		for(int i=1;i<arr.length;i++) {
			if(arr[i]<min)
				min=arr[i];
		}
		return min;
	}
	public static PairLS LrSm(int[] arr) {
		int min,max,i;
		
		if(arr.length%2==0) {
			if(arr[0]>arr[1]) {
				max=arr[0];
				min=arr[1];
			}
			else {
				max=arr[0];
				min=arr[1];
			}
			i=2;
		}
		else {
			min=max=arr[0];
			i=1;
		}
		while(i<arr.length-1) {
			if(arr[i]>arr[i+1]) {
				if(max<arr[i])
					max=arr[i];
				if(min>arr[i+1])
					min=arr[i+1];
			}
			else {
				if(max<arr[i+1])
					max=arr[i+1];
				if(min>arr[i])
					min=arr[i];
			}
			i+=2;
		}
		return new PairLS(max,min);
	}
	

}
