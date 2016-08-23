package Q01021;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Deque;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Main {
	 public static void main( String[] args ) throws IOException{
	        Scan sc = new Scan();
	        int size = sc.nextInt(), select = sc.nextInt();
	        int ret = 0;
	        Deque<Integer> d = new LinkedList<Integer>();
	        for( int i = 1 ; i <= size ; ++i )
	            d.add( i );
	        
	        while( select-- > 0 ){
	            int target = sc.nextInt();
	            int cnt = 0;
	             
	            while( target != d.peekFirst() ){
	                d.addFirst( d.pollLast() );
	                cnt++;
	            }
	            
	            if( cnt > d.size()/2 )
	                cnt = d.size() - cnt;
	            
	            d.pollFirst();
	            
	            ret += cnt;
	        }
	         
	        System.out.println( ret );
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
