package Q12813;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main( String[] args ) throws IOException{
		BufferedReader br = new BufferedReader( new InputStreamReader( System.in ) );
		String x = br.readLine();
		String y = br.readLine();
		
		System.out.println( opAnd( x, y ) );
		System.out.println( opOr( x, y ) );
		System.out.println( opXor( x, y ) );
		System.out.println( opNot( x ) );
		System.out.println( opNot( y ) );
		
		br.close();
	}
	
	static String opAnd( String x, String y ){
		StringBuilder sb = new StringBuilder();
		
		for( int i = 0 ; i < x.length() ; ++i )
			sb.append( (x.charAt(i) == '1' && y.charAt(i) == '1') ? '1' : '0' );

		return sb.toString();
	}
	
	static String opOr( String x, String y ){
		StringBuilder sb = new StringBuilder();
		
		for( int i = 0 ; i < x.length() ; ++i )
			sb.append( (x.charAt(i) == '0' && y.charAt(i) == '0' ) ? '0' : '1' );
		
		return sb.toString();
	}
	
	static String opXor( String x, String y ){
		StringBuilder sb = new StringBuilder();
		
		for( int i = 0 ; i < x.length() ; ++i )
			sb.append( (x.charAt(i) == y.charAt(i) ) ? '0' : '1' );
		
		return sb.toString();
	}
	
	static String opNot( String x ){
		StringBuilder sb = new StringBuilder();
		
		for( int i = 0 ; i < x.length(); ++i )
			sb.append( x.charAt(i) == '0' ? '1' : '0' );
		
		return sb.toString();
	}
}
