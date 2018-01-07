package javaExercise;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.border.LineBorder;

import java.awt.Color;
import java.awt.GridLayout;

public class _12_5_DisplayLabels extends JFrame{
	public _12_5_DisplayLabels(){
		setLayout(new GridLayout(4,1));
		JLabel label1 = new JLabel("Number_one");
		JLabel label2 = new JLabel("Number_two");
		JLabel label3 = new JLabel("Number_three");
		JLabel label4 = new JLabel("Number_four");
		
		label1.setBorder(new LineBorder(Color.BLACK,1));
		label2.setBorder(new LineBorder(Color.BLACK,1));
		label3.setBorder(new LineBorder(Color.BLACK,1));
		label4.setBorder(new LineBorder(Color.BLACK,1));
		
		add(label1);
		add(label2);
		add(label3);
		add(label4);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		_12_5_DisplayLabels frame = new _12_5_DisplayLabels();
		frame.setTitle("Exercise12_5");
		frame.setVisible(true);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(200, 125);
	}

}
