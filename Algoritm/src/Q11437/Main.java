package Q11437;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Main {
	
	static List<Integer>[] tree;
	static int[] parents;
	static int[] level;
	static boolean[] visit;
	
	public static void main( String[] args ) throws IOException{
		Scan sc = new Scan();
		int n = sc.nextInt();
		
		//트리 초기화
		tree = new List[n+1];
		parents = new int[n+1];
		level = new int[n+1];
		visit = new boolean[n+1];
		
		for( int i = 0 ; i < n+1 ; ++i )
			tree[i] = new ArrayList<Integer>();
		
		for( int i = 1 ; i < n ; ++i ){
			int parent = sc.nextInt(), child = sc.nextInt();
			
			tree[parent].add( child );
			tree[child].add( parent );
		}
		
		GetList( 1 );
		
		StringBuffer sb = new StringBuffer();
		int m = sc.nextInt();
		
		for( int i = 0 ; i < m ; ++i ){
			int start = sc.nextInt();
			int end = sc.nextInt();
			
			sb.append( LCA( start, end ) + "\n" );
		}
		
		System.out.println( sb );
		
	}
	
	static int LCA( int x, int y ){
		if( level[x] < level[y] ){
			int temp = x;
			x = y;
			y = temp;
		}
		
		while( level[x] != level[y] )
			x = parents[x];
		
		while( x != y ){
			x = parents[x];
			y = parents[y];
		}
		
		return x;
	}
	
	static void GetList( int parent ){
		visit[parent] = true;
		
		for( int i = 0 ; i < tree[parent].size() ; ++i ){
			int child = tree[parent].get(i);
			
			if( visit[child] )
				continue;
			
			level[child] = level[parent] + 1;
			parents[child] = parent;
			
			GetList( child );
		}
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
