package R01158;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {
	public static void main( String[] args ) throws IOException{
		BufferedReader br = new BufferedReader( new InputStreamReader( System.in ) );
		String[] inputs = br.readLine().split(" ");
		List<Integer> list = new ArrayList<Integer>();//linkedList보다 빠르더라..
		StringBuilder sb = new StringBuilder("<");
		
		int n = Integer.parseInt( inputs[0] );
		int m = Integer.parseInt( inputs[1] ) - 1;
		
		for( int i = 1 ; i <= n ; ++i )
			list.add( i );
		
		int idx = 0;
		while( !list.isEmpty() ){
			idx += m;
			
			if( idx >= list.size() )
				idx %= list.size();
			
			sb.append( list.remove(idx) + ", " );
			
		}
		
		sb.replace( sb.length()-2, sb.length()-1, ">" );
		System.out.println( sb );
		
		br.close();
	}
}
