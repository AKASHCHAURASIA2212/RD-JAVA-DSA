
public class Maze {
	
	
	
	public static void treverse(int sr,int sc,int dr,int dc,String psf ,boolean[][] vis,int[][]board) {
		
		if(sr>=dr || sc>=dc || sr<0 || sc<0) {
			return ;
		}
		if(sr==dr-1 && sc==dc-1) {
			System.out.print(psf+"\t");
			return ;
		}
		vis[sr][sc] = true;
		
		// horizontal call
		treverse(sr,sc+1,dr,dc,psf+"H",vis,board);
		
		// vertical call
		treverse(sr+1,sc,dr,dc,psf+"V",vis,board);
	
		
		vis[sr][sc]=false;
		
		
		
	}

	public static void main(String[] args) {
		
		int[][] board = new int[4][4] ;
		boolean[][] vis = new boolean[4][4]; 
		treverse(0,0,4,4,"",vis,board);

	}

}
