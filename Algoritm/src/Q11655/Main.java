package Q11655;

import java.util.Scanner;

public class Main {
	public static void main( String[] args ){
		Scanner sc = new Scanner( System.in );
		String input = sc.nextLine();
		int length = input.length();
		StringBuilder sb = new StringBuilder();
		
		for( int i = 0 ; i < length ; ++i ){
			char target = input.charAt( i );
			
			if( 'a' <= target && target <= 'z' ){
				target += 13;
				if( target > 'z' )
					target -= 26;
			} else if( 'A' <= target && target <= 'Z' ){
				target += 13;
				if( target > 'Z' )
					target -= 26;
			}
			
			sb.append( target );
		}
		
		System.out.println( sb );
		
		sc.close();
	}
}
