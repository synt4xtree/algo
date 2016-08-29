package Q11054;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main( String[] args ) throws IOException{
		Scan sc = new Scan();
		int n = sc.nextInt();
		int[] nums = new int[n+1];
		int[] increaseCache = new int[n+1];
		int[] decreaseCache = new int[n+1];
		
		for( int i = 1 ; i <= n ; ++i )
			nums[i] = sc.nextInt();
		
		for( int i = 2 ; i <= n ; ++i )
			for( int j = 1 ; j < i ; ++j )
				if( nums[j] < nums[i] && increaseCache[i] <= increaseCache[j] )
					increaseCache[i] = increaseCache[j] + 1;
		
		for( int i = n ; i > 0 ; --i )
			for( int j = n ; j > i ; --j )
				if( nums[i] > nums[j] && decreaseCache[i] <= decreaseCache[j] )
					decreaseCache[i] = decreaseCache[j] + 1;
		
		int maxLen = 0;
		for( int i = 1 ; i <= n ; ++i )
			maxLen = Math.max( maxLen, increaseCache[i] + decreaseCache[i] );
		
		System.out.println( maxLen + 1 );
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
