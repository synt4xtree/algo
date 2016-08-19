package Q10991;

import java.util.Scanner;

public class Main {
	public static void main( String[] args ){
		Scanner sc = new Scanner( System.in );
		int n = sc.nextInt();
		StringBuilder sb = new StringBuilder();
		
		for( int i = 1 ; i <= n ; ++i ){
			for( int j = 0 ; j < n-i ; ++j )
				sb.append( " " );
			
			for( int j = 0 ; j < 2*i-1 ; ++j ){
				if( (j & 1) == 1 )
					sb.append( " " );
				else
					sb.append( "*" );
			}
			
			sb.append( "\n" );
		}
		System.out.println( sb );
		
		sc.close();
	}
}
