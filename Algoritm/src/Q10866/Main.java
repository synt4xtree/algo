package Q10866;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Deque;
import java.util.LinkedList;

public class Main {
	public static void main( String[] args ) throws IOException{
		BufferedReader br = new BufferedReader( new InputStreamReader( System.in ) );
		int n = Integer.parseInt( br.readLine() );
		String[] line;
		
		Deque<Integer> deq = new LinkedList<Integer>();
		StringBuilder sb = new StringBuilder();
		while( n-- > 0 ){
			line = br.readLine().split( " " );
			
			switch( line[0] ){
			case "push_front":
				deq.addFirst( Integer.parseInt( line[1] ) );
				break;
				
			case "push_back":
				deq.addLast( Integer.parseInt( line[1] ) );
				break;
				
			case "pop_front":
				sb.append( ( deq.isEmpty() ? -1 : deq.pollFirst() ) + "\n" );
				break;
				
			case "pop_back":
				sb.append( ( deq.isEmpty() ? -1 : deq.pollLast() ) + "\n" );
				break;
				
			case "size":
				sb.append( deq.size() + "\n" );
				break;
				
			case "empty":
				sb.append( ( deq.isEmpty() ? 1 : 0 ) + "\n" );
				break;
				
			case "front":
				sb.append( ( deq.isEmpty() ? -1 : deq.peekFirst() ) + "\n" );
				break;
				
			case "back":
				sb.append( ( deq.isEmpty() ? -1 : deq.peekLast() ) + "\n" );
				break;
			}
		}
		
		System.out.println( sb );
		
	}
}
