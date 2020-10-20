package MyExample;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.HashSet;
import java.util.Set;

public class MapTest {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		File f = new File("C:\\Kiran-Stuffs\\Automation\\CIFSPostingUtility\\src\\test\\java\\tests\\file.txt");

		Set<String> fileNames =  new HashSet<String>();
		BufferedReader br = new BufferedReader(new FileReader(f));
		String str;
		while((str= br.readLine() )!= null ) {
			System.out.println("Hello " +  str);
			fileNames.add(str);
			
		}
		System.out.println(fileNames.size());
		for (String string : fileNames) {
			//System.out.println(string);
		}
	}

}
