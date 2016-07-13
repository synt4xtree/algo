package Q02839;

import java.util.Scanner;

public class Main {
	public static void main( String[] args ){
		Scanner sc = new Scanner( System.in );
		int n = sc.nextInt() , length = n/5;
		int ans = -1;
		
		for( int i = length ; i >= 0 ; --i ){
			int remain = n - 5*i;
			if( remain%3 == 0 ){
				ans = remain/3 + i;
				break;
			}
		}

		System.out.println( ans > -1 ? ans : -1 );
		
		sc.close();
	}
}
