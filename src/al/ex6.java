package al;
import java.util.*;
public class ex6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		
		int a[]=new int[n+10];
		int b[]=new int[n+10];
		
		int dp[]= new int[n+10];
		
		int max=0;
		
		for(int i=1;i<=n;i++) {
			a[i]=sc.nextInt();
			b[i]=sc.nextInt();
		}//for

		for(int i=n;i>0;i--) {
			int date=i+a[i];
			if(date<=n+1) {
				dp[i]=Math.max(b[i]+dp[date],dp[i+1]);
			}else {
				dp[i]=dp[i+1];
			}
		}//for
		
		System.out.println(dp[1]);
	}

}
