package Q02252;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {
	static boolean[] visited;
	static List<Integer>[] edge;
	static Stack<Integer> stack = new Stack<Integer>();
	
	public static void main( String[] args ) throws IOException{
		Scan sc = new Scan();
		int n = sc.nextInt();
		int m = sc.nextInt();
		visited = new boolean[n+1];
		
		//list init
		edge = new List[n+1];
		for( int i = 1 ; i <= n ; ++i )
			edge[i] = new ArrayList<Integer>();
		
		//read edge info
		for( int i = 0 ; i < m ; ++i )
			edge[sc.nextInt()].add( sc.nextInt() );
		
		//DFS TopologicalSort
		for( int i = 1 ; i <= n ; ++i )
			if( !visited[i] )
				DFS( i );
		
		StringBuilder sb = new StringBuilder();
		while( !stack.isEmpty() )
			sb.append( stack.pop() + " " );
		
		System.out.println( sb );
	}
	
	static void DFS( int from ){
		visited[from] = true;
		int length = edge[from].size();
		for( int i = 0 ; i < length ; ++i )
			if( !visited[ edge[from].get( i ) ] )
				DFS( edge[from].get( i ) );
		
		stack.push( from );
	}
	
	static class Scan{
		BufferedReader br = new BufferedReader( new InputStreamReader( System.in ) );
		StringTokenizer st = null;
		
		int nextInt() throws IOException{
			if( st == null || !st.hasMoreTokens() )
				st = new StringTokenizer( br.readLine() );
			return Integer.parseInt( st.nextToken() );
		}
	}
}
