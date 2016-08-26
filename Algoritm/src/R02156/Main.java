package R02156;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main( String[] args ) throws IOException{
		Scan sc = new Scan();
		
		int n = sc.nextInt();
		int[] grapeJuice = new int[n+1];
		int[] cache = new int[n+1];
		for( int i = 1 ; i <= n ; ++i )
			grapeJuice[i] = sc.nextInt();
		
		cache[1] = grapeJuice[1];
		if( n > 1 )
			cache[2] = grapeJuice[2] + grapeJuice[1];
		
		for( int i = 3 ; i <= n ; ++i )
			cache[i] = Math.max( cache[i-1], grapeJuice[i] + Math.max( grapeJuice[i-1] + cache[i-3], cache[i-2] ) );
		
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
