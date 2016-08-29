package Q02133;

import java.util.Scanner;

public class Main {
	public static void main( String[] args ){
		Scanner sc = new Scanner( System.in );
		int n = sc.nextInt();
		int[] cache = new int[n+1];
		
		cache[0] = 1;
		cache[1] = 2;
		if( n > 1 )
			cache[2] = 3;
		
		for( int i = 4 ; i <= n ; i += 2 ){
			cache[i] = cache[i-2] * 3;
			
			int length = i-2;
			for( int j = 0 ; j < length ; j += 2 )
				cache[i] += cache[j]*2;
		}
		
		System.out.println( (n & 1 ) == 1 ? 0 : cache[n] );
		
		sc.close();
	}
}
