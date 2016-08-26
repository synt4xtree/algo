package Q02193;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main( String[] args ) throws IOException{
		BufferedReader br = new BufferedReader( new InputStreamReader( System.in ) );
		int n = Integer.parseInt( br.readLine() );
		long[][] cache = new long[n+1][2];
		
		//init
		cache[0][0] = 0l;
		cache[0][1] = 1l;
		cache[1][1] = 1l;
		cache[1][0] = 1l;
		
		for( int i = 2 ; i <= n ; ++i ){
			cache[i][1] = cache[i-2][0] + cache[i-2][1];
			cache[i][0] = cache[i-1][0] + cache[i-1][1];
		}
		
		System.out.println( cache[n][1] );
		
		br.close();
	}
}
