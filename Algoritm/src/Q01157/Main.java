package Q01157;

import java.util.Scanner;

public class Main {
	public static void main( String[] args ){
		Scanner sc = new Scanner( System.in );
		String input = sc.nextLine();
		input = input.toUpperCase();
		char[] inputs = input.toCharArray();
		int[] count = new int[26];
		
		for( int i = 0 ; i < inputs.length ; ++i )
			count[inputs[i]-'A']++;
			
		boolean over = false;
		int max = 0, idx = 0;
		
		for( int i = 0 ; i < count.length ; ++i ){
			if( max < count[i] ){
				max = count[i];
				idx = i;
				over = false;
			}
			else if( max == count[i] ){
				over = true;
			}
		}
		
		System.out.println( over ? '?' : (char)('A' + idx) );
		
		sc.close();
	}
}