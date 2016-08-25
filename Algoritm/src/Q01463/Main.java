package Q01463;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
	static int[] cache;
	public static void main( String[] args )throws IOException{
		BufferedReader br = new BufferedReader( new InputStreamReader( System.in ) );
		int n = Integer.parseInt( br.readLine() );
		cache = new int[n+1];
		Arrays.fill( cache, -1 );
		cache[1] = 0;
		
		//Bottom-Up
		for( int i = 2 ; i <= n ; ++i ){
			if( i%3 == 0 )
				cache[i] = cache[i/3] + 1;
			else if( i%2 == 0 )
				cache[i] = Math.min( cache[i/2], cache[i-1] ) + 1;
			else
				cache[i] = cache[i-1] + 1;
		}
		System.out.println( cache[n] );
		
		//Top-Down
		//System.out.println( getCache(n) );
		
		br.close();
	}
	
	static int getCache( int n ){
		if( cache[n] > -1 )
			return cache[n];
		
		if( n%3 == 0 )
			cache[n] = getCache(n/3)+ 1;
		else if( n%2 == 0 )
			cache[n] = Math.min( getCache(n/2), getCache(n-1) ) + 1;
		else 
			cache[n] = getCache(n-1) + 1;
		
		return cache[n];
	}
}
/*
 * public static int Recur( int n ){
         
        if( n == 1 )
            return 0;
         
        else if( n % 3 == 0 )
            return Recur( n / 3 ) + 1;
         
        else if( n % 2 == 0 )
            return Math.min( Recur( n - 1 ) + 1 , Recur( n / 2 ) + 1 );
        else
            return Recur( n - 1 ) + 1;
    }
 */
