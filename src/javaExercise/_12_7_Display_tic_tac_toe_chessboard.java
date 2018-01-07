package javaExercise;
import java.awt.Color;
import java.awt.GridLayout;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.border.LineBorder;

import java.lang.Math;
public class _12_7_Display_tic_tac_toe_chessboard extends JFrame{
	public _12_7_Display_tic_tac_toe_chessboard(){
		setLayout(new GridLayout(3,3));
		
		ImageIcon icon1 = new ImageIcon("image/o.gif");
		ImageIcon icon2 = new ImageIcon("image/x.gif");
		int random;
		JLabel[] label = new JLabel[9];
		
		for(int i=0;i<9;i++){
			random = (int)(Math.random()*(2+1));
			label[i] = new JLabel();
			switch(random){
			case 0:
				label[i].setIcon(icon2);
				label[i].setBorder(new LineBorder(Color.BLACK,1));
				break;
			case 1:
				label[i].setIcon(icon1);
				label[i].setBorder(new LineBorder(Color.BLACK,1));
				break;
			case 2:
				label[i].setSize(37, 39);
				label[i].setBorder(new LineBorder(Color.BLACK,1));
				break;
			}
			add(label[i]);
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame frame = new _12_7_Display_tic_tac_toe_chessboard();
		frame.setTitle("Exercise12_7");
		frame.setSize(300, 300);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
}
