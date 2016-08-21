package Q10820;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main( String[] args ) throws IOException{
		BufferedReader br = new BufferedReader( new InputStreamReader( System.in ) );
		String line;
		StringBuilder sb = new StringBuilder();
		
		while( ( line = br.readLine() ) != null ){
			int length = line.length();
			int lower = 0, upper = 0, blank = 0, num = 0;
			
			for( int i = 0 ; i < length ; ++i ){
				char target = line.charAt(i);
				
				if( 'a' <= target && target <= 'z')
					lower++;
				else if( 'A' <= target && target <= 'Z' )
					upper++;
				else if( '0' <= target && target <= '9' )
					num++;
				else
					blank++;
			}
			
			sb.append( lower + " " + upper + " " + num + " " + blank + "\n" );
		}
		
		System.out.println( sb );
	}
}
