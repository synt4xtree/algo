package Q09465;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	public static void main( String[] args ) throws IOException{
		BufferedReader br = new BufferedReader( new InputStreamReader( System.in ) );
		//Scan sc = new Scan();
		//StringBuilder sb = new StringBuilder();
		BufferedWriter bw = new BufferedWriter( new OutputStreamWriter( System.out ) );
		int testcase = Integer.parseInt( br.readLine() );
		
		while( testcase-- > 0 ){
			int n = Integer.parseInt( br.readLine() );
			int[][] score = new int[n+1][2];
			int[][] cache = new int[n+1][3];
			//init
			String[] input = br.readLine().split(" ");
			for( int i = 1 ; i<= n ; ++i )
				score[i][0] = Integer.parseInt( input[i-1] );
			input = br.readLine().split(" ");
			for( int i = 1 ; i<= n ; ++i )
				score[i][1] = Integer.parseInt( input[i-1] );
			
			cache[1][0] = score[1][0];
			cache[1][1] = score[1][1];
			
			for( int i = 2 ; i <= n ; ++i ){
				cache[i][2] = Math.max( cache[i-1][2], Math.max( cache[i-1][0], cache[i-1][1] ) );
				cache[i][0] = score[i][0] + Math.max( cache[i-1][1], cache[i-1][2] );
				cache[i][1] = score[i][1] + Math.max( cache[i-1][0], cache[i-1][2] );
			}
			//sb.append( Math.max( cache[n][0], Math.max( cache[n][1], cache[n][2] ) ) + "\n" );
			bw.write( Math.max( cache[n][0], Math.max( cache[n][1], cache[n][2] ) ) + "\n" );
			/*cache[1][0] = score[1][0];
			cache[1][1] = score[1][1];
			
			//get cache
			for( int i = 2; i <= n ; ++i ){
				int temp = Math.max( cache[i-2][0], cache[i-2][1] );
				cache[i][0] = score[i][0] + Math.max( cache[i-1][1], temp );
				cache[i][1] = score[i][1] + Math.max( cache[i-1][0], temp );
			}
			
			sb.append( Math.max( cache[n][1], cache[n][0]) + "\n" );*/
		}
		//System.out.println( sb );
		bw.flush();
		bw.close();
		br.close();
	}
	/*
	static class Scan{
		BufferedReader br = new BufferedReader( new InputStreamReader( System.in ) );
		StringTokenizer st = null;
		
		int nextInt()throws IOException{
			if( st == null || !st.hasMoreTokens() )
				st = new StringTokenizer( br.readLine() );
			return Integer.parseInt( st.nextToken() );
		}
	}*/
}