package R10824;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main( String[] args ) throws IOException{
		BufferedReader br = new BufferedReader( new InputStreamReader( System.in ) );
		String[] inputs = br.readLine().split(" ");
		
		long ab = Long.parseLong( inputs[0] + inputs[1] );
		long cd = Long.parseLong( inputs[2] + inputs[3] );
		
		System.out.println( ab + cd );
		br.close();
	}
}
