package Q01238;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Main {
	static final int INF = 987654321;
	static int x, n, m;
	public static void main( String[] args ) throws IOException{
		Scan sc = new Scan();
		n = sc.nextInt(); m = sc.nextInt(); x = sc.nextInt();
		
		List<Edge>[] Node = new List[n+1];
		List<Edge>[] rNode = new List[n+1];
		for( int i = 0 ; i <= n ; ++i ){
			Node[i] = new ArrayList<Edge>();
			rNode[i] = new ArrayList<Edge>();
		}
		List<ArrayList<Edge>> Node2 = new ArrayList< ArrayList<Edge> >(n+1);
		
		int[] fromX = new int[n+1];
		int[] toX = new int[n+1];
		
		Arrays.fill( fromX, INF );
		Arrays.fill( toX, INF );
		
		for( int i = 0 ; i < m ; ++i ){
			int from = sc.nextInt();
			int to = sc.nextInt();
			int distance = sc.nextInt();
			
			Node[from].add( new Edge( to, distance ) );
			rNode[to].add( new Edge( from, distance ) );
		}
		
		getDijk( Node, fromX );
		getDijk( rNode, toX );
	
		for( int i = 0 ; i <= n ; ++i )
			System.out.print( fromX[i] + " ");
		System.out.println();
		
		for( int i = 0 ; i <= n ; ++i )
			System.out.print( toX[i] + " ");
		System.out.println();
		
		
		int max = Integer.MIN_VALUE;
		for( int i = 1 ; i <= n ; ++i ){
			if( fromX[i] == INF || toX[i] == INF)
				continue;
			max = Math.max( max, fromX[i] + toX[i] );
		}
		
		System.out.println( max );
		
	}
	
	static void getDijk( List<Edge>[] Node, int[] fromX ){
		PriorityQueue<Edge> pq = new PriorityQueue<>();
		pq.add( new Edge( x, 0 ) );
		fromX[x] = 0;
		
		while( !pq.isEmpty() ){
			int from = pq.peek().getTo();
			int cost = pq.peek().getCost();
			pq.poll();
			
			if( cost > fromX[from] )
				continue;
			
			int length = Node[from].size();
			for( int i = 0 ; i < length ; ++i ){
				int to = Node[from].get(i).getTo();
				int nextCost = cost + Node[from].get(i).getCost();
				
				if( fromX[to] > nextCost ){
					fromX[to] = nextCost;
					pq.add( new Edge( to, nextCost ) );
				}				
			}
		}
	}
	
	static class Edge implements Comparable<Edge>{
		private int to;
		private int cost;
		
		Edge( int to, int cost ){
			this.to = to;
			this.cost = cost;
		}
		@Override
		public int compareTo(Edge arg0) {
			if( this.cost < arg0.cost )
				return 1;
			else if( this.cost > arg0.cost)
				return -1;
			else 
				return 0;
		}
		int getCost(){
			return cost;
		}
		int getTo(){
			return to;
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
