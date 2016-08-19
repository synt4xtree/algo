package Q02445;

import java.util.Scanner;

public class Main {
	static int n;
	public static void main( String[] args ){
		Scanner sc = new Scanner( System.in );
		n = sc.nextInt();
		StringBuilder sb = new StringBuilder();
		
		for( int i = 1 ; i <= n ; ++i )
			PutStar( sb, i );
		for( int i = n-1 ; i >= 1 ; --i )
			PutStar( sb, i );
		System.out.println( sb );
		sc.close();
	}
	static void PutStar( StringBuilder sb, int i ){
		for( int j = 0 ; j < i ; ++j )
			sb.append( "*" );
		for( int j = 0 ; j < 2*(n-i) ; ++j )
			sb.append( " " );
		for( int j = 0 ; j < i ; ++j )
			sb.append( "*" );
		sb.append( "\n" );
	}
}
