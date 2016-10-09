package Q01102;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.PriorityQueue;

public class Main {
	static int n, p;
	static int[][] plt;
	static int[] distance;
	static boolean[] visited;
	static String onOffInfo;
	static final int INF = 987654321;
	static int numOfOn;
	
	public static void main( String[] args )throws IOException{
		Init();
		//다익스트라 알고리즘으로...? 모든 곳 까지의 최소 값과 그 최소값에 드는 공장수 (몇개의 공장을 통해 켜지는지)를 가지고 구하기..
		// 공장수로 오름차순 정렬한 후에 비용이 같을경우 최소값으로 오름차순
		int numOfY = 0;
		for( int i = 0 ; i < onOffInfo.length() ; ++i ){
			if( onOffInfo.charAt(i) == 'Y' )
				numOfY++;
		}
		
		if( numOfY == 0 && p > 0 ){
			System.out.println( -1 );
			return;
		}
		
		int totalCost = 0;
		//run dijkstra algorithm where onOffInfo is Y
		PriorityQueue<Edge> pq = new PriorityQueue<Edge>();
		for( int from = 0 ; from < n ; ++from ){
			if( onOffInfo.charAt(from) == 'Y'){
				distance[from] = 0;
				numOfOn++;
				
				for( int to = 0 ; to < n ; ++to ){
					int cost = plt[from][to];
					
					if( from != to ){
						pq.add( new Edge( to, cost ) );
						System.out.println( from + "번 발전소 에서 " + cost +"를 들여 " + to +"를 재가동하는 것을 고려함");
					}
				}
			}
		}
		
		while( numOfOn < p && !pq.isEmpty() ){
			int from = pq.peek().getTo();
			int cost = pq.peek().getCost();
			pq.poll();
			
			if( distance[from] < cost )
				continue;
			System.out.println( from + "의 값" + cost + "재가동함");
			distance[from] = cost;
			
			visited[from] = true;
			totalCost += cost;
			numOfOn++;
			
			for( int to = 0 ; to < n ; ++to ){
				int nextCost = plt[from][to];
				System.out.println( from +"에서 부터 " +to+"까지 검사");
				if( distance[to] > nextCost && from != to ){
					pq.add( new Edge( to, nextCost ) );
					System.out.println( from + "번 발전소 에서 " + nextCost +"를 들여 " + to +"를 재가동을 고려함");
				} else {
					System.out.println( distance[to] + " 가 " +nextCost+"보자 작음" );
				}
			}
		}
		//불가능한경우는 모든 공장이 꺼져있을때 뿐..
		System.out.println( totalCost );
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
			// TODO Auto-generated method stub
			return this.cost < o.cost ? -1 : this.cost > o.cost ? 1 : 0;
		}
	}
	
	
	static void Init() throws IOException{
		BufferedReader br = new BufferedReader( new InputStreamReader( System.in ) );
		
		n = Integer.parseInt( br.readLine() );
		plt = new int[n][n];
		visited = new boolean[n];
		distance = new int[n];
		Arrays.fill( distance, INF );
		
		//Init arrays
		for( int i = 0 ; i < n ; ++i ){
			String[] inputs = br.readLine().split(" ");
			
			for( int j = 0 ; j < n ; ++j )
				plt[i][j] = Integer.parseInt( inputs[j] );
		}
		
		onOffInfo = br.readLine();
		numOfOn = 0;
		
		p = Integer.parseInt( br.readLine() );
		
		br.close();
	}
}
