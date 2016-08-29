package Q11055;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main( String[] args ) throws IOException{
		Scan sc = new Scan();
		int n = sc.nextInt();
		int[] nums = new int[n+1];
		int[] cache = new int[n+1];
		
		for( int i = 1 ; i <= n ; ++i )
			cache[i] = nums[i] = sc.nextInt();
		
		for( int i = 2 ; i <= n ; ++i )
			for( int j = 1 ; j < i ; ++j )
				if( nums[j] < nums[i] )
					cache[i] = Math.max( cache[i], cache[j] + nums[i] );
		
		int maxSum = 0;
		for( int i : cache )
			maxSum = Math.max( i, maxSum );
		
		System.out.println( maxSum );
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
