package Q10093;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main( String[] args ) throws IOException{
		BufferedReader br = new BufferedReader( new InputStreamReader( System.in ) );
		
		String[] line = br.readLine().split(" ");
		long s = Long.parseLong( line[0] );
		long e = Long.parseLong( line[1] );
		long start = Math.min( e, s );
		long limit = Math.max( s, e );
		
		StringBuilder sb = new StringBuilder();
		sb.append( limit - start - 1 < 0 ? 0 : limit - start - 1 + "\n" );
		
		for( long i = start + 1 ; i < limit ; ++i )
			sb.append( i + " " );
		
		System.out.println( sb );
		
		br.close();
	}
}