package Q01786;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main( String[] args ){
		Scanner sc = new Scanner( System.in );
		StringBuffer sb = new StringBuffer();
		
		String T = sc.nextLine();
		String P = sc.nextLine();
		
		List<Integer> list = KMP( T, P );
		
		sb.append( list.size() + "\n" );
		
		for( int i = 0 ; i < list.size(); ++i )
			sb.append( list.get(i) + 1 + " " );
		
		System.out.println( sb );
		sc.close();
	}
	
	static List<Integer> KMP( String T, String P ){
		List<Integer> ret = new ArrayList<Integer>();
		
		int n = T.length(), m = P.length();
		int[] pi = getPartialMath( P );
		
		int begin = 0, matched = 0;
		while( begin <= n-m ){
			if( matched < m && T.charAt(begin + matched) == P.charAt(matched) ) {
				++matched;
				if( matched == m ) ret.add(begin);
				
			}
			else{
				if( matched == 0 )
					++begin;
				else{
					begin += matched - pi[matched-1];
					
					matched = pi[matched-1];
				}
			}
		}
		
		return ret;
	}
	
	static int[] getPartialMath( String P ){
		int pLen = P.length();
		int[] pi = new int[pLen];
		
		int begin = 1, matched = 0;
		
		while( begin + matched < pLen ){
			if( P.charAt( begin + matched ) == P.charAt( matched ) ){
				++matched;
				pi[begin+matched-1] = matched;
			} 
			else{
				if( matched == 0 )
					++begin;
				else {
					begin += matched - pi[matched-1];
					matched = pi[matched-1];
				}
			}
		}
		
		return pi;
	}
}
