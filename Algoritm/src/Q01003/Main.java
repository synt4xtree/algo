package Q01003;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

/*
 * review
 */

public class Main {
	static int[][] dp;
		
	public static void main( String[] args ) throws IOException{
		Scan sc = new Scan();
		int testcase = sc.nextInt();
		StringBuffer sb = new StringBuffer();
		dp = new int[2][41];
		
		Arrays.fill( dp[0], -1 );
		Arrays.fill( dp[1], -1 );
		
		dp[0][0] = 1; dp[1][0] = 0;
		dp[0][1] = 0; dp[1][1] = 1;
		
		while( testcase-- > 0 ){
			int n = sc.nextInt();
			
			sb.append( Fibo0( n ) + " " + Fibo1( n ) + "\n" );
		}
		
		System.out.println( sb );
	}
	
	static int Fibo0( int n ){
		if( dp[0][n] > -1 )
			return dp[0][n];
		
		return dp[0][n] = Fibo0( n-1 ) + Fibo0( n-2 );
	}
	
	static int Fibo1( int n ){
		if( dp[1][n] > -1 )
			return dp[1][n];
		
		return dp[1][n] = Fibo1( n-1 ) + Fibo1( n-2 );
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
