package Q09933;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main( String[] args ) throws IOException{
		BufferedReader br = new BufferedReader( new InputStreamReader( System.in ) );
		int n = Integer.parseInt( br.readLine() );
		String[] inputs = new String[n];
		
		for( int i = 0 ; i < n ; ++i )
			inputs[i] = br.readLine();
		
		solve( inputs, n );
		
		br.close();
	}
	public static void solve( String[] inputs , int n ){
		for( int i = 0 ; i < n ; ++i ){
			String target = inputs[i];
			
			for( int j = i ; j < n ; ++j ){
				if( target.length() != inputs[j].length() )
					continue;
				
				if( cmpStr( target, inputs[j] ) ){
					System.out.println( target.length() + " " + target.charAt( target.length()/2 ) );
					return;
				}
			}
		}
	}
	public static boolean cmpStr( String target, String idx ){
		int n = target.length();
		
		for( int i = 0 ; i < n ; ++i )
			if( target.charAt( i ) != idx.charAt( n-1 - i ) )
				return false;
		
		return true;
	}
}
