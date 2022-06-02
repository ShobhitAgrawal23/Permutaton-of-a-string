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
		int min=arr[0];
		int max=arr[0];
		for(int i=1;i<arr.length;i++) {
			if(arr[i]<min)
				min=arr[i];
			else if(arr[i]>max)
				max=arr[i];
			
		}
		return new PairLS(max,min);
	}
	

}
