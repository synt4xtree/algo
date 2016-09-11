package Q02908;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main( String[] args ) throws IOException{
		BufferedReader br = new BufferedReader( new InputStreamReader( System.in ) );
		String[] inputs = br.readLine().split(" ");
		
		int x = getReverse( Integer.parseInt( inputs[0] ) );
		int y = getReverse( Integer.parseInt( inputs[1] ) );
		
		System.out.println( x > y ? x : y );
		
		br.close();
	}
	public static int getReverse( int n ){
		int x = 0;
		while( n > 0 ){
			x *= 10;
			x += n%10;
			n /= 10;
		}
		
		return x;
	}
}
