package javaExampleBefore;
import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.BorderLayout;

public class ShowBoderLayout extends JFrame {
	public ShowBoderLayout(){
		setLayout(new BorderLayout(5,10));
		add(new JButton("East"),BorderLayout.EAST);
		add(new JButton("South"),BorderLayout.SOUTH);
		add(new JButton("West"),BorderLayout.WEST);
		add(new JButton("North"),BorderLayout.NORTH);
		add(new JButton("Center"),BorderLayout.CENTER);
	}
	
	public static void main(String[] args){
		ShowBoderLayout frame = new ShowBoderLayout();
		frame.setTitle("ShowBoderLayout");
		frame.setSize(300, 200);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
}
