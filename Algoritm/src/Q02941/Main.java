package Q02941;

import java.util.Scanner;

public class Main {
	public static void main( String[] args ){
		Scanner sc = new Scanner( System.in );
		String input = sc.nextLine();
		
		input.replaceAll("[^(C=|C-|dz=|d-|lj|nj|s=|z=)]", "");
		System.out.println( input );
		
		sc.close();
	}
}
