package Q11652;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class Main {
	public static void main( String[] args ) throws IOException{
		BufferedReader br = new BufferedReader( new InputStreamReader( System.in ) );
		int n = Integer.parseInt( br.readLine() );
		
		TreeMap<Long, Integer> map = new TreeMap();
		
		while( n-- > 0 ){
			long target = Long.parseLong( br.readLine() );
			if( map.containsKey( target ) ){
				int value = (int) map.get( target );
				map.put( target, value + 1 );
			} else {
				map.put( target, 1 );
			}
		}
		
		Set set = map.entrySet();
		List list = new ArrayList( set );
		
		Collections.sort( list, new ValueComparator() );
		
		System.out.println( ( (Map.Entry)list.get(0) ).getKey() );
	}
	
	static class ValueComparator implements Comparator {

		@Override
		public int compare(Object arg0, Object arg1) {
			if( arg0 instanceof Map.Entry && arg1 instanceof Map.Entry ){
				Map.Entry e1 = (Map.Entry)arg0;
				Map.Entry e2 = (Map.Entry)arg1;
				
				int v1 = (int) e1.getValue();
				int v2 = (int) e2.getValue();
				
				return v2 - v1;
			}
			else
				return -1;
		}
	}
}
