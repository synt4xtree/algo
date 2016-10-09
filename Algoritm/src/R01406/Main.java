package R01406;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
	public static void main( String[] args ) throws IOException{
		BufferedReader br = new BufferedReader( new InputStreamReader( System.in ) );
		Stack<Character> front = new Stack<Character>();
		Stack<Character> back = new Stack<Character>();
		String input = br.readLine();
		int numOfCmd = Integer.parseInt( br.readLine() );
		
		for( int i = 0 ; i < input.length() ; ++i )
			front.push( input.charAt(i) );
		
		while( numOfCmd-- > 0 ){
			String cmd = br.readLine();
			
			switch( cmd ){
			case "L":
				if( !front.isEmpty() )
					back.push( front.pop() );
				break;
			case "D":
				if( !back.isEmpty() )
					front.push( back.pop() );
				break;
			case "B":
				if( !front.isEmpty() )
					front.pop();
				break;
			default:
				front.push( cmd.charAt(2) );
			}
		}
		
		while( !front.isEmpty() )
			back.push( front.pop() );
		
		StringBuilder sb = new StringBuilder();
		while( !back.isEmpty() )
			sb.append( back.pop() );
		
		System.out.println( sb );
		br.close();
	}
}
