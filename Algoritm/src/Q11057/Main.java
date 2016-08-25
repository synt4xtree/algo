package Q11057;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main( String[] args ) throws IOException{
		BufferedReader br = new BufferedReader( new InputStreamReader( System.in ) );
		int n = Integer.parseInt( br.readLine() );
		int[][] cache = new int[n+1][10];
		
		for( int i = 0 ; i < 10 ; ++i )
			cache[1][i]++;
		
		for( int i = 2 ; i <= n ; ++i )
			for( int j = 0 ; j <= 9 ; ++j ){
				for( int k = j ; k <=9 ; ++k )
					cache[i][j] += cache[i-1][k];
				
				cache[i][j] %= 10007;
			}
		
		int ans = 0;
		for( int i : cache[n] )
			ans += i;
		
		System.out.println( ans % 10007 );
		
		br.close();
	}
}
