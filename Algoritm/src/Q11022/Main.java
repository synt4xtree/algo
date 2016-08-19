package Q11022;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main( String[] args ) throws IOException{
		Scan sc = new Scan();
		int testcase = sc.nextInt();
		int x, y;
		StringBuilder sb = new StringBuilder();
		
		for( int i = 1 ; i <= testcase ; ++i ){
			x = sc.nextInt();
			y = sc.nextInt();
			sb.append( "Case #"+ i + ": " + x + " + " + y + " = " + ( x + y ) +"\n" );
		}
		
		System.out.println( sb );
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
