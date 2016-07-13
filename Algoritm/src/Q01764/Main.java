package Q01764;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
	public static void main( String[] args ) throws IOException{
		BufferedReader br = new BufferedReader( new InputStreamReader( System.in ) );
		StringBuffer sb = new StringBuffer();
		
		String input = br.readLine();
		String[] inputs = input.split(" ");
		int n = Integer.parseInt( inputs[0] );
		int m = Integer.parseInt( inputs[1] );
		
		String[] unheard = new String[n];
		for( int i = 0 ; i < n ; ++i )
			unheard[i] = br.readLine();
		
		String[] unseen = new String[m];
		for( int i = 0 ; i < m ; ++i )
			unseen[i] = br.readLine();
		br.close();
		
		Arrays.sort( unheard );
		Arrays.sort( unseen );
		
		int ans = 0;
		/*
		 * 둘로 나누는 이유
		 * 예를 들어 n = 1이고 m = 5만 이라고 하면 n을 대상으로 for문을 돌릴경우 한번이면 되지만 반대의경우 5만번
		 * 반대로 n = 5만 m = 1일경우 마찬가지
		 */
		
		if( n > m ){
			for( int i = 0 ; i < m ; ++i )
				if( Arrays.binarySearch( unheard, unseen[i]) > -1 ){
					ans++;
					sb.append( unseen[i] + "\n" );			
				}
		} else {
			for( int i = 0 ; i < n ; ++i )
				if( Arrays.binarySearch( unseen, unheard[i]) > -1 ){
					ans++;
					sb.append( unheard[i] + "\n" );			
				}
		}
		
		System.out.println( ans );
		System.out.println( sb );
	}
}

/*
 * 		해쉬맵을 쓰는 경우
 * 		HashSet<String> hm1 = new HashSet<String>();
         
        for (int i = 0; i < N; i++) {
            hm1.add(br.readLine());
        }
         
        ArrayList<String> resultList = new ArrayList<String>();
        int cnt = 0;
        String tmp = null;
         
        for (int i = 0; i < M; i++) {
            tmp = br.readLine();
            if(hm1.contains(tmp)) {
                cnt++;
                resultList.add(tmp);
            }
        }
         
        Collections.sort(resultList);
         
        StringBuilder sb = new StringBuilder();
         
        for (String s: resultList) {
            sb.append(s).append("\n");
        }
 * 
 */
