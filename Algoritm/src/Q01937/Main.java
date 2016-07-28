package Q01937;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	static int n;
	
	static int[][] map;
	static int[][] cache;
	
	static int[] mx = { 1,-1, 0, 0 };
	static int[] my = { 0, 0, 1,-1 };
	
	public static void main( String[] args ) throws IOException{
		Scan sc = new Scan();
		
		n = sc.nextInt();
		map = new int[n][n];
		cache = new int[n][n];
		
		//init map
		for( int i = 0 ; i < n ; ++i )
			for( int j = 0 ; j < n ; ++j )
				map[i][j] = sc.nextInt();
		
		int max = Integer.MIN_VALUE;
		for( int i = 0 ; i < n ; ++i )
			for( int j = 0 ; j < n ; ++j )
				max = Math.max( max, GetDay( j, i ) );
		
		System.out.println( max );
	}
	
	static int GetDay( int x, int y ){
		
		if( cache[y][x] > 0 )
			return cache[y][x];
		
		int max = 0;
		for( int move = 0 ; move < mx.length ; ++move ){
			int nx = x + mx[move];
			int ny = y + my[move];
			
			if( nx < 0 || ny < 0 || nx >= n || ny >= n || map[ny][nx] <= map[y][x] )
				continue;
			
			max = Math.max( max, GetDay( nx, ny ) );
		}
		
		return cache[y][x] = 1 + max;
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
