package Q02156;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	static int[] nums;
	static int[][] dp;
	public static void main( String[] args ) throws IOException{
		Scan sc = new Scan();
		
		int n = sc.nextInt();
		nums = new int[n+1];
		dp = new int[2][n+1];
		
		for( int i = 1 ; i < n+1 ; ++i )
			nums[i] = sc.nextInt();
		
		Arrays.fill( dp[0], -1 );
		Arrays.fill( dp[1], -1 );
		
		int max = Math.max( Get( n, true ), Get( n, false ) );
		
		System.out.println( max );
	}
	
	static int Get( int n , boolean drink ){
		
		if( dp[1][n] > -1 && drink )
			return dp[1][n];
		
		else if ( dp[0][n] > -1 && !drink )
			return dp[0][n];
		
		if( n < 3 ){
			if( n == 2 ){
				if( drink )
					return dp[1][2] = nums[2] + nums[1];
				else
					return dp[0][2] = nums[1];
				
			} 
			else if( n == 1 ){
				if( drink )
					return dp[1][1] = nums[1];
				else
					return dp[0][1] = 0;
				
			} 
			else 
				return 0;
		}
		
		if( drink )
			return dp[1][n] = nums[n] + Math.max( nums[n-1] + Get( n-2, false ), Get( n-2, true ) );
		else
			return dp[0][n] = Math.max( Get( n-1, true ), Get( n-1, false ) );
	}
	
	static class Scan{
		BufferedReader br = new BufferedReader( new InputStreamReader( System.in ) );
		StringTokenizer st = null;
		
		int nextInt() throws IOException{
			if( st == null || !st.hasMoreTokens() )
				st = new StringTokenizer( br.readLine() );
			
			return Integer.parseInt( st.nextToken() );
		}
	}
}