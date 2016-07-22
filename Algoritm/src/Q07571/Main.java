package Q07571;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	public static void main( String[] args ) throws Exception{
		Scan sc = new Scan();
		
		int n = sc.nextInt(), m = sc.nextInt(), mid = m/2;
		int[] x = new int[m];
		int[] y = new int[m];
		
		for( int i = 0 ; i < m ; ++i ){
			x[i] = sc.nextInt();
			y[i] = sc.nextInt();
		}
		
		Arrays.sort( x );
		Arrays.sort( y );
		
		int xmid = x[mid], ymid = y[mid];
		
		int ret = 0;
		for( int i = 0 ; i < m ; ++i )
			ret += ( Math.abs( x[i] - xmid ) + Math.abs( y[i] - ymid ) );
		
		System.out.println( ret );
	}
	
	static class Scan{
		BufferedReader in = new BufferedReader( new InputStreamReader( System.in ) );
		StringTokenizer st = null;
		
		int nextInt() throws Exception {
			if( st == null || !st.hasMoreTokens() )
				st = new StringTokenizer( in.readLine() );
			
			return Integer.parseInt( st.nextToken() );
		}
	}
}
