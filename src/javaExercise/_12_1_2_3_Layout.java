package javaExercise;
import java.awt.*;
import javax.swing.*;
import java.util.Scanner;
public class _12_1_2_3_Layout extends JFrame{
	public _12_1_2_3_Layout(int i){
		
		JPanel p1 = new JPanel();
		JPanel p2 = new JPanel();
		JButton b1 = new JButton("B1");
		JButton b2 = new JButton("B2");
		JButton b3 = new JButton("B3");
		JButton b4 = new JButton("B4");
		JButton b5 = new JButton("B5");
		JButton b6 = new JButton("B6");
		
		p1.add(b1);
		p1.add(b2);
		p1.add(b3);
		p2.add(b4);
		p2.add(b5);
		p2.add(b6);
		
		switch(i){
		case 1:
			setLayout(new FlowLayout());
			add(p1);
			add(p2);
			break;
		case 2:
			setLayout(new BorderLayout());
			add(p1,BorderLayout.CENTER);
			add(p2,BorderLayout.SOUTH);
			break;
		case 3:
			setLayout(new FlowLayout());
			p1.setLayout(new GridLayout(2,3));
			p2.setLayout(new GridLayout(2,3));
			add(p1);
			add(p2);
			break;
		default: System.out.println("Error: invalid input(1----3)");
                 System.exit(EXIT_ON_CLOSE);
		}
		setTitle("Exercise12_1");
		setSize(400, 400);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		_12_1_2_3_Layout frame;
		
		System.out.println("Enter a number:");
		System.out.println("1 for FlowLayout.");
		System.out.println("2 for BorderLayout.");
		System.out.println("3 for GridLayout.");
		Scanner input = new Scanner(System.in);
		
		int x = input.nextInt();
		switch(x){
		case 1:
			frame = new _12_1_2_3_Layout(1);
			break;
		case 2: 
			frame = new _12_1_2_3_Layout(2);
			break;
		case 3: 
			frame = new _12_1_2_3_Layout(3);
			break;
		default: System.out.println("Error: invalid input(1----3)");
		         System.exit(EXIT_ON_CLOSE);
		}
	}

}
