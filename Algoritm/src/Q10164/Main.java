package Q10164;

import java.util.Scanner;

public class Main {
	static int[][] dp;
	final static int[] mx = { 0,-1 };
	final static int[] my = {-1, 0 };
	public static void main( String[] args ){
		Scanner sc = new Scanner( System.in );
		int n = sc.nextInt(), m = sc.nextInt(), k = sc.nextInt();
		dp = new int[n][m];
		dp[0][0] = 1;
		
		if( k == 0 ){
			getDP( 0, 0, m-1, n-1 );
		} else {
			int ky = (k-1)/m;
			int kx = (k-1)%m;
		
			getDP( 0, 0, kx, ky );
			getDP( kx, ky, m-1, n-1 );
		}
		
		System.out.println( dp[n-1][m-1] );
		
		sc.close();
	}
	
	static void getDP( int sx, int sy, int ex, int ey ){
		for( int i = sy ; i <= ey ; ++i ){
			for( int j = sx ; j <= ex ; ++j ){
				for( int k = 0 ; k < mx.length ; ++k ){
					int nx = j + mx[k];
					int ny = i + my[k];
					
					if( nx < sx || ny < sy )
						continue;
					
					dp[i][j] += dp[ny][nx];
				}
			}
		}
	}
}
