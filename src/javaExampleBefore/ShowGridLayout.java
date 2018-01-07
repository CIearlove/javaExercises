package javaExampleBefore;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JFrame;
import java.awt.GridLayout;

public class ShowGridLayout extends JFrame{
	public ShowGridLayout(){
		setLayout(new GridLayout(3,2,5,5));
		add(new JLabel("First name"));
		add(new JTextField(8));
		add(new JLabel("MI"));
		add(new JTextField(1));
		add(new JLabel("Last name"));
		add(new JTextField(8));
	}
	
	
	public static void main(String[] args){
		ShowGridLayout frame = new ShowGridLayout();
		frame.setTitle("ShowGridLayout");
		frame.setVisible(true);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(200, 125);
	}
}
