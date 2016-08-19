package Q02577;

import java.util.Scanner;

public class Main {
	public static void main( String[] args ){
		Scanner sc = new Scanner( System.in );
		int num = 1;
		int[] stack = new int[10]; 
		for( int i = 0 ; i < 3; ++i )
			num *= sc.nextInt();
		
		while( num > 0 ){
			stack[num%10]++;
			num /= 10;
		}
		
		for( int i : stack ){
			System.out.println( i );
		}
		
		sc.close();
	}
}
