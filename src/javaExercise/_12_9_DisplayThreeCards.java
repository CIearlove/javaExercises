package javaExercise;
import java.awt.GridLayout;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class _12_9_DisplayThreeCards extends JFrame{
	public _12_9_DisplayThreeCards(){
		setLayout(new GridLayout(1,3));
/*
 * 		同时生成n个随机数，随机数的范围是1到54
 */
		int n = 3;
		int count = 0;
		int[] random = new int[n];
		boolean isDuplication = false;
		while(count<n){
			int num = (int)(1 + Math.random()*54);
			for(int i=0;i<n;i++){
				if(num == random[i]){
					isDuplication = true;
					break;
				}
			}
			if(!isDuplication){
				random[count] = num;
				count++;
			}
		}
		/*
		 * 将随机数与字符串组合，得到图像文件名
		 */
		String imageFilename1 = "image/card/"+random[0]+".png";
		String imageFilename2 = "image/card/"+random[1]+".png";
		String imageFilename3 = "image/card/"+random[2]+".png";
		
		ImageIcon icon1 = new ImageIcon(imageFilename1);
		ImageIcon icon2 = new ImageIcon(imageFilename2);
		ImageIcon icon3 = new ImageIcon(imageFilename3);
		
		JLabel label1 = new JLabel(icon1);
		JLabel label2 = new JLabel(icon2);
		JLabel label3 = new JLabel(icon3);
		
		add(label1);
		add(label2);
		add(label3);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame frame = new _12_9_DisplayThreeCards();
		frame.setTitle("Exercise12_9");
		frame.setSize(300, 150);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}

}
