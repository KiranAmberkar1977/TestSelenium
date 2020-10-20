package MyExample;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class MyStreambasedIO {

	public static FileInputStream fIn;
	public static FileOutputStream fOut;
	
	static public void read_write_file(String inPath, String outPath) throws IOException {
		
		fIn = new FileInputStream(inPath);
		fOut = new FileOutputStream(outPath, true);
		
		int myChar = 0x00; 
		short substrCount = 0;
		
		while ( (myChar = fIn.read()) != -1 ) {
			System.out.println("The file char is: " + (char)myChar);
			fOut.write(myChar);
			if (myChar == '\n')
				substrCount++;
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
