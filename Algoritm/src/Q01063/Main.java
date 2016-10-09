package Q01063;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	static final int[] mx = {1,-1, 0, 0, 1,-1, 1,-1 };
	static final int[] my = {0, 0, 1,-1,-1,-1, 1, 1 };
	public static void main( String[] args ) throws IOException{
		BufferedReader br = new BufferedReader( new InputStreamReader( System.in ) );
		String[] init = br.readLine().split(" ");
		int kingX = init[0].charAt(0)-'A';
		int kingY = 8 - (init[0].charAt(1)-'0');
		int stoneX = init[1].charAt(0)-'A';
		int stoneY = 8 - ( init[1].charAt(1)-'0' );
		int numOfCmd = Integer.parseInt( init[2] );
		
		while( numOfCmd-- > 0 ){
			int direction = getDirection( br.readLine() );
			int nextKingX = kingX + mx[direction];
			int nextKingY = kingY + my[direction];
			
			if( nextKingX < 0 || nextKingY < 0 || nextKingX >= 8 || nextKingY >= 8 )
				continue;
			
			if( nextKingX == stoneX && nextKingY == stoneY ){
				int nextStoneX = stoneX + mx[direction];
				int nextStoneY = stoneY + my[direction];
				
				if( nextStoneX < 0 || nextStoneY < 0 || nextStoneX >= 8 || nextStoneY >= 8 )
					continue;
				stoneX = nextStoneX;
				stoneY = nextStoneY;
			}
			
			kingX = nextKingX;
			kingY = nextKingY;
		}
		
		char retKingX = (char) (kingX + 'A');
		int retKingY = 8 - kingY;
		char retStoneX = (char) (stoneX + 'A');
		int retStoneY = 8 - stoneY;
		System.out.println( "" + retKingX + retKingY + '\n' + retStoneX + retStoneY );
		br.close();
	}
	
	static int getDirection( String cmd ){
		int ret = 0;
		
		switch( cmd ){
		case "R":
			ret = 0;
			break;
		case "L":
			ret = 1;
			break;
		case "B":
			ret = 2;
			break;
		case "T":
			ret = 3;
			break;
		case "RT":
			ret = 4;
			break;
		case "LT":
			ret = 5;
			break;
		case "RB":
			ret = 6;
			break;
		case "LB":
			ret = 7;
			break;
		}
		
		return ret;
	}
}
