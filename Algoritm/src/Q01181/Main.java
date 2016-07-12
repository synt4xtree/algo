package Q01181;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader( System.in ) );
		StringBuffer sb = new StringBuffer();
		
		int n = Integer.parseInt( br.readLine() );
		
		Words[] list = new Words[n];
		
		for( int i = 0 ; i < n ; ++i )
			list[i] = new Words( br.readLine() );
		
		Arrays.sort( list );
		
		String tmp = "";
		for( int i = 0 ; i < n ; ++i ){
			String target = list[i].getWord();
			
			if( !tmp.equals(target) ){
				sb.append( target + "\n" );
				tmp = target;
			}
		}
		
		System.out.println( sb );
	}
}

class Words implements Comparable<Words>{

	private String word;
	
	Words( String word ){
		this.word = word;
	}
	
	String getWord(){
		return this.word;
	}
	
	@Override
	public int compareTo(Words o) {
		int thisLen = this.word.length();
		int comLen = o.word.length();
		
		if( thisLen < comLen )
			return -1;
		else if( thisLen > comLen )
			return 1;
		else
			return this.word.compareTo( o.word );
	}
}


/*
        HashSet<String> words_set = new HashSet<String>();
        for(int i=0; i<N; i++)
            words_set.add(br.readLine());
            
            //해쉬셋에 중복없이 모은다.
         
        ArrayList<String> words = new ArrayList<String>(words_set);
        Collections.sort(words);
        //단어순으로 정렬
        Collections.sort(words, new lengthComparator());
        //길이순으로 다시 정렬
        
        for(String s : words)
            System.out.println(s);
    }
}
 
class lengthComparator implements Comparator<Object>{
    public int compare(Object o1, Object o2){
        int len1 = ((String)o1).length();
        int len2 = ((String)o2).length();
        return (len1 > len2 ? 1 : (len1 == len2 ? 0 : -1));
    }
}
*/