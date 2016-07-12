package Q01193;

import java.util.Scanner;

public class Main {
	public static void main( String[] args ){
		Scanner sc = new Scanner( System.in );
		int x = sc.nextInt();
		int limit = (int)Math.sqrt( 20000000 );
		
		for( int n = 1 ; n <= limit ; ++n )
			if( n*(n+1) / 2 >= x ){
				int m = (n*(n+1)/2) - x;
				if( n%2 == 0)
					System.out.println( (n-m) + "/" + (m+1) );
				else
					System.out.println( (m+1) + "/" + (n-m) );
				break;
			}
		
		sc.close();
	}
}