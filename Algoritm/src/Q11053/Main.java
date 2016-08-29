package Q11053;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	public static void main( String[] args ) throws IOException{
		Scan sc = new Scan();
		int n = sc.nextInt();
		int[] nums = new int[n+1];
		int[] cache = new int[n+1];
		
		for( int i = 1 ; i <= n ; ++i )
			nums[i] = sc.nextInt();
		
		//이처럼 초기화 하지 않으면 최대값에 -1 되는 경우가 생긴다.
		Arrays.fill( cache, 1 );
		
		for( int i = 2 ; i <= n ; ++i )
			for( int j = 1 ; j < i ; ++j )
				if( nums[j] < nums[i] )
					cache[i] = Math.max( cache[i], cache[j] + 1 );
		
		int maxLen = 0;
		for( int i : cache )
			maxLen = Math.max( i, maxLen );
		
		System.out.println( maxLen );
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
