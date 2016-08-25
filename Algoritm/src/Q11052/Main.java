package Q11052;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main( String[] args ) throws IOException{
		Scan sc = new Scan();
		int n = sc.nextInt();
		int[] cache = new int[n+1];
		int[] price = new int[n+1];
		
		for( int i = 1 ; i <= n ; ++i )
			cache[i] = price[i] = sc.nextInt();
		
		for( int i = 1; i <= n ; ++i ){
			int length = i/2;
			for( int j = 1 ; j <= length ; ++j )
				cache[i] = Math.max( cache[i], cache[i-j]+cache[j] );
		}
		
		System.out.println( cache[n] );
		
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
