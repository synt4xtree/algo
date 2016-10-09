package R10809;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
	public static void main( String[] args ) throws IOException{
		BufferedReader br = new BufferedReader( new InputStreamReader( System.in ) );
		String str = br.readLine();
		
		int[] alphabet = new int[26];
		Arrays.fill( alphabet, -1 );
		
		
		
		for( int i = 0 ; i < alphabet.length ; ++i )
			System.out.print( alphabet[i] + " " );
		
		br.close();
	}
}
