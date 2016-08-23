package Q10824;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main( String[] args ) throws IOException{
		BufferedReader br = new BufferedReader( new InputStreamReader( System.in ) );
		String[] input = br.readLine().split(" ");
		
		System.out.println( Long.parseLong( input[0] + input[1] ) + Long.parseLong( input[2] + input[3] ) );
		
		br.close();
	}
}
