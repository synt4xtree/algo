package Q11718;

import java.io.IOException;
import java.util.Scanner;

public class Main {
	public static void main( String[] args ) throws IOException{
		Scanner sc = new Scanner( System.in );
		StringBuffer sb = new StringBuffer();
		
		while( sc.hasNext() )
			sb.append( sc.nextLine() + "\n" );
		
		System.out.println( sb );
		sc.close();
	}
}
