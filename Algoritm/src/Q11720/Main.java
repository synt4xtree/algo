package Q11720;

import java.util.Scanner;

public class Main {
	public static void main( String[] args ){
		Scanner sc = new Scanner( System.in );
		int n = sc.nextInt(); sc.nextLine();
		String input = sc.nextLine();
		int sum = 0;
		
		for( int i = 0 ; i < n ; ++i )
			sum += input.charAt(i);
		
		System.out.println( sum - ( n*'0') );
		
		sc.close();
	}
}