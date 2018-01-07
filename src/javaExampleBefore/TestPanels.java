package javaExampleBefore;
import java.awt.*;
import javax.swing.*;
import javax.swing.border.TitledBorder;
public class TestPanels extends JFrame{
	public TestPanels(){
		
		ImageIcon cnIcon = new ImageIcon("image/chinaIcon.gif");
		Font font1 = new Font("Monospaced",Font.PLAIN,12);
		Font font2 = new Font("Monospaced",Font.BOLD,12);
		Font font3 = new Font("Monospaced",Font.BOLD+Font.ITALIC,12);
		
		JPanel p1 = new JPanel();
		p1.setLayout(new GridLayout(4,3));
		for(int i=1;i<=9;i++){
			p1.add(new JButton(""+i));
		}
		JButton b1 = new JButton(""+0);
		b1.setBackground(Color.LIGHT_GRAY);
		p1.add(b1);
		JButton b2 = new JButton("Start");
		b2.setForeground(Color.PINK);
		b2.setToolTipText("Start button.");
		p1.add(b2);
		JButton b3 = new JButton("Stop");
		b3.setBackground(Color.LIGHT_GRAY);
		b3.setForeground(Color.PINK);
		b3.setToolTipText("Stop button.");
		p1.add(b3);
		
		JPanel p2 = new JPanel(new BorderLayout());
		JTextField t1 = new JTextField("Time to be displayed here");
		t1.setFont(font1);
		p2.add(t1, BorderLayout.NORTH);
		p2.add(p1, BorderLayout.CENTER);
		add(p2,BorderLayout.EAST);
		JButton b4 = new JButton("Food to be placed here");
		b4.setFont(font2);
		b4.setBorder(new TitledBorder("Displaying foods."));
		b4.setIcon(cnIcon);
		add(b4,BorderLayout.CENTER);
	}
	
	public static void main(String[] args){
		TestPanels frame = new TestPanels();
		frame.setTitle("The Front View of a Microware Oven");
		frame.setSize(400, 200);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
}
