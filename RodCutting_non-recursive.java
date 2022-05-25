package dp;
import java.util.*;
public class RodCutting {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int price[]=new int[n];
		for(int i=0;i<n;i++) {
			price[i]=s.nextInt();
		}
    
		int dp[][]=new int[n+1][n+1];
    
		for(int i=1;i<=n;i++)
			dp[1][i]=i*price[0];

		for(int i=2;i<=n;i++) {
			for(int j=1;j<=n;j++) {
				if(j-i>=0) {
					dp[i][j]=Math.max(price[i-1]+dp[i][j-i], dp[i-1][j]);
				}
				else
					dp[i][j]=dp[i-1][j];
			}
		}
		System.out.println(dp[n][n]);
	}
