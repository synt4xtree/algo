package Q03024;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	static String[] board;
	static int n;
	
	public static void main( String[] args ) throws IOException{
		BufferedReader br = new BufferedReader( new InputStreamReader( System.in ) );
		n = Integer.parseInt( br.readLine() );
		board = new String[n];
		
		String winner = "ongoing";
		for( int i = 0 ; i < n ; ++i )
			board[i] = br.readLine();
		
		char cmp = '.';
		for( int column = 0 ; column < n ; ++column )
			for( int row = 0 ; row < n ; ++row )
				for( int move = 0 ; move < 4 ; ++move )
					if( ( cmp = solve( board[row].charAt(column), column, row, move ) ) != '.' ){
						System.out.println( cmp );
						return;
					}	
		
		System.out.println( winner );
		
		br.close();
	}
	
	static char solve( char cmp, int x, int y, int move ){
		switch( move ){
		case 0:
			if( x+2 < n && cmp == board[y].charAt(x+1) && cmp == board[y].charAt(x+2) )
				return cmp;
		case 1:
			if( y+2 < n && cmp == board[y+1].charAt(x) && cmp == board[y+2].charAt(x) )
				return cmp;
		case 2:
			if( x+2 < n && y+2 < n && cmp == board[y+1].charAt(x+1) && cmp == board[y+2].charAt(x+2) )
				return cmp;
		case 3:
			if( x-2 > 0 && y+2 < n && cmp == board[y+1].charAt(x-1) && cmp == board[y+2].charAt(x-2) )
				return cmp;
		}
		return '.';
	}
}
