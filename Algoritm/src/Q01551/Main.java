package Q01551;

import java.util.Scanner;

public class Main {
	public static void main( String[] args ){
		Scanner sc = new Scanner( System.in );
		int n = sc.nextInt(), k = sc.nextInt(); sc.nextLine();
		String[] input = sc.nextLine().split(",");
		int[] nums = new int[input.length];
		
		for( int i = 0 ; i < input.length ; ++i )
			nums[i] = Integer.parseInt( input[i] );
		
		for( int j = 0 ; j < k ; ++j ){
			for( int i = 0 ; i < nums.length - 1 ; ++i )
				nums[i] = nums[i+1]-nums[i];
		}
		
		StringBuffer sb = new StringBuffer();
		for( int i = 0 ; i < nums.length - k - 1 ; ++i )
			sb.append( nums[i] ).append( "," );
		sb.append( nums[nums.length-1-k] );
		System.out.println( sb );
		
		sc.close();
	}
}