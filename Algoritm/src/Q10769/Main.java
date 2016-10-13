package Q10769;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
	
	final static String happyE = ":-)";
	final static String sadE = ":-(";
	
	public static void main( String[] args ) throws IOException{
		BufferedReader br = new BufferedReader( new InputStreamReader( System.in ) );
		String input = br.readLine();
		
		int happy = 0;
		int sad = 0;
		
		Pattern p = Pattern.compile("(:-\\)|:-\\()");
		Matcher m = p.matcher( input );
		
		while( m.find() ){
			if ( m.group().equals( happyE ) ){
				happy++;
			} else {
				sad++;
			}
		}
		
		String ret = null;
		
		if( happy == 0 && sad == 0 ){
			ret = "none";
		} else if( happy == sad ){
			ret = "unsure";
		} else if ( happy > sad ){
			ret = "happy";
		} else if ( happy < sad ){
			ret = "sad";
		}
		
		System.out.println( ret );
	}
}
