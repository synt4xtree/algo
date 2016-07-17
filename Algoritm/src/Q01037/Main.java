package Q01037;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main( String[] args ){
		Scanner sc = new Scanner( System.in );
		int n = sc.nextInt();
		int[] nums = new int[n];
		
		for( int i = 0 ; i < n ; ++i )
			nums[i] = sc.nextInt();
		
		Arrays.sort( nums );
		System.out.println( nums[0] * nums[n-1] );
		
		sc.close();
	}
}
