package dp;
import java.util.*;
public class RodCutting {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int length[]=new int[n];
		int price[]=new int[n];
		for(int i=0;i<n;i++) {
			length[i]=s.nextInt();
			price[i]=s.nextInt();
		}
		int k=s.nextInt();
		int dp[][]=new int[n+1][k+1];
		System.out.print(rodCutting(length,price,k,0,dp));

	}
	public static int rodCutting(int[] length,int[] price,int k,int i, int[][] dp) {
		if(i==length.length || k==0)
			return 0;
		if(dp[i][k]!=0)
			return dp[i][k];
		if(k-length[i]>=0) {
			return dp[i][k]=Math.max(price[i]+rodCutting(length,price,k-length[i],i,dp), rodCutting(length,price,k,i+1,dp));
		}
		else
			return dp[i][k]=rodCutting(length,price,k,i+1,dp);
	}

}
