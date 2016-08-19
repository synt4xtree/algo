package Q10992;

import java.util.Scanner;

public class Main {
	public static void main( String[] args ){
		Scanner sc = new Scanner( System.in );
		int n = sc.nextInt();
		StringBuilder sb = new StringBuilder();
		
		for( int i = 1 ; i < n ; ++i ){
			for( int j = 0 ; j < n-i ; ++j )
				sb.append( " " );
			for( int j = 0 ; j < 2*i ; ++j ){
				if( j == 0 || j == 2*i-2 )
					sb.append( "*" );
				else
					sb.append( " " );
			}
			sb.append( "\n" );
		}
		for( int j = 0 ; j < 2*n-1 ; ++j )
			sb.append( "*" );
		
		System.out.println( sb );
		sc.close();
	}
}
