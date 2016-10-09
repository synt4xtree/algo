package R10799;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main( String[] args ) throws IOException {
		BufferedReader br = new BufferedReader( new InputStreamReader( System.in ) );
		String input = br.readLine();
		int count = 0;
		int pipe = 0;
		
		for( int i = 0 ; i < input.length(); ++i ){
			if( input.charAt(i) == '(' ){
				count++;
			} else {
				count--;
				
				if( input.charAt(i-1) == ')' )
					pipe++;
				else
					pipe += count;
			}
		}
		
		System.out.println( pipe );
		br.close();
	}
}
