package Q10844;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main( String[] args ) throws IOException{
		BufferedReader br = new BufferedReader( new InputStreamReader( System.in ) );
		int n = Integer.parseInt( br.readLine() );
		int[][] cache = new int[n+1][10];
		cache[0][1] = 1;
		for( int i = 1 ; i < 10 ; ++i )
			cache[1][i]++;
		
		for( int i = 2 ; i <= n ; ++i ){
			cache[i-1][0] = cache[i-2][1];
			cache[i][9] = cache[i-1][8];
			
			for( int j = 1 ; j < 9 ; ++j )
				cache[i][j] = ( cache[i-1][j-1] + cache[i-1][j+1] ) % 1000000000;
		}
		
		int ans = 0;
		for( int i = 1; i <= 9 ; ++i ){
			ans += cache[n][i];
			ans %= 1000000000;
		}
		
		System.out.println( ans );
		
		br.close();
	}
}
