package Q11021;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main( String[] args ) throws IOException{
		Scan sc = new Scan();
		int testcase = sc.nextInt();
		StringBuilder sb = new StringBuilder();
		
		for( int i = 0 ; i < testcase ; ++i ){
			sb.append( "Case #"+ (i+1) + ": " + (sc.nextInt() + sc.nextInt()) + "\n" );
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
