package Q02525;

import java.util.Scanner;

public class Main {
	public static void main( String[] args ){
		Scanner sc = new Scanner( System.in );
		int hour = sc.nextInt();
		int min = sc.nextInt();
		int cookTime = sc.nextInt();
		
		hour = ( hour + (min + cookTime)/60 ) % 24;
		min = (min + cookTime) % 60;
		
		System.out.println( hour + " " + min );
		
		sc.close();
	}
}
