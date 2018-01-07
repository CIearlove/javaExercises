package javaExercise;

import java.awt.Color;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;

public class _12_10_DisplayAChessboard extends JFrame{
	public _12_10_DisplayAChessboard(){
		setLayout(new GridLayout(8,8));
		JButton[][] chessBoard = new JButton[8][8];
		boolean isWhite = true;
		for(int i=0;i<8;i++){
			for(int j=0;j<8;j++){
				chessBoard[i][j] = new JButton();
				add(chessBoard[i][j]);
				if(isWhite){
					chessBoard[i][j].setBackground(Color.WHITE);
					isWhite = false;
				}
				else if(isWhite == false){
					chessBoard[i][j].setBackground(Color.BLACK);
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
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame frame = new _12_10_DisplayAChessboard();
		frame.setTitle("Exercise12_10");
		frame.setSize(300, 300);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}

}
