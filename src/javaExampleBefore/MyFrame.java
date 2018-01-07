package javaExampleBefore;
import javax.swing.JFrame;
import javax.swing.JTabbedPane;
public class MyFrame {
	public static void main(String[] args){
		
		JFrame frame = new JFrame("MyFrame");
		JTabbedPane tabPane1 = new JTabbedPane();
		tabPane1.add("tab1", frame);
		
		//frame.setSize(400, 300);
		//frame.setLocationRelativeTo(null);
		//frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//frame.setVisible(true);
	}
}
