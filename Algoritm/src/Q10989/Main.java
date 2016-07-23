package Q10989;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	public static void main( String[] args ) throws Exception{
		Scan sc = new Scan();
		int n = sc.nextInt();
		int[] arr = new int[10001];
		
		for( int i = 0 ; i < n ; ++i )
			arr[sc.nextInt()]++;
				
		StringBuffer sb = new StringBuffer();
		for( int i = 0 ; i < 10001 ; ++i )
			for( int j = 0 ; j < arr[i] ; ++j )
				sb.append( i + "\n" );
		
		System.out.println( sb );
	}
	
	static class Scan{
		BufferedReader in = new BufferedReader( new InputStreamReader( System.in ) );
		
		int nextInt() throws Exception {
			return Integer.parseInt( in.readLine() );
		}
	}
}
