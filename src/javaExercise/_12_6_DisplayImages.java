package javaExercise;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.border.LineBorder;
import java.awt.Color;
import java.awt.GridLayout;

public class _12_6_DisplayImages extends JFrame{
	public _12_6_DisplayImages(){
		
		setLayout(new GridLayout(2,2));
		
		ImageIcon icon1 = new ImageIcon("image/ca.gif","Canada");
		ImageIcon icon2 = new ImageIcon("image/china.gif","China");
		ImageIcon icon3 = new ImageIcon("image/fr.gif","France");
		ImageIcon icon4 = new ImageIcon("image/germany.gif","Germany");
		
		JLabel label1 = new JLabel(icon1);
		JLabel label2 = new JLabel(icon2);
		JLabel label3 = new JLabel(icon3);
		JLabel label4 = new JLabel(icon4);
		
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
		_12_6_DisplayImages frame = new _12_6_DisplayImages();
		frame.setTitle("Exercise12_5");
		frame.setVisible(true);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(300, 200);
	}

}
