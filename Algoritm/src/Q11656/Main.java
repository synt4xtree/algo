package Q11656;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
	public static void main( String[] args ) throws IOException {
		BufferedReader br = new BufferedReader( new InputStreamReader( System.in ) );
		String input = br.readLine();
		int length = input.length();
		String[] output = new String[length];
		
		for( int i = 0 ; i < length ; ++i )
			output[i] = input.substring(i);
		Arrays.sort( output );
		
		StringBuilder sb = new StringBuilder();
		for( String s : output )
			sb.append( s + "\n" );
		
		System.out.println( sb );
		br.close();
	}
}
