package Q01325;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main2 {
	static boolean[] trace;
	static int n;
	static int max;
	
	public static void main( String[] args ) throws Exception{
		Scan sc = new Scan();
		
		n = sc.nextInt();
		int m = sc.nextInt();
		
		int[][] graph = new int[n+1][1];
        for ( int i = 0 ; i < m ; i++ ) {
            int to = sc.nextInt();
            int from = sc.nextInt();
            
            graph[from][0]++;
            
            if (graph[from][0] >= graph[from].length) {
            	int[] temp = graph[from];
            	graph[from] = new int[temp.length + 1000];
                System.arraycopy( temp, 0, graph[from], 0, temp.length );
            }
            
            graph[from][graph[from][0]] = to;
            //배열을 늘리면서 사용할때 좋은 방법
        }
		
		int[] list = new int[n+1];
		int curpos = 0;
		int max = Integer.MIN_VALUE;
		
		int[] q = new int[200000];
		for( int i = 1; i <= n ; ++i ){
			int head = 0;
			int tail = 1;
			q[head] = i;
			trace = new boolean[n+1];
			
			int length = 0;
			while( head < tail ){
				int from = q[head++];
				if( trace[from] )
					continue;
				
				trace[from] = true;
				length++;
				
				for( int j = 1 ; j <= graph[from][0] ; ++j ){
					if( trace[graph[from][j]] )
						continue;
					q[tail++] = graph[from][j];
				}
			}
			
			if( max == length )
				list[curpos++] = i;
			else if( length > max ){
				curpos = 0;
				list[curpos++] = i;
				max = length;
			}
		}
		
		StringBuffer sb = new StringBuffer();
		for( int i = 0 ; i < curpos ; ++i )
			sb.append( list[i] + " " );
		
		System.out.println( sb );
	}
	
	static class Scan{
		BufferedReader in = new BufferedReader( new InputStreamReader( System.in ) );
		StringTokenizer st = null;
		
		int nextInt() throws Exception {
			if( st == null || !st.hasMoreTokens() )
				st = new StringTokenizer( in.readLine() );
			
			return Integer.parseInt( st.nextToken() );
		}
	}
}
