package Q01916;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Main {
	public static void main( String[] args) throws IOException{
		Scan sc = new Scan();
		int n = sc.nextInt(), m = sc.nextInt();
		final int INF = 987654321;
		
		int[] totalcost = new int[n+1];
		Arrays.fill( totalcost, INF );
		
		List<Edge>[] list = new List[n+1];
		for( int i = 0 ; i <= n ; ++i )
			list[i] = new ArrayList<Edge>();
		
		while( m-- > 0 ){
			int from = sc.nextInt();
			int to = sc.nextInt();
			int cost = sc.nextInt();
			
			list[from].add( new Edge( to, cost ) );
		}
		
		int start = sc.nextInt(), destination = sc.nextInt();
		int length = list[start].size();
		
		PriorityQueue<Edge> pq = new PriorityQueue<Edge>();
		totalcost[start] = 0;
		
		pq.add( new Edge( start, 0 ) );
		for( int i = 0 ; i < length ; ++i )
			pq.add( list[start].get(i) );
		
		while( !pq.isEmpty() ){
			
			int from = pq.peek().getTo();
			int cost = pq.peek().getCost();
			pq.poll();
			length = list[from].size();
			
			if( cost > totalcost[from] )
				continue;
			
			for( int i = 0 ; i < length; ++i ){
				int to = list[from].get(i).getTo();
				int nextcost = cost + list[from].get(i).getCost();
				
				if( nextcost < totalcost[to] ){
					totalcost[to] = nextcost;
					pq.add( new Edge( to, nextcost ) );
				}
			}
		}
		
		System.out.println( totalcost[destination] );
	}
	
	static class Edge implements Comparable<Edge>{
		private int to;
		private int cost;
		
		Edge( int to, int cost ){
			this.to = to;
			this.cost = cost;
		}
		
		int getTo(){
			return this.to;
		}
		int getCost(){
			return this.cost;
		}

		@Override
		public int compareTo(Edge o) { 
			return this.cost > o.cost ? 1 : -1;
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