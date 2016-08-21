package Q01018;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	static String[] board;
	public static void main( String[] args ) throws IOException{
		BufferedReader br = new BufferedReader( new InputStreamReader( System.in ) );
		String input = br.readLine();
		int n = Integer.parseInt( input.split(" ")[0] );
		int m = Integer.parseInt( input.split(" ")[1] );
		
		board = new String[n];
		for( int i = 0 ; i < n ; ++i )
			board[i] = br.readLine();
		
		int min = Integer.MAX_VALUE;
		for( int i = 0 ; i <= n-8 ; ++i )//n이 행 y
			for( int j = 0 ; j <= m-8 ; ++j )//m이 열 x
				min = Math.min( Check( j, i ), min );
				
		System.out.println( min );
	}
	
	static int Check( int x, int y ){
		int ret = 0;
		char standard = board[y].charAt(x);
		
		for( int i = y ; i < y+8 ; ++i )
			for( int j = x ; j < x+8 ; ++j )
				if( ((i+j)&1) == 1 ){//홀수이면 기준과 달라야한다
					if( standard == board[i].charAt(j) )
						ret++;
				} else {//짝수이면 기준과 같아야한다.
					if( standard != board[i].charAt(j) )
						ret++;
				}
				
		if( ret > 32 )
			ret = 64 - ret;
		return ret;
	}
}
