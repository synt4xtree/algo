package Q01120;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main( String[] args ) throws IOException{
		BufferedReader br = new BufferedReader( new InputStreamReader( System.in ) );
		String[] inputs = br.readLine().split(" ");
		
		int length = inputs[1].length() - inputs[0].length() + 1;
		int min = Integer.MAX_VALUE;
		
		for( int i = 0 ; i < length ; ++i ){
			int distance = 0;
			
			for( int j = 0 ; j < inputs[0].length(); ++j )
				if( inputs[0].charAt(j) != inputs[1].charAt(i+j) )
					distance++;
			
			min = Math.min( distance, min );
		}
		
		System.out.println( min );
	}
}
