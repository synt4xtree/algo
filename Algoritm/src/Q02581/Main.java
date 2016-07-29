package Q02581;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main( String[] args ){
		Scanner sc = new Scanner( System.in );
		
		int m = sc.nextInt(), n = sc.nextInt();
		
		boolean[] notPrime = new boolean[n+1];
		notPrime[0] = notPrime[1] = true;
		
		List<Integer> list = new ArrayList<Integer>();
		
		for( int i = 2 ; i <= n ; ++i ){
			if( notPrime[i] ) continue;
			
			if( i >= m )
				list.add( i );
			
			for( int j = 2*i ; j <= n ; j += i )
				notPrime[j] = true;
		}
		
		int sum = 0, min;
		
		if( list.isEmpty() ){
			System.out.println( -1 );
			return;
		}
		
		for( int i : list )
			sum += i;
		min = list.get( 0 );
		
		
		System.out.println( sum + "\n" + min );
		
		sc.close();
	}
}
