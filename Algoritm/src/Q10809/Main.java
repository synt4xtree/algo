package Q10809;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main( String[] args ){
		Scanner sc = new Scanner( System.in );
		String input = sc.nextLine();
		int length = input.length();
		int[] idx = new int[26];
		Arrays.fill( idx, -1 );
		
		
		for( int i = 0 ; i < 26 ; ++i )
			for( int j = 0 ; j < length ; ++j )
				if( input.charAt(j) == 'a' + i ){
					idx[i] = j;
					break;
				}
		
		for( int i = 0 ; i < 26 ; ++i )
			System.out.print( idx[i] + " " );
		
		sc.close();
	}
}
