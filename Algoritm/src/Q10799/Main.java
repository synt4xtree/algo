package Q10799;

import java.util.Scanner;

public class Main {
	public static void main( String[] args ){
		Scanner sc = new Scanner( System.in );
		String str = sc.nextLine();
		
		int stack = 0;
		int ans = 0;
		
		for( int i = 0 ; i < str.length() ; ++i ){
			if( str.charAt(i) == ')' ){
				if( str.charAt(i-1) == '(' )
					ans += stack-1;
				else
					ans++;
				stack--;
			} else {
				stack++;
			}
		}
		
		System.out.println( ans );
		
		sc.close();
	}
}
