package Q11404;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	static final int INF = 1000001;
	
	public static void main( String[] args ) throws Exception{
		Scan sc = new Scan();
		int n = sc.nextInt() + 1, m = sc.nextInt();
		int[][] cost = new int[n][n];
		
		for( int i = 1 ; i < n ; ++i )
			for( int j = 1 ; j < n ; ++j )
				if( i == j )
					cost[i][j] = 0;
				else
					cost[i][j] = INF;
		
		while( m-- > 0 ){
			int from = sc.nextInt(), to = sc.nextInt(), value = sc.nextInt();
			if( cost[from][to] > value )
				cost[from][to] = value;
		}
		
		
		for( int k = 1 ; k < n ; ++k )
			for( int i = 1 ; i < n ; ++i )
				for( int j = 1 ; j < n ; ++j )
					cost[i][j] = Math.min( cost[i][j], cost[i][k] + cost[k][j]);
		
		
		for( int i = 1 ; i < n ; ++i ){
			for( int j = 1 ; j < n ; ++j )
				System.out.print( cost[i][j] + " " );
			System.out.println();
		}
		
	}
	
	static class Scan {
		BufferedReader in = new BufferedReader( new InputStreamReader( System.in ) );
		StringTokenizer st = null;
		
		int nextInt() throws Exception{
			if( st == null || !st.hasMoreTokens() )
				st = new StringTokenizer( in.readLine() );
			
			return Integer.parseInt( st.nextToken() );
		}
		
	}
}
