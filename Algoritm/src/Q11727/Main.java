package Q11727;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main( String[] args ) throws IOException{
		BufferedReader br = new BufferedReader( new InputStreamReader( System.in ) );
		int n = Integer.parseInt( br.readLine().trim() );
		
		int[] cache = new int[n+1];
		cache[1] = 1; cache[0] = 1;//2의 처리를 위해
		
		for( int i = 2 ; i <= n ; ++i )
			cache[i] = ( cache[i-1] + 2*cache[i-2] ) % 10007;
		
		System.out.println( cache[n] );
		
		br.close();
	}
}
