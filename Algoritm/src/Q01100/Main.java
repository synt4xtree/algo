package Q01100;

import java.util.Scanner;

public class Main {
	public static void main( String[] args ){
		Scanner sc = new Scanner( System.in );
		String[] map = new String[8];
		
		for( int i = 0 ; i < 8 ; ++i )
			map[i] = sc.nextLine();
		
		int ans = 0;
		
		for( int i = 0 ; i < 8 ; ++i )
			for( int j = 0 ; j < 8 ; ++j )
				if( (i+j)%2 == 0 && map[i].charAt(j) == 'F' )
					ans++;
		
		System.out.println( ans );
		
		sc.close();
	}
}

/*
j = i%2 ; j < 8 ; j++ ���ϸ� �ϳ��� for������ �Ҽ� �ִ�. �Է��� �����鼭 �ٷιٷ�
*/