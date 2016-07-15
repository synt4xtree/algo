package Q02667;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
	static int[] mx = { 1,-1, 0, 0 };
	static int[] my = { 0, 0,-1, 1 };
	static String[] map;
	static boolean[][] check;
	static int n;
	
	public static void main( String[] args ) throws IOException{
		Scanner sc = new Scanner( System.in );
		n = sc.nextInt(); sc.nextLine();
		map = new String[n];
		check = new boolean[n][n];
		
		for( int i = 0 ; i < n ; ++i )
				map[i] = sc.nextLine();
		
		List<Integer> list = new ArrayList<Integer>();
		
		int groupNum = 0;
		
		for( int i = 0 ; i < n ; ++i )
			for( int j = 0 ; j < n ; ++j ){
				if( map[i].charAt(j) == '1' && !check[i][j] ){
					groupNum++;
					list.add( DFS( i, j ) );
				}
			}
		
		Collections.sort( list );
		System.out.println( groupNum );
		for( int i : list )
			System.out.println( i );
		
		sc.close();
	}
	
	
	static int DFS( int y, int x ){
		int num = 1;
		check[y][x] = true;
		
		for( int i = 0 ; i < mx.length ; ++i ){
			int nextY = y + my[i];
			int nextX = x + mx[i];
			if( nextX >= 0 && nextY >= 0 && nextX < n && nextY < n && map[nextY].charAt(nextX) == '1' && !check[nextY][nextX] )
				num += DFS( nextY, nextX );
		}
		
		return num;
	}
}
