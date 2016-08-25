package Q09095;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main( String[] args ) throws IOException{
		BufferedReader br = new BufferedReader( new InputStreamReader( System.in ) );
		StringBuilder sb = new StringBuilder();
		int testcase = Integer.parseInt( br.readLine() );
		int[] cache = new int[11];
		cache[1] = 1;
		cache[2] = 2;
		cache[3] = 4;
		
		for( int i = 4 ; i <= 10 ; ++i )
			cache[i] = cache[i-1] + cache[i-2] + cache[i-3];
		
		while( testcase-- > 0 )
			sb.append( cache[Integer.parseInt( br.readLine() )] + "\n" );
		
		System.out.println( sb );
		br.close();
	}
}
