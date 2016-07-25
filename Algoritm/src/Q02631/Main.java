package Q02631;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main( String[] args ) throws IOException{
		Scan sc = new Scan();
		
		int N = sc.nextInt();
		int[] nums = new int[N];
		int[] dp = new int[N];
		
		for( int i = 0 ; i < N ; ++i )
			nums[i] = sc.nextInt();
		
		for( int i = 1 ; i < N ; ++i )
			for( int j = 0 ; j < i ; ++j )
				if( nums[i] > nums[j] )
					dp[i] = Math.max( dp[i], dp[j] + 1 );
		
		int max = 0;
		for( int i = 0 ; i < N ; ++i )
			max = Math.max( max, dp[i] );		
		
		System.out.println( N - (max+1) );
		
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
