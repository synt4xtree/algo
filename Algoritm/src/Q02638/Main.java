package Q02638;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
	public static void main( String[] args ) throws IOException{
		Scan sc = new Scan();
		
		int n = sc.nextInt(), m = sc.nextInt();
		int[][] map = new int[n][m];
		boolean[][] visited = new boolean[n][m];
		int[] mx = { 1,-1, 0, 0 };
		int[] my = { 0, 0,-1, 1 };
		
		for( int i = 0 ; i < n ; ++i )
			for( int j = 0 ; j < m ; ++j )
				map[i][j] = sc.nextInt();
		
		int air = 0, cheeze = 0, time = 0, max = n*m;
		Queue<Point> q = new LinkedList<Point>();
		
		
		while( air + cheeze < max ){
			air = 0; cheeze = 0;
			time++;

			for( int i = 0 ; i < n ; ++i )
				for( int j = 0 ; j < m ; ++j )
					visited[i][j] = false;
			
			q.add( new Point( 0, 0 ) );
			
			while( !q.isEmpty() ){
				int x = q.peek().getX();
				int y = q.peek().getY();
				q.poll();
				
				for( int i = 0 ; i < mx.length ; ++i ){
					int nx = x + mx[i];
					int ny = y + my[i];
					
					if( nx < 0 || ny < 0 || nx == m || ny == n )
						continue;
					
					if( map[ny][nx] == 0 && !visited[ny][nx] ){
						visited[ny][nx] = true;
						air++;
						q.add( new Point( nx, ny ) );
					} else if( map[ny][nx] == 1 ){
						if( visited[ny][nx] ){
							map[ny][nx] = 0;
							cheeze++;
						}
						
						visited[ny][nx] = true;
					}
				}
			}
		}
		
		System.out.println( time );
	}
	
	static class Point{
		int x;
		int y;
		
		Point( int x, int y ){
			this.x = x;
			this.y = y;
		}
		
		int getX(){
			return this.x;
		}
		int getY(){
			return this.y;
		}
		
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
