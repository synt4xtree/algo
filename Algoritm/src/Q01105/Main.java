package Q01105;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main( String[] args ) throws IOException{
		BufferedReader br = new BufferedReader( new InputStreamReader( System.in ) );
		String[] line = br.readLine().split(" ");
		
		if( line[0].length() < line[1].length() ){
			System.out.println( 0 );
			return;
		}
		int count = 0;
		for( int i = 0 ; i < line[0].length( ); ++i ){
			if( line[0].charAt(i) != line[1].charAt(i) )
				break;
			else if( line[0].charAt(i) == line[1].charAt(i) && line[0].charAt(i) == '8' )
				count++;
		}
		
		System.out.println( count );
		br.close();
	}
}
