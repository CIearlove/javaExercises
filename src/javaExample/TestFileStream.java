package javaExample;
import java.io.*;
public class TestFileStream {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		FileOutputStream output = new FileOutputStream("temp.dat");
		//i��ȡֵ��Χ��1��256
		for(int i =1;i<=10;i++){
			output.write(i);
		}
		
		output.close();
		
		FileInputStream input = new FileInputStream("temp.dat");
		int value;
		System.out.println("The number of available bytes:"+input.available());
		while((value = input.read())!=-1){
			System.out.print(value+" ");
		}
		input.close();
		
		
	}
}
