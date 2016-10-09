package Q10828;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
	public static void main( String[] args ) throws IOException{
		BufferedReader br = new BufferedReader( new InputStreamReader( System.in ) );
		StringBuilder sb = new StringBuilder();
		Stack<Integer> stack = new Stack<Integer>();
		
		int numOfCmd = Integer.parseInt( br.readLine() );
		
		while( numOfCmd-- > 0 ){
			String cmd = br.readLine();
			
			switch( cmd ){
			
			case "top":
				sb.append( stack.isEmpty() ? -1 : stack.peek() ).append( '\n' );
				break;
				
			case "size":
				sb.append( stack.size() ).append( '\n' );
				break;
				
			case "empty":
				sb.append( stack.isEmpty() ? 1 : 0 ).append( '\n' );
				break;
				
			case "pop":
				sb.append( stack.isEmpty() ? -1 : stack.pop() ).append( '\n' );
				break;
			
			default:
				stack.push( Integer.parseInt( cmd.split(" ")[1] ) );
				break;
			}
		}
		
		System.out.println( sb );
		
		br.close();
	}
}
