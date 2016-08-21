package Q10845;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class Main {
	
	public static void main( String[] args ) throws IOException {
		BufferedReader br = new BufferedReader( new InputStreamReader( System.in ) );
		int n = Integer.parseInt( br.readLine() );
		StringBuilder sb = new StringBuilder();
		
		MyQ q = new MyQ();
		String[] line;
		while( n-- > 0 ){
			line = br.readLine().split( " " );
			
			switch( line[0] ){
			case "push":
				q.push( Integer.parseInt( line[1] ) );
				break;
				
			case "pop":
				sb.append( q.pop() + "\n" );
				break;
				
			case "size":
				sb.append( q.size() + "\n" );
				break;
				
			case "empty":
				sb.append( (q.isEmpty() ? 1 : 0) + "\n" );
				break;
				
			case "front":
				sb.append( q.front() + "\n" );
				break;
				
			case "back":
				sb.append( q.back() + "\n" );
				break;
			}			
		}
		
		System.out.println( sb );
	}
	
	static class MyQ{
		int[] arr;
		int front;
		int back;
		
		MyQ(){
			arr = new int[10001];
			front = 0;
			back = 0;
		}
		
		void push( int n ){
			arr[back] = n;
			back++;
		}
		int pop(){
			if( isEmpty() )
				return -1;
			
			int ret = arr[front];
			front++;
			return ret;
		}
		int size(){
			return back-front;
		}
		boolean isEmpty(){
			return front == back;
		}
		int front(){
			if( isEmpty() )
				return -1;
			
			return arr[front];
		}
		int back(){
			if( isEmpty() )
				return -1;
			
			return arr[back-1];
		}		
	}
}
