package Q05014;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
	public static void main( String[] args ){
		final int INF = 987654321;
		
		Scanner sc = new Scanner( System.in );
		int F = sc.nextInt(), S = sc.nextInt(), G = sc.nextInt(), U = sc.nextInt(), D = sc.nextInt();
		int[] move = { U, -D };
		int[] floors = new int[F+1];
		Arrays.fill( floors, INF );
		
		Queue<Integer> q = new LinkedList<Integer>();
		floors[S] = 0;
		q.add( S );
		
		while( !q.isEmpty() ){
			int cur = q.poll();
			
			if( cur == G )
				break;
			
			for( int i = 0 ; i < move.length ; ++i ){
				int next = cur + move[i];
				
				if( next < 1 || next > F )
					continue;
				
				if( floors[next] > floors[cur] + 1 ){
					floors[next] = floors[cur] + 1;
					q.add( next );
				}
			}
		}
		
		if( floors[G] == INF ){
			System.out.println( "use the stairs" );
		} else {
			System.out.println( floors[G] );
		}
		
		sc.close();
	}
}
