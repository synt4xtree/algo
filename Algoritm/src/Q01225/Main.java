package Q01225;

import java.util.Scanner;

public class Main {
	public static void main( String[] args ){
		Scanner sc = new Scanner( System.in );
		String[] num = sc.nextLine().split(" ");
		
		long[] x = new long[2];
		
		for( int i = 0 ; i < num.length ; ++i )
			for( int j = 0 ; j < num[i].length() ; ++j )
				x[i] += num[i].charAt(j) - '0';
		
		System.out.println( x[0] * x[1] );
		sc.close();
	}
}