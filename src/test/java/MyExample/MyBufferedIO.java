package MyExample;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class MyBufferedIO {

	public static BufferedReader fIn;
	public static BufferedWriter fOut;
	
	static public void read_write_file(String inPath, String outPath) throws IOException {
		
		fIn = new BufferedReader(new FileReader(inPath));
		fOut = new BufferedWriter(new FileWriter(outPath, true));
		
		String myLine = null; short substrCount = 0;
		
		while ( (myLine = fIn.readLine()) != null ) {
			
			if (myLine.contains("this")) substrCount++;
			
			fOut.write(myLine);
			fOut.newLine();
		}
		System.out.println("Count of this in the lines is: " + substrCount);
	}
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		String inPath, outPath;
		
		inPath = args[0];
		outPath = args[1];
		
		read_write_file(inPath, outPath);
		
		if (fIn != null && fOut != null) { 
			fIn.close();
			fOut.close();
		}
			
	}

}
