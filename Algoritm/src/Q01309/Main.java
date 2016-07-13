package Q01309;

import java.util.Scanner;

public class Main {
	public static void main( String[] args ){
		Scanner sc = new Scanner( System.in );
		int n = sc.nextInt();
		int[] dp = new int[n+1];
		
		dp[0] = 1;
		dp[1] = 3;
		for( int i = 2 ; i < dp.length ; ++i )
			dp[i] = (dp[i-1]*2 + dp[i-2])%9901;
		
		System.out.println( dp[n] );
		
		sc.close();
	}
}
//왜 위의 점화식이 맞는지 모르겠다