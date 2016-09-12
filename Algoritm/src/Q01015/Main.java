package Q01015;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.StringTokenizer;

public class Main {
	public static void main( String[] args ) throws IOException{
		Scan sc = new Scan();
		int n = sc.nextInt();
		List<DS> list = new ArrayList<DS>();
		
		for( int i = 0 ; i < n ; ++i )
			list.add( new DS( sc.nextInt(), i ) );
		
		Collections.sort( list, new ByNum() );
		for( int i = 0 ; i < n ; ++i )
			list.get(i).setNum( i );
		Collections.sort( list, new ByIdx() );
		
		StringBuilder sb = new StringBuilder();
		for( DS ds : list )
			sb.append( ds.getNum() + " " );
		
		System.out.println( sb );
	}
	
	static class ByNum implements Comparator{
		@Override
		public int compare(Object arg0, Object arg1) {
			DS ds1 = (DS) arg0;
			DS ds2 = (DS) arg1;
			
			if( ds1.getNum() < ds2.getNum() )
				return -1;
			else if ( ds1.getNum() > ds2.getNum() )
				return 1;
			else
				return 0;
		}
	}
	
	static class ByIdx implements Comparator{
		@Override
		public int compare(Object arg0, Object arg1) {
			DS ds1 = (DS) arg0;
			DS ds2 = (DS) arg1;
			
			if( ds1.getIdx() < ds2.getIdx() )
				return -1;
			else if ( ds1.getIdx() > ds2.getIdx() )
				return 1;
			else
				return 0;
		}
	}
	
	static class DS{
		private int num;
		private int idx;
		
		DS( int num, int idx ){
			this.num = num;
			this.idx = idx;
		}
		void setNum( int num ){
			this.num = num;
		}
		
		int getIdx(){
			return idx;
		}
		int getNum(){
			return num;
		}
	}
	
	static class Scan{
		BufferedReader br = new BufferedReader( new InputStreamReader( System.in ) );
		StringTokenizer st = null;
		
		int nextInt() throws IOException{
			if( st == null || !st.hasMoreTokens() )
				st = new StringTokenizer( br.readLine() );
			return Integer.parseInt( st.nextToken() );
		}
		
	}
}
