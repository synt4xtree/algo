package Q12790;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main( String[] args ) throws IOException{
		Scan sc = new Scan();
		StringBuilder sb = new StringBuilder();
		
		int numOfChar = sc.nextInt();
		
		while( numOfChar-- > 0 ){
			int hp = sc.nextInt();
			int mp = sc.nextInt();
			int atk = sc.nextInt();
			int def = sc.nextInt();
			
			hp += sc.nextInt();
			if( hp < 1 ) hp = 1;
			
			mp += sc.nextInt();
			if( mp < 1 ) mp = 1;
			
			atk += sc.nextInt();
			if( atk < 0 ) atk = 0;
			
			def += sc.nextInt();
			
			sb.append( hp + 5*mp + 2*atk + 2*def + "\n" );
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
