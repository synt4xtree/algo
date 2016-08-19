package Q10818;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main( String[] args ) throws IOException{
		Scan sc = new Scan();
		//stringbuilder는 멀티스레드 지원x
		int n = sc.nextInt();
		int max = Integer.MIN_VALUE, min = Integer.MAX_VALUE, num;
		for( int i = 0 ; i < n ; ++i ){
			num = sc.nextInt();
			max = Math.max( max, num );
			min = Math.min( min, num );
		}
		System.out.println( min + " " + max );
		
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
