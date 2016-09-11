package Q09996;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main( String[] args ) throws IOException {
		BufferedReader br = new BufferedReader( new InputStreamReader( System.in ) );
		StringBuilder sb = new StringBuilder();
		
		int n = Integer.parseInt( br.readLine() );
		String[] inputs = br.readLine().split("\\*");
		String pattern = inputs[0] + ".*" + inputs[1];
		//Pattern pat = Pattern.compile( pattern[0] + ".*" + pattern[1] );
		
		
		while( n-- > 0 ){
			String input = br.readLine();
			
			/*Matcher mat = pat.matcher( input );
			if( mat.matches() )
			if( input.matches(pattern) )
				sb.append( "DA\n" );
			else
				sb.append( "NE\n" );*/
			sb.append( input.matches( pattern ) ? "DA\n" : "NE\n" );
		}
		
		System.out.println( sb );
		br.close();
	}
}
