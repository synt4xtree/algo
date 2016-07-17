package Q07569;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;
  
public class Main {
    public static void main( String[] args ) throws IOException{
        Scan sc = new Scan();
        int[] mz = { 0, 0, 0, 0, 1,-1 };
        int[] mx = { 1,-1, 0, 0, 0, 0 };
        int[] my = { 0, 0,-1, 1, 0, 0 };
        final int INF = 987654321;
          
        int m = sc.nextInt(), n = sc.nextInt(), h = sc.nextInt();
        int[][][] tomato = new int[h][n][m];
        int[][][] distance = new int[h][n][m];
        //array init
        for( int k = 0 ; k < h ; ++k )
            for( int i = 0 ; i < n ; ++i )
                for( int j = 0 ; j < m ; ++j ){
                    tomato[k][i][j] = sc.nextInt();
                    distance[k][i][j] = INF;
                }
          
          
        Queue<Position> q = new LinkedList<Position>();
        int max = Integer.MIN_VALUE;
          
        for( int k = 0 ; k < h ; ++k )
            for( int i = 0 ; i < n ; ++i )
                for( int j = 0 ; j < m ; ++j ){
                    if( tomato[k][i][j] == 1 ){
                        q.add( new Position( j, i, k ) );
                        distance[k][i][j] = 1;
                    } else if ( tomato[k][i][j] == -1 )
                        distance[k][i][j] = -1;
                }
          
        while( !q.isEmpty() ){
              
            int cx = q.peek().getX();
            int cy = q.peek().getY();
            int cz = q.peek().getZ();
            q.poll();
            
            max = Math.max( max, distance[cz][cy][cx] );
            
            for( int move = 0 ; move < mz.length ; ++move ){
                int nx = cx + mx[move];
                int ny = cy + my[move];
                int nz = cz + mz[move];
                  
                if( nx < 0 || ny < 0 || nz < 0 || nx == m || ny == n || nz == h || tomato[nz][ny][nx] != 0 )
                    continue;
                  
                if( distance[cz][cy][cx] + 1 < distance[nz][ny][nx] ){
                    distance[nz][ny][nx] = distance[cz][cy][cx] + 1;
                    q.add( new Position( nx, ny, nz ) );
                }
            }
        }
          
        for( int k = 0 ; k < h ; ++k )
            for( int i = 0 ; i < n ; ++i )
                for( int j = 0 ; j < m ; ++j ){
                    if( distance[k][i][j] == INF ){
                        System.out.println( -1 );
                        return;
                    }
                }
          
        System.out.println( max-1 );
    }
      
    static class Position{
        private int x;
        private int y;
        private int z;
          
        Position( int x, int y, int z ){
            this.x = x;
            this.y = y;
            this.z = z;
        }
          
        int getX(){
            return this.x;
        }
          
        int getY(){
            return this.y;
        }
          
        int getZ(){
            return this.z;
        }
    }
      
    static class Scan{
        BufferedReader br = new BufferedReader( new InputStreamReader( System.in ) );
        StringTokenizer st = null;
          
        int nextInt() throws IOException{
            if( st == null || !st.hasMoreTokens() )
                st = new StringTokenizer( br.readLine() );
              
            return Integer.parseInt( st.nextToken() );
              
        }
    }
}
