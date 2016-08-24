package Q01049;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main( String[] args ) throws IOException{
		Scan sc = new Scan();
		int n = sc.nextInt(), m = sc.nextInt();
		int pack = Integer.MAX_VALUE;
		int piece = Integer.MAX_VALUE;
		int ret = 0;
		
		while( m-- > 0 ){
			pack = Math.min( pack, sc.nextInt() );
			piece = Math.min( piece, sc.nextInt() );
		}
		
		if( (double)piece <= (double)pack/6 )
			ret = piece*n;
		else
			ret = Math.min( ( (n/6)*pack + (n%6)*piece) , ( (n/6 + 1)*pack ) );
		
		System.out.println( ret );
		
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
