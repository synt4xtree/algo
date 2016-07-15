package Q01373;

import java.util.Scanner;

public class Main {
	public static void main( String[] args ){
		Scanner sc = new Scanner( System.in );
		StringBuffer sb = new StringBuffer();
		String input = sc.nextLine();
		
		int length = input.length() % 3;
		if( length == 1 )
			sb.append( "00" );
		else if( length == 2 )
			sb.append( "0" );
		
		length = input.length();
		for( int i = 0 ; i < length ; i += 3 ){
			sb.append( ( input.charAt(i)-'0') * 4 +
						( input.charAt(i+1)-'0') * 2 +
						( input.charAt(i+2)-'0') );
		}
		
		System.out.println( sb );
		
		sc.close();
	}
}