package Q01697;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
	public static void main( String[] args ){
		Scanner sc = new Scanner( System.in );
		int n = sc.nextInt(), k = sc.nextInt();
		
		boolean[] map = new boolean[100001];
		int minTime = Integer.MAX_VALUE;
		Queue<Information> q = new LinkedList<Information>();
		q.add( new Information( n, 0 ) );
		map[n] = true;
		
		int time = 0, position = 0;
		while( !q.isEmpty() ){
			time = q.peek().getTime();
			position = q.peek().getPosition();
			q.poll();
			
			if( position == k )
				minTime = Math.min( time, minTime );
			
			for( int i = 0 ; i < 3 ; ++i ){
				int nextPos = position;
				switch(i){
				case 0:
					nextPos += 1;
					break;
				case 1:
					nextPos -= 1;
					break;
				case 2:
					nextPos *= 2;
					break;
				}
				
				if( nextPos == k ){
					minTime = Math.min(minTime, time + 1);
					continue;
				}
			
				if( nextPos >= 0 && nextPos <= 100000 && !map[nextPos] && time < minTime ){
					map[nextPos] = true;
					q.add( new Information( nextPos, time + 1 ) );
				}
			}
		}
		
		
		System.out.println( minTime );
		sc.close();
	}
	
	static class Information{
		int position;
		int time;
		
		Information( int position, int time ){
			this.position = position;
			this.time = time;
		}
		
		int getPosition(){
			return this.position;
		}
		
		int getTime(){
			return this.time;
		}		
	}
}
