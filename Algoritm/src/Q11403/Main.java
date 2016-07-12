package Q11403;

import java.util.Scanner;

/* 
 * 플로이드 와샬 알고리즘
 */

public class Main {
	public static void main( String[] args ){
		Scanner sc = new Scanner( System.in );
		int n = sc.nextInt();
		int[][] graph = new int[n][n];
		
		for( int i = 0 ; i < n ; ++i )
			for( int j = 0 ; j < n ; ++j )
				graph[i][j] = sc.nextInt();
		
		for( int k = 0 ; k < n ; ++k )
			for( int i = 0 ; i < n ; ++i )
				for( int j = 0 ; j < n ; ++j )
					if( graph[i][j] == 1 || graph[i][k] + graph[k][j] == 2 )
						graph[i][j] = 1;
		
		
		for( int i = 0 ; i < n ; ++i ){
			for( int j = 0 ; j < n ; ++j )
				System.out.print( graph[i][j] + " ");
			System.out.println();
		}
		
		sc.close();
	}
}

/*
 * if(data[i][j]==1||data[i][k]+data[k][j]==2) data[i][j]=1;
 */
