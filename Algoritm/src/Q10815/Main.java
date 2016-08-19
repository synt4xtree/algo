package Q10815;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	public static void main( String[] args ) throws IOException{
		Scan sc = new Scan();
		int n = sc.nextInt();
		int[] nums = new int[n];
		
		for( int i = 0 ; i < n; ++i )
			nums[i] = sc.nextInt();
		
		Arrays.sort( nums );
		
		int m = sc.nextInt();
		StringBuffer sb = new StringBuffer();
		
		for( int i = 0 ; i < m ; ++i )				
			sb.append( ( Arrays.binarySearch( nums, sc.nextInt() ) >= 0 ) ? 1 : 0 ).append(" ");
		
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
	
