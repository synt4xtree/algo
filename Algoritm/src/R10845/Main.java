package R10845;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Deque;
import java.util.LinkedList;

public class Main {
	public static void main( String[] args ) throws IOException{
		BufferedReader br = new BufferedReader( new InputStreamReader( System.in ) );
		StringBuilder sb = new StringBuilder();
		Deque<Integer> q = new LinkedList<Integer>();
		int numOfCmd = Integer.parseInt( br.readLine() );
		
		while( numOfCmd-- > 0 ){
			String cmd = br.readLine();
			
			switch( cmd ){
			case "pop":
				sb.append( q.isEmpty() ? -1 : q.poll() ).append( '\n' );
				break;
				
			case "size":
				sb.append( q.size() ).append( '\n' );
				break;
				
			case "empty":
				sb.append( q.isEmpty() ? 1 : 0 ).append( '\n' );
				break;
				
			case "front":
				sb.append( q.isEmpty() ? -1 : q.peekFirst() ).append( '\n' );
				break;
				
			case "back":
				sb.append( q.isEmpty() ? -1 : q.peekLast() ).append( '\n' );
				break;
				
			default:
				q.addLast( Integer.parseInt( cmd.split(" ")[1] ) );			
			}
		}
		
		System.out.println( sb );
		br.close();
	}
}
