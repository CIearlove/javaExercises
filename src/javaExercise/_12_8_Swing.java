package javaExercise;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.border.LineBorder;

public class _12_8_Swing extends JFrame{
	public _12_8_Swing(){
		setLayout(new GridLayout(2,3));
		
		String s = new String("black#blue#cyan#green#magenta#orange");
		String[] tokens = s.split("#", 0);//将s字符串以‘#’分隔符分隔，存到tokens数组中
		
		LineBorder border = new LineBorder(Color.YELLOW,1);
		Font font = new Font("TimesRoman",Font.BOLD,20);
		
		JLabel[] label = new JLabel[6];
		Color[] color = {Color.BLACK,Color.BLUE,Color.CYAN,Color.GREEN,Color.MAGENTA,Color.ORANGE};
		
		for(int i=0;i<6;i++){
			label[i] = new JLabel();
			label[i].setForeground(color[i]);
			label[i].setBackground(Color.WHITE);
			label[i].setBorder(border);
			label[i].setFont(font);
			label[i].setText(tokens[i]);
			label[i].setToolTipText(tokens[i]);
			add(label[i]);
		}	
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame frame = new _12_8_Swing();
		frame.setTitle("Exercise12_8");
		frame.setSize(300, 300);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}

}
