package Chapter20;

import java.io.File;
import java.util.Scanner;

public class DirectorySize {
	
	public static void main(String[] args) {
		//Prompt the user to enter a directory or a file
		System.out.println("Enter a directory or a file: ");
		Scanner input = new Scanner(System.in);
		String directory = input.nextLine();
		File file = new File(directory);
		//Display the size
		System.out.println(getSize(file)+" bytes");
		System.out.println(getSize(file)*1.0/1024+" KB");
		System.out.println(getSize(file)*1.0/1024*1.0/1024+" MB");
		System.out.println(getSize(file)*1.0/1024*1.0/1024*1.0/1024+" GB");
	}

	public static long getSize(File file) {
		long size = 0;
		if(file.isDirectory()){//All files and sub directories
			File[] files = file.listFiles();
			for(int i=0;i<files.length;i++){
				size += getSize(files[i]);//Recursive call
			}
		}
		else{//Base Case
			size += file.length();
		}
		return size;
	}
}
