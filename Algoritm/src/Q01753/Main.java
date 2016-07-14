package Q01753;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Main {
	public static void main( String[] args ) throws Exception{
		Scan sc = new Scan();
		int vertex = sc.nextInt(), edge = sc.nextInt(), start = sc.nextInt();
		final int INF = 987654321;
		int[] distance = new int[vertex+1];
		
		List<Edge>[] graphlist = new List[vertex+1];
		for( int i = 1; i <= vertex ; ++i )
			graphlist[i] = new ArrayList<Edge>();
		//데이터 참조가 많을경우 linkedlist보다 arraylist 빠르므로 arraylist를 사용하자
		
		Arrays.fill( distance, INF );
		
		for( int i = 0 ; i < edge ; ++i ){
			int from = sc.nextInt(), to = sc.nextInt(), weight = sc.nextInt();
			
			graphlist[from].add( new Edge( to, weight ) );
		}
		
		PriorityQueue<Edge> pq = new PriorityQueue<>();
		pq.add( new Edge( start, 0 ) );
		distance[start] = 0;
		
		while( !pq.isEmpty() ){
			int here = pq.peek().to;
			int weight = pq.peek().weight;
			pq.remove();
			
			if( weight > distance[here] )
				continue;
			
			int length = graphlist[here].size();
			for( int i = 0 ; i < length ; ++i ){
				int there = graphlist[here].get(i).to;
				int nextWeight = weight + graphlist[here].get(i).weight;
				
				if( distance[there] > nextWeight ){
					distance[there] = nextWeight;
					pq.add( new Edge( there, nextWeight ) );
				}
			}
		}
		
		StringBuffer sb = new StringBuffer();
		for( int i = 1 ; i <= vertex ; ++i )
			sb.append( distance[i] == INF ? "INF" : distance[i] ).append("\n");
		
		System.out.print( sb );
		
	}
	
	static class Edge implements Comparable<Edge>{
		int to;
		int weight;
		
		Edge( int to, int weight ){
			this.to = to;
			this.weight = weight;
		}

		@Override
		public int compareTo(Edge o) {
			return this.to < o.to ? -1 : ( this.to == o.to ? 0 : 1 );
		}

		
	}
	
	static class Scan{
		BufferedReader br = new BufferedReader( new InputStreamReader( System.in ) );
		StringTokenizer st = null;
		
		int nextInt() throws Exception{
			if( st == null || !st.hasMoreTokens() )
				st = new StringTokenizer( br.readLine() );
			
			return Integer.parseInt( st.nextToken() );
		}
		
	}
}
