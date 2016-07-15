package Q02636;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
	public static void main( String[] args ) throws IOException{
		Scan sc = new Scan();
		int height = sc.nextInt(), width = sc.nextInt();
		int[][] map = new int[height][width];
		int[] mx = { 1,-1, 0, 0 };
		int[] my = { 0, 0,-1, 1 };
		
		for( int i = 0 ; i < height ; ++i )
			for( int j = 0 ; j < width ; ++j )
				map[i][j] = sc.nextInt();
		
		final int total = height * width;
		int cheeze = 0;
		int air = 0;
		int time = 0;
		while( air + cheeze < total ){
			time++;
			cheeze = 0; air = 0;
			
			Queue<Position> q = new LinkedList<Position>();
			boolean[][] check = new boolean[height][width];
			q.add( new Position( 0, 0 ) );
			
			while( !q.isEmpty() ){
				int curX = q.peek().getX();
				int curY = q.peek().getY();
				q.poll();
				
				for( int i = 0 ; i < mx.length ; ++i ){
					int nextX = curX + mx[i];
					int nextY = curY + my[i];
					
					if( nextX >= 0 && nextY >=0 && nextX < width && nextY < height && !check[nextY][nextX] ){
						
						check[nextY][nextX] = true;
						
						if( map[nextY][nextX] == 1 ){
							cheeze++;
							map[nextY][nextX] = 0;
						} else {
							air++;
							q.add( new Position( nextX, nextY ) );
						}
					}
				}
			}
		}
		
		System.out.print( time + "\n" + cheeze );
		
	}
	
	static class Position{
		int x;
		int y;
		
		Position( int x, int y ){
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