package Q01075;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main( String[] args ) throws IOException {
		BufferedReader br = new BufferedReader( new InputStreamReader( System.in ) );
		String n = br.readLine();
		int parsedF = Integer.parseInt( br.readLine() );
		
		int parsedN = Integer.parseInt( n.substring( 0, n.length()-2 ) + "00" );
		
		int t = 0;
		for( int i = parsedN ; i < parsedN + 100 ; ++i, ++t ){
			if( i % parsedF == 0 ){
				System.out.println( t < 10 ? "0" + t : t );
				break;
			}
		}
		
		br.close();
	}
}
