package R10820;

import java.util.Scanner;

public class Main {
	public static void main( String[] args ) {
		Scanner sc = new Scanner( System.in );
		StringBuilder sb = new StringBuilder();
		
		while( sc.hasNext() ){
			String str = sc.nextLine();
			
			int upper = 0, lower = 0, space = 0, digit = 0;
			
			for( int i = 0 ; i < str.length() ; ++i ){
				char target = str.charAt(i);
				
				if( 'A' <= target && target <= 'Z' )
					upper++;
				else if( 'a' <= target && target <= 'z' )
					lower++;
				else if( '0' <= target && target <= '9' )
					digit++;
				else
					space++;
			}
			
			sb.append( lower + " " + upper + " " + digit + " " + space + '\n' );
		}
		
		System.out.println( sb );
		sc.close();
	}
}
