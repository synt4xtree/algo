package Q04673;

public class Main {
	static boolean[] selfNum = new boolean[10001];
	
	public static void main( String[] args ){
		StringBuilder sb = new StringBuilder();
		
		for( int i = 1 ; i <= 10000 ; ++i )
			if( !selfNum[i] ){
				sb.append( i + "\n" );
				checkSelfNum( i );
			}
		
		System.out.println( sb );
	}
	
	static void checkSelfNum( int n ){
		while( n <= 10000 ){
			int next = n;
			
			while( n > 0 ){
				next += n%10;
				n /= 10;
			}
			
			if( next > 10000 )
				return;
			
			selfNum[next] = true;
			n = next;
		}
	}
}
