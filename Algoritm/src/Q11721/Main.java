package Q11721;

import java.util.Scanner;

public class Main {
	public static void main( String[] args ){
		Scanner sc = new Scanner( System.in );
		String input = sc.nextLine();
		int len = input.length()/10;
		
		if( len != 0 )
			for( int i = 0 ; i < len ;++i )
				System.out.println( input.substring( i*10, (i+1)*10 ) );
		System.out.print( input.substring( len*10 ) );
		
		sc.close();
	}
}
/*
	char[] inputs = input.toCharArray();
	
	sb.append( inputs[0] );
	for( int i = 1 ; i < inputs.length ; ++i ){
		if( i%10 == 0 )
			sb.append("\n");
		sb.append( inputs[i] );
	}
*/

/*
	while( true ){
		if( input.length() <= 10 ){
			sb.append( input.substring( 0, input.length() ) );
			break;
		}
		
		sb.append( input.substring(0, 10) + "\n");
		input = input.substring( 10 );
	}
*/