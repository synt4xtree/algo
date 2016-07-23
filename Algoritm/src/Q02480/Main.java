package Q02480;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main( String[] args ){
		Scanner sc = new Scanner( System.in );
		int[] num = new int[3];
		num[0] = sc.nextInt();
		num[1] = sc.nextInt();
		num[2] = sc.nextInt();
		
		Arrays.sort( num );
		
		int price = 0;
		if( num[0] == num[1] && num[1] == num[2] )
			price = 10000 + num[0]*1000;
		else if( num[0] != num[1] && num[0] != num[2] && num[1] != num[2] )
			price = num[2]*100;
		else
			price = 1000 + num[1]*100;
		
		System.out.println( price );
		
		sc.close();
	}
}