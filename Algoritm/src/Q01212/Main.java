package Q01212;

import java.util.Scanner;

public class Main {
	public static void main( String[] args ){
		Scanner sc = new Scanner( System.in );
		StringBuffer sb = new StringBuffer();
		String input = sc.nextLine();
		char[] nums = input.toCharArray();
		String tmp ="";
		
		sb.append( Integer.toBinaryString( nums[0] - '0' ) );
		for( int i = 1 ; i < nums.length ; ++i ){
			int num = (nums[i] - '0');
			
			switch( num ){
			case 0:
				tmp = "000";
				break;
			case 1:
				tmp = "001";
				break;
			case 2:
				tmp = "010";
				break;
			case 3:
				tmp = "011";
				break;
			case 4:
				tmp = "100";
				break;
			case 5:
				tmp = "101";
				break;
			case 6:
				tmp = "110";
				break;
			case 7:
				tmp = "111";
				break;
			}
			
			sb.append( tmp );
		}
		
		System.out.println( sb );
		sc.close();
	}
}