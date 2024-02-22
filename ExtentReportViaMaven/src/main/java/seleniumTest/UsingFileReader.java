package seleniumTest;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class UsingFileReader {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		String location="UsingBufferedWriter.txt";
		FileReader fileread = new FileReader(location);
		BufferedReader reader = new BufferedReader(fileread);
		String currentLine;
		while((currentLine = reader.readLine())!=null) {
			System.out.println(currentLine);
		}
	}

}
