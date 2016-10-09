package R11656;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
	public static void main( String[] args ) throws IOException{
		BufferedReader br = new BufferedReader( new InputStreamReader( System.in ) );
		StringBuilder sb = new StringBuilder();
		String origin = br.readLine();
		
		List<String> list = new ArrayList<String>();
		for( int i = 0 ; i < origin.length() ; ++i )
			list.add( origin.substring( i ) );
		
		Collections.sort( list );
		
		for( int i = 0 ; i < list.size() ; ++i )
			sb.append( list.get(i) + '\n' );
		
		System.out.println( sb );
		br.close();
	}
}
