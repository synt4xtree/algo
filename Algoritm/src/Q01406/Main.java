package Q01406;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
	public static void main( String[] args ) throws IOException {
		BufferedReader br = new BufferedReader( new InputStreamReader( System.in ) );
		String input = br.readLine();
		Stack<Character> tmp = new Stack<>();
		Stack<Character> ret = new Stack<>();
		StringBuilder sb = new StringBuilder();
		
		for( int i = 0 ; i < input.length() ; ++i )
			tmp.push( input.charAt( i ) );
		
		int n = Integer.parseInt( br.readLine() );
		while( n-- > 0 ){
			input = br.readLine();
			
			switch( input.charAt( 0 ) ){
			case 'L':
				if( !tmp.isEmpty() )
					ret.push( tmp.pop() );
				break;
			case 'D':
				if( !ret.isEmpty() )
					tmp.push( ret.pop() );
				break;
			case 'B':
				if( !tmp.isEmpty() )
					tmp.pop();
				break;
			case 'P':
				tmp.push( input.charAt( 2 ) );
				break;
			}
			
		}
		
		
		while( !tmp.isEmpty() )
			ret.push( tmp.pop() );
		while( !ret.isEmpty() )
			sb.append( ret.pop() );
		
		System.out.println( sb );
		
	}
}
