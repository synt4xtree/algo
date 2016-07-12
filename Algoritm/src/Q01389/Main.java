package Q01389;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	
	static final int INF = 987654321;
	
	public static void main( String[] args ) throws Exception{
		Scan sc = new Scan();
		int n = sc.nextInt()+1, m = sc.nextInt();
		int[][] relations = new int[n][n];
		
		for( int i = 1 ; i < n ; ++i )
			for( int j = 1 ; j < n ; ++j )
				if( i == j )
					relations[i][j] = 0;
				else
					relations[i][j] = INF;
		
		while( m-- > 0 ){
			int from = sc.nextInt(), to = sc.nextInt();
			relations[from][to] = relations[to][from] = 1;
		}
		
		
		for( int k = 1 ; k < n ; ++k )
			for( int i = 1 ; i < n ; ++i )
				for( int j = 1 ; j < n ; ++j )
						relations[i][j] = Math.min( relations[i][k] + relations[k][j], relations[i][j] );
		
		
		int ans = Integer.MAX_VALUE;
		int idx = 0;
		for( int i = 1 ; i < n ; ++i ){
			int sum = 0;
			for( int j = 1 ; j < n ; ++j )
				sum += relations[i][j];
			
			if( ans > sum ){
				ans = sum;
				idx = i;
			}
			
		}
		
		System.out.println( idx );
				
	}
	
	static class Scan{
		BufferedReader in = new BufferedReader( new InputStreamReader( System.in ) );
		StringTokenizer st = null;
		
		int nextInt() throws Exception{
			if( st == null || !st.hasMoreTokens() )
				st = new StringTokenizer( in.readLine() );
			return Integer.parseInt( st.nextToken() );
		}		
	}
}
