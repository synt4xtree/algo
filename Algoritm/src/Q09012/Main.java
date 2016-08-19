package Q09012;

import java.util.Scanner;

public class Main {
	public static void main( String[] args ){
		Scanner sc = new Scanner( System.in );
		int testcase = sc.nextInt(); sc.nextLine();
		
		StringBuilder sb = new StringBuilder();
		for( int i = 0 ; i < testcase ; ++i )
			sb.append( Get( sc.nextLine() ) + "\n" );
		
		System.out.println( sb );
		sc.close();
	}
	
	static String Get( String str ){
		int length = str.length();
		int cnt = 0;
		
		for( int j = 0 ; j < length ; ++j ){
			if( str.charAt(j) == '(' )
				cnt++;
			else
				cnt--;
			
			if( cnt < 0 ){
				return "NO";
			}

		}
		if( cnt == 0 )
			return "YES";
		else
			return "NO";
	}
}
