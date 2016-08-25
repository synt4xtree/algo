package Q11726;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main( String[] args ) throws IOException{
		BufferedReader br = new BufferedReader( new InputStreamReader( System.in ) );
		int n = Integer.parseInt( br.readLine().trim() );
		
		int[] cache = new int[n+1];
		cache[1] = 1; cache[0] = 1;//2의 처리를 위해
		
		for( int i = 2 ; i <= n ; ++i )
			cache[i] = ( cache[i-1] + cache[i-2] ) % 10007;
		
		System.out.println( cache[n] );
		
		br.close();
	}
}
/*import java.util.Scanner;

public class Main {
    static int memo[];
    public static void main( String[] args ){
        Scanner sc = new Scanner( System.in );
        int n = sc.nextInt();
        memo = new int[n+1];
         
        System.out.println( Get( n ) );
         
        sc.close();
    }
    public static int Get( int n ){
        if( memo[n] > 0 )
            return memo[n];
         
        if( n < 2 )
            return memo[n] = 1;
         
        return memo[n] = (Get( n - 1 ) + Get( n - 2 )) % 10007;
    }
}*/