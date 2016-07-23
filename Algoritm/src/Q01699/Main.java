package Q01699;

import java.util.Scanner;

public class Main {
	static int[] dp;
	public static void main( String[] args ){
		Scanner sc = new Scanner( System.in );
		int N = sc.nextInt();
		dp = new int[N+1];
		
		dp[1] = 1;
		for( int i = 1 ; i <= N ; ++i ){
			for( int j = 1 ; j*j <= i ; ++j ){
				if( dp[i] > dp[i-j*j] + 1 || dp[i] == 0 )
					dp[i] = dp[i-j*j] + 1;
			}			
		}
		
		System.out.println( dp[N] );
		
		sc.close();		
	}
}


/* 
 * 가장 큰값부터 빼서 구하는 방법의 반례
 * 43 = 25 + 9 + 9
 * 43 = 36 + 4 + 1 + 1 + 1 
 */
