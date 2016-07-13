package Q04435;

import java.util.Scanner;

public class Main {
	
	final static int[] gan = { 1, 2, 3, 3, 4, 10 };
	final static int[] sa = { 1, 2, 2, 2, 3, 5, 10 }; 
	
	public static void main( String[] args ){
		Scanner sc = new Scanner( System.in );
		StringBuffer sb = new StringBuffer();
		int t = sc.nextInt();
		
		for( int testcase = 1 ; testcase <= t ; ++testcase ){
			int gsum = 0, ssum = 0;
			
			for( int i = 0 ; i < 6 ; ++i )
				gsum += gan[i] * sc.nextInt();
			
			for( int i = 0 ; i < 7 ; ++i )
				ssum += sa[i] * sc.nextInt();
			
			if( gsum > ssum )
				sb.append( "Battle " + testcase + ": Good triumphs over Evil\n" );
			else if( gsum < ssum )
				sb.append( "Battle " + testcase + ": Evil eradicates all trace of Good\n" );
			else
				sb.append( "Battle " + testcase + ": No victor on this battle field\n" );
		}
		
		System.out.println( sb );
		sc.close();
	}
}
