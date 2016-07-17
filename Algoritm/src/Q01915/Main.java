package Q01915;

import java.util.Scanner;

public class Main {
	public static void main( String[] args ){
		Scanner sc = new Scanner( System.in );
		int n = sc.nextInt(), m = sc.nextInt(); sc.nextLine();
		String[] map = new String[n];
		int[][] check = new int[n][m];
		
		for( int i = 0 ; i < n ; ++i )
			map[i] = sc.nextLine();
		
		int maxlen = Integer.MIN_VALUE;
		for( int i = 0 ; i < n ; ++i ){
			for( int j = 0 ; j < m ; ++j ){
				
				if( map[i].charAt(j) == '0' ){
					check[i][j] = 0;
					
				} else {
					if( i-1 < 0 || j-1 < 0 )
						check[i][j] = 1;
					else{
						int min = Math.min(check[i-1][j], Math.min(check[i][j-1], check[i-1][j-1]) );
						check[i][j] = min + 1;
					}
					maxlen = Math.max( maxlen, check[i][j] );
				}
			}
		}
		
		System.out.println( maxlen*maxlen );
		sc.close();
	}
}
