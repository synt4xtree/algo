package Q01013;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	static final String pattern = "(100+1+|01)+";
	public static void main( String[] args ) throws IOException{
		BufferedReader br = new BufferedReader( new InputStreamReader( System.in ) );
		StringBuilder sb = new StringBuilder();
		
		int testcase = Integer.parseInt( br.readLine() );
		
		while( testcase-- > 0 ){
			String radioWave = br.readLine();
			sb.append( ( radioWave.matches( pattern ) ? "YES" : "NO" ) + "\n");
		}
		
		System.out.println( sb );
		br.close();
	}
}
/*
	boolean b = sc.next().matches("^(100+1+|01)+$");
	System.out.println(b ? "YES" : "NO");
	
	public static void main( String[] args ) throws IOException{
		BufferedReader br = new BufferedReader( new InputStreamReader( System.in ) );
		StringBuilder sb = new StringBuilder();
		Pattern pattern = Pattern.compile("(100+1+|01)+");
		Matcher matcher;
		
		int testcase = Integer.parseInt( br.readLine() );
		
		while( testcase-- > 0 ){
			String radioWave = br.readLine();
			matcher = pattern.matcher( radioWave );
			
			sb.append( ( matcher.matches() ? "YES" : "NO" ) + "\n");
		}
		
		System.out.println( sb );
		br.close();
	}
*/
