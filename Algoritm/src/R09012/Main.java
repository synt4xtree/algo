package R09012;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main( String[] args ) throws IOException{
		BufferedReader br = new BufferedReader( new InputStreamReader( System.in ) );
		int testCase = Integer.parseInt( br.readLine() );
		StringBuilder sb = new StringBuilder();
		
		while( testCase-- > 0 ){
			String str = br.readLine();
			int count = 0;
			boolean isVPS = true;
			for( int i = 0 ; i < str.length() ; ++i ){
				if( str.charAt(i) == '(' )
					count++;
				else{
					if( count < 1 ){
						isVPS = false;
						break;
					} else {
						count--;
					}
				}
			}
			sb.append( ( isVPS && count == 0 ) ? "YES\n" : "NO\n" );
		}
		
		System.out.println( sb );
		
		br.close();
	}
}
