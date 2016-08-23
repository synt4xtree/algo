package Q01912;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main( String[] args ) throws IOException{
		Scan sc = new Scan();
		int n = sc.nextInt();
		int[] arr = new int[n];
		int[] dp = new int[n];
		for( int i = 0 ; i < n ; ++i )
			arr[i] = sc.nextInt();
		
		dp[0] = arr[0];
		for( int i = 1 ; i < n ; ++i )
			dp[i] = Math.max( arr[i], arr[i] + dp[i-1] );
		
		int maxVal = Integer.MIN_VALUE;
		for( int i = 0 ; i < n ; ++i )
			maxVal = Math.max( maxVal, dp[i] );
		
		System.out.println( maxVal );
		
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
