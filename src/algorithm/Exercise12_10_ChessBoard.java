/*
 * 构成一个棋盘，类似：
 * 0 1 0 1 0 1 0 1
 * 1 0 1 0 1 0 1 0
 * 0 1 0 1 0 1 0 1
 * 1 0 1 0 1 0 1 0
 * 0 1 0 1 0 1 0 1
 * 1 0 1 0 1 0 1 0
 * 0 1 0 1 0 1 0 1
 * 1 0 1 0 1 0 1 0
 */
package algorithm;

public class Exercise12_10_ChessBoard {
	public static void main(String[] args) {
		
		int[][] chessBoard = new int[8][8];
		boolean isWhite = true;
		
		for(int i=0;i<8;i++){
			for(int j=0;j<8;j++){
				if(isWhite == true){
					chessBoard[i][j] = 0;
					isWhite = false;
					
				}
				else if(isWhite == false){
					chessBoard[i][j] = 1;
				    isWhite = true;
				}
					
			}
			if(i%2 == 0){
				isWhite = false;
			}
			else if(i%2 == 1){
				isWhite = true;
			}
		}
	}
}
