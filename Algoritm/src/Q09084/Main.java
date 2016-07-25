package Q09084;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main( String[] args ) throws IOException{
		Scan sc = new Scan();
		int testcase = sc.nextInt();
		StringBuffer sb = new StringBuffer();
		
		while( testcase-- > 0 ){
			int coin = sc.nextInt();
			int[] coins = new int[coin];
			
			for( int i = 0 ; i < coin ; ++i )
				coins[i] = sc.nextInt();
			
			int total = sc.nextInt();
			int[] dp = new int[total+1];
			
			for( int i = 0 ; i < coins.length ; ++i )
				dp[ coins[i] ]++;
			
			
			for( int i = 0 ; i <= total ; ++i ){
				for( int j = 0 ; j < coins.length ; ++j ){
					if( i - coins[j] < 0 ) break;
					
					dp[i] += dp[ i-coins[j] ];
				}
			}
			for( int i = 0 ; i < total; ++i )
				System.out.println( i + " : " + dp[i] );
			
			sb.append( dp[total] + "\n" );
		}
		
		System.out.println( sb );
		
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
