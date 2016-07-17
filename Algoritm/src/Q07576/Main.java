package Q07576;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
	public static void main( String[] args ) throws IOException{
		
		final int INF = 987654321;
		int[] mx = { 1,-1, 0, 0 };
		int[] my = { 0, 0,-1, 1 };
		
		Scan sc = new Scan();
		int m = sc.nextInt(), n = sc.nextInt();
		
		int[][] tomato = new int[n][m];
		int[][] distance = new int[n][m];
		
		
		Queue<Point> q = new LinkedList<Point>();
		
		for( int i = 0 ; i < n ; ++i )
			for( int j = 0 ; j < m ; ++j ){
				tomato[i][j] = sc.nextInt();
				
				if( tomato[i][j] != 0 ){
					distance[i][j] = tomato[i][j];
					if( tomato[i][j] == 1 )
						q.add( new Point( j , i ) );
				} else {
					distance[i][j] = INF;
				}
			}
		
		int max = Integer.MIN_VALUE;
		while( !q.isEmpty() ){
			int cx = q.peek().getX();
			int cy = q.peek().getY();
			q.poll();
			max = Math.max( max, distance[cy][cx] );
			
			for( int i = 0 ; i < mx.length ; ++i ){
				int nx = cx + mx[i];
				int ny = cy + my[i];
				
				if( nx < 0 || ny < 0 || nx == m || ny == n || tomato[ny][nx] != 0 )
					continue;
				
				if( distance[cy][cx] + 1 < distance[ny][nx] ){
					distance[ny][nx] = distance[cy][cx] + 1;
					q.add( new Point( nx, ny ) );
				}
			}			
		}
		
		
		for( int i = 0 ; i < n ; ++i )
			for( int j = 0 ; j < m ; ++j ){
				if( distance[i][j] == INF ){
					System.out.println( -1 );
					return;
				}
			}
		
		System.out.println( max - 1 );
		
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
