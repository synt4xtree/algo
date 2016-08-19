package Q02292;

import java.util.Scanner;

public class Main {
	public static void main( String[] args ){
		Scanner sc = new Scanner( System.in );
		int n = sc.nextInt()-1;
		int ans = 1;
		int minus = 6;
		
		while( n > 0 ){
			n -= minus;
			minus += 6;
			ans++;
		}
		
		System.out.println( ans );
		sc.close();
	}
}
//Math.sqrt(12*n-4)+9)/16...?