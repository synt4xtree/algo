package Q01058;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main( String[] args ) throws IOException {
		BufferedReader br = new BufferedReader( new InputStreamReader( System.in ) );
		int n = Integer.parseInt( br.readLine() );
		char[][] friend = new char[n][];
		
		for( int i = 0 ; i < n ; ++i )
			friend[i] = br.readLine().toCharArray();
		
		for( int k = 0 ; k < n ; ++k )//제3의 친구
			for( int i = 0 ; i < n ; ++i )
				for( int j = 0 ; j < n ; ++j ){
					if( i == j || friend[i][j] == 'Y' )
						continue;
					if( friend[i][k] == 'Y' && friend[k][j] == 'Y' )
						friend[i][j] = 'T';
				}
		
		int max = 0;
		for( int i = 0 ; i < n ; ++i ){
			int cnt = 0;
			for( int j = 0 ; j < n ; ++j ){
				if( friend[i][j] == 'Y' || friend[i][j] == 'T' )
					cnt++;
			}
			max = Math.max( max, cnt );
		}
		
		System.out.println( max );
		br.close();
	}
}
