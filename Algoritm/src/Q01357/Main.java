package Q01357;

import java.util.Scanner;

public class Main {
	public static void main( String[] args ){
		Scanner sc = new Scanner( System.in );
		String[] inputs = sc.nextLine().split(" ");
		char[] x = inputs[0].toCharArray();
		char[] y = inputs[1].toCharArray();
		
		swap( x, x.length );
		swap( y, y.length );
		
		char[] modifiedChar = ( String.valueOf( Integer.parseInt( String.valueOf(x) ) + Integer.parseInt( String.valueOf(y) ) ) ).toCharArray();
		swap( modifiedChar, modifiedChar.length );
		
		System.out.println( Integer.parseInt( String.valueOf( modifiedChar ) ) );
		
		sc.close();
	}
	
	static void swap( char[] array, int length ){
		char temp;
		for( int i = 0 ; i < length/2 ; ++i ){
			temp = array[i];
			array[i] = array[length-1 - i];
			array[length-1 -i] = temp;
		}
	}
}
/* Rev( Rev( x ) + Rev( y ) );
 * static int Rev(int n){
        int nn=0;
        while(n>0){
            nn*=10;
            nn+=n%10;
            n/=10;
        }
        return nn;
    }
 */
