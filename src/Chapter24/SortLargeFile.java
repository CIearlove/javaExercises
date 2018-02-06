package Chapter24;
import java.io.*;

public class SortLargeFile {
	public static final int MAX_ARRAY_SIZE = 100000;
	public static final int BUFFER_SIZE = 100000;
	
	public static void main(String arg[]) throws Exception{
		//Sort largedata.dat to sortedfile.dat
		sort("largedata.dat","sortedfile.dat");
		
		//Display the first 100 numbers in the sorted file
		displayFile("sortedfile.dat");
	}

	
	/*
	 * Sort data in source file and into target file
	 */
	public static void sort(String sourcefile, String targetfile) throws Exception{
		//Implement Phase 1: Create initial segments
		int numberOfSegments = initializeSegments(MAX_ARRAY_SIZE,sourcefile,"f1.dat");
		
		//Implement Phase 2: Merge segments recursively
		merge(numberOfSegments,MAX_ARRAY_SIZE,"f1.dat","f2.dat","f3.dat",targetfile);
	}

	

	public static int initializeSegments(int segmentSize, String originalfile, String f1) 
			throws Exception{
		int[] list = new int[segmentSize];
		DataInputStream input = new DataInputStream(
				new BufferedInputStream(
				new FileInputStream(originalfile)));
		DataOutputStream output = new DataOutputStream(
				new BufferedOutputStream(
				new FileOutputStream(f1)));
		
		int numberOfSegments = 0;
		while(input.available() > 0){
			numberOfSegments++;
			int i = 0;
			for(;input.available() > 0 && i < segmentSize;i++){
				list[i] = input.readInt();
			}
			
			//Sort an array list[0....i-1]
			java.util.Arrays.sort(list, 0, i);
			
			//Write the array to f1.dat
			for(int j=0;j<i;j++){
				output.writeInt(list[j]);
			}
		}
		
		input.close();
		output.close();
		
		return numberOfSegments;
	}
	
	public static void merge(int numberOfSegments, int segmentSize, String f1, String f2, String f3,
			String targetfile) throws Exception{
		if(numberOfSegments > 1){
			mergeOneStep(numberOfSegments,segmentSize,f1,f2,f3);
			merge((numberOfSegments+1)/2,segmentSize*2,f3,f1,f2,targetfile);
		}
		else{// Rename f1 as the final sorted file
			File sortedFile = new File(targetfile);
			if(sortedFile.exists())
				sortedFile.delete();
			new File(f1).renameTo(sortedFile);
		}
	}

	public static void mergeOneStep(int numberOfSegments, int segmentSize, String f1, String f2, String f3) 
			throws Exception{
		DataInputStream f1input = new DataInputStream(
				new BufferedInputStream(
				new FileInputStream(f1),BUFFER_SIZE));
		DataOutputStream f2output = new DataOutputStream(
				new BufferedOutputStream(
				new FileOutputStream(f2),BUFFER_SIZE));
		
		//Copy half number of segments from f1.dat to f2.dat
		copyHalfToF2(numberOfSegments,segmentSize,f1input,f2output);
		f2output.close();
		
		//Merge remaining segments in f1 with segments in f2 into f3
		DataInputStream f2input = new DataInputStream(
				new BufferedInputStream(
				new FileInputStream(f2),BUFFER_SIZE));
		DataOutputStream f3output = new DataOutputStream(
				new BufferedOutputStream(
				new FileOutputStream(f3),BUFFER_SIZE));
		
		mergeSegments(numberOfSegments/2,segmentSize,f1input,f2input,f3output);
		
		f1input.close();
		f2input.close();
		f3output.close();
	}

	//Merge all segments
	private static void mergeSegments(int numberOfSegments, int segmentSize, DataInputStream f1, DataInputStream f2,
			DataOutputStream f3) throws Exception{
		for(int i=0;i < numberOfSegments; i++){
			mergeTwoSegments(segmentSize,f1,f2,f3);
		}
		// f1 may have one extra segment, copy it to f3
		while(f1.available() > 0){
			f3.writeInt(f1.readInt());
		}
	}
	/*
	 * Merge two segments
	 */
	public static void mergeTwoSegments(int segmentSize, DataInputStream f1, DataInputStream f2, DataOutputStream f3) 
			throws Exception{
		int intFormF1 = f1.readInt();
		int intFormF2 = f2.readInt();
		int f1Count = 1;
		int f2Count = 1;
		
		while(true){
			if(intFormF1 < intFormF2){
				f3.writeInt(intFormF1);
				if(f1.available() == 0 || f1Count++ >= segmentSize){
					f3.writeInt(intFormF2);
					break;
				}
				else{
					intFormF1 = f1.readInt();
				}
			}
			else{
				f3.writeInt(intFormF2);
				if(f2.available() == 0 || f2Count++ >= segmentSize){
					f3.writeInt(intFormF1);
					break;
				}
				else{
					intFormF2 = f2.readInt();
				}
			}
		}
		
		while(f1.available() > 0 && f1Count++ < segmentSize){
			f3.writeInt(f1.readInt());
		}
		while(f2.available() > 0 && f2Count++ < segmentSize){
			f3.writeInt(f2.readInt());
		}
	}

	public static void copyHalfToF2(int numberOfSegments, int segmentSize, DataInputStream f1,
			DataOutputStream f2) throws Exception{
		for(int i=0;i < (numberOfSegments/2)*segmentSize; i++){
			f2.writeInt(f1.readInt());
		}
	}
	
	/*
	 * Display the first 100 numbers in the specified file
	 */
	public static void displayFile(String filename) {
		try{
			DataInputStream input = new DataInputStream(new FileInputStream(filename));
			for(int i=0;i<100;i++)
				System.out.print(input.readInt()+" ");
			input.close();
		}
		catch (IOException ex){
			ex.printStackTrace();
		}
	}

}
