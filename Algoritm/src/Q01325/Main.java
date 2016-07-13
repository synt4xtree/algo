package Q01325;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.Vector;

public class Main {
	
	static boolean[] temp;
	//static boolean[][] graph;
	static Vector<Integer>[] graph;
	//static int[] numOfEdge;
	static int n;
	static int max;
	
	public static void main( String[] args ) throws Exception{
		Scan sc = new Scan();
		
		n = sc.nextInt();
		int m = sc.nextInt();
		
		//graph = new boolean[n+1][n+1];
		
		graph = (Vector<Integer>[]) new Vector[n+1];
		for(int i = 0; i < graph.length; i++)
			graph[i] = new Vector<Integer>();
		
		//numOfEdge = new int[n+1];
		
		while( m-- > 0 ){
			int to = sc.nextInt();
			int from = sc.nextInt();
			
			//graph[from][to] = true;
			//numOfEdge[from]++;
			graph[from].add( to );
		}
		
		GetAns();
		
	}
	
	public static void GetAns(){
		//List<Integer> list = new LinkedList<Integer>();
		int[] list = new int[n+1];
		int curpos = 0;
		
		max = Integer.MIN_VALUE;
		for( int i = 1 ; i <= n ; ++i ){
			temp = new boolean[n+1];
			int length = DFS(i);
			if( length == max ){
				//System.out.println( i+" " +length + "list에 넣음");
				list[curpos++] = i;
			}
			else if( length > max ){
				//System.out.println( i+" " +length + "max보다 커서 리스트 비움");
				//list.clear();
				//list.add( i );
				
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
	
	
	public static int DFS( int from ){
		temp[from] = true;
		
		int ret = 1;
		/*//int doneEdge = 0;
		for( int to = 1 ; to <= n ; ++to ){
			//if( doneEdge >= numOfEdge[from] )
			//	break;
//			if( graph[from][to] == true && temp[to] == false ){
//					ret += DFS( to );
//					doneEdge++;
//			}
			//if( graph[from][to] ){
			//	doneEdge++;
			//	if( !temp[to] )
			//		ret += DFS( to );
			}
		}*/
		int length = graph[from].size();
		for( int i = 0 ; i < length ; ++i ){
			int target = graph[from].get(i);
			if( !temp[target] )
				ret += DFS( target );
		}
		
		
		return ret;
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
