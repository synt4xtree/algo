package R11655;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main( String[] args ) throws IOException{
		BufferedReader br = new BufferedReader( new InputStreamReader( System.in ) );
		StringBuilder sb = new StringBuilder();
		String str = br.readLine();
		
		for( int i = 0 ; i < str.length() ; ++i ){
			char target = str.charAt(i);
			
			if( 'a' <= target && target <= 'z' ){
				target += 13;
				
				if( target > 'z' )
					target -= 26;
			} else if ( 'A' <= target && target <= 'Z' ){
				target += 13;
				
				if( target > 'Z' )
					target -= 26;
			}
			
			sb.append( target );
		}
		
		System.out.println( sb );
		
		br.close();
	}
}
