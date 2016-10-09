package Q01159;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main( String[] args ) throws IOException{
		BufferedReader br = new BufferedReader( new InputStreamReader( System.in ) );
		int[] name = new int[26];
		
		int list = Integer.parseInt( br.readLine() );
		
		while( list-- > 0 )
			name[ br.readLine().charAt(0) - 'a' ]++;
		
		
		br.close();
		
		StringBuilder sb = new StringBuilder();
		for( int i = 0 ; i < 26 ; ++i )
			if( name[i] >= 5 )
				sb.append( (char)(i + 'a') );
		
		System.out.println( sb.length() != 0 ? sb : "PREDAJA" );		
		
	}
}
