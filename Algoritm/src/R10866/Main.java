package R10866;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Deque;
import java.util.LinkedList;

public class Main {
	public static void main( String[] args ) throws IOException{
		BufferedReader br = new BufferedReader( new InputStreamReader( System.in ) );
		StringBuilder sb = new StringBuilder();
		Deque<Integer> dq = new LinkedList<Integer>();
		
		int numOfCmd = Integer.parseInt( br.readLine() );
		
		while( numOfCmd-- > 0 ){
			String cmd = br.readLine();
			
			switch( cmd ){
			case "pop_front":
				sb.append( dq.isEmpty() ? -1 : dq.pollFirst() ).append('\n');
				break;
				
			case "pop_back":
				sb.append( dq.isEmpty() ? -1 : dq.pollLast() ).append('\n');
				break;
				
			case "size":
				sb.append( dq.size() ).append('\n');
				break;
				
			case "empty":
				sb.append( dq.isEmpty() ? 1 : 0 ).append('\n');
				break;
				
			case "front":
				sb.append( dq.isEmpty() ? -1 : dq.peekFirst() ).append('\n');
				break;
				
			case "back":
				sb.append( dq.isEmpty() ? -1 : dq.peekLast() ).append('\n');
				break;
				
			default:
				int x = Integer.parseInt( cmd.split(" ")[1] );
				
				switch( cmd.split(" ")[0] ){
				case "push_front":
					dq.addFirst( x );
					break;
				case "push_back":
					dq.addLast( x );
					break;
				}
			}
		}
		
		System.out.println( sb );
		
		br.close();
	}
}
