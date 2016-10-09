package Q01252;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main( String[] args ) throws IOException{
		BufferedReader br = new BufferedReader( new InputStreamReader( System.in ) );
		String[] binary = br.readLine().split(" ");
		br.close();
		
		System.out.println( BinaryAdder( binary[0], binary[1] ) );
	}
	
	
	static String BinaryAdder( String num1, String num2 ){
		StringBuilder sb = new StringBuilder();
		int carry = 0;
		int idx_front = num1.length() - 1;
		int idx_back = num2.length() - 1;
		
		while( idx_front > -1 && idx_back > -1 ){
			int front = num1.charAt( idx_front-- ) - '0';
			int back = num2.charAt( idx_back-- ) - '0';
			int sum = front + back + carry;
			
			if( sum > 1 ){
				carry = 1;
				sb.append( sum == 3 ? 1 : 0 );
			} else {
				carry = 0;
				sb.append( sum );
			}
		}
		
		while( idx_front > -1 ){
			int num = num1.charAt( idx_front-- ) - '0';
			int sum = num + carry;
			if( sum > 1 ){
				carry = 1;
				sb.append( 0 );
			} else {
				carry = 0;
				sb.append( sum );
			}
		}
		
		while( idx_back > -1 ){
			int num = num2.charAt( idx_back-- ) - '0';
			int sum = num + carry;
			if( sum > 1 ){
				carry = 1;
				sb.append( 0 );
			} else {
				carry = 0;
				sb.append( sum );
			}
		}
		
		sb.append( carry );
		String ret = sb.reverse().toString();
		
		int idx = 0;
		while( idx < ret.length() && ret.charAt(idx) == '0' ) idx++;
		
		ret = ret.substring( idx );
		
		if( ret.length() < 1 )
			ret = "0";
		
		return ret;
	}
}
