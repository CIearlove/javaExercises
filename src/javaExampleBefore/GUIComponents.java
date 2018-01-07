package javaExampleBefore;
import javax.swing.*;
public class GUIComponents {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JButton jbtOK = new JButton("OK");
		JButton jbtCancel = new JButton("Cancel");
		JLabel jlbName = new JLabel("Enter your name:");
		JTextField jtfName = new JTextField("Type Name Here");
		JCheckBox jchkBold = new JCheckBox("Bold");
		JCheckBox jchkItalic = new JCheckBox("Italic");
		JRadioButton jrbRed = new JRadioButton("Red");
		JRadioButton jrbYellow = new JRadioButton("Yellow");
		JComboBox jcboColor = new JComboBox(new String[]{
				"Freshman","Sophmore","Junior","Senior"
		});
		
		JPanel panel = new JPanel();
		panel.add(jbtOK);
		panel.add(jbtCancel);
		panel.add(jlbName);
		panel.add(jtfName);
		panel.add(jchkBold);
		panel.add(jchkItalic);
		panel.add(jrbRed);
		panel.add(jrbYellow);
		panel.add(jcboColor);
		
		JFrame frame1 = new JFrame();
		frame1.add(panel);
		frame1.setTitle("Show GUI Components");
		frame1.setSize(450, 100);
		frame1.setLocation(200,100);
		frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame1.setVisible(true);
	}

}
