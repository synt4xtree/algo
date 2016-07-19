package Q01701;

import java.util.Scanner;

public class Main {
	public static void main( String[] args ){
		Scanner sc = new Scanner( System.in );
		String str = sc.nextLine();
		String pattern = null;
		int strlen = str.length();
		int maxlen = 0;
		
		for( int patternlen = 0 ; patternlen < strlen ; ++patternlen ){
			pattern = str.substring( patternlen, strlen );
			
			int temp = getBorder(pattern);
			if( temp > maxlen )
				maxlen = temp;
		}
		
		System.out.println( maxlen );
		
		sc.close();
	}
	
	static int getBorder( String pattern ){
		int patternlen = pattern.length();
		int begin = 1, matched = 0;
		int[] border = new int[patternlen + 1];
		int max = 0;
		while( begin + matched < patternlen ){
			if( pattern.charAt( begin + matched ) == pattern.charAt( matched ) ){
				matched++;
				border[begin + matched] = matched;
				if( border[begin + matched] > max )
					max = border[begin + matched];
			}
			else{
				if( matched == 0 )
					++begin;
				else{
					begin += matched - border[matched];
					matched = border[matched];
				}
			}			
		}
		
		return max;
	}
}
