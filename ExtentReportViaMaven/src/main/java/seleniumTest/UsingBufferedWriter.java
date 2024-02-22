package seleniumTest;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class UsingBufferedWriter {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		String location ="UsingBufferedWriter.txt";
		String content = "Learn Automation using Buffered writer";
		
		FileWriter filewriter = new FileWriter(location);
		BufferedWriter bufferwriter = new BufferedWriter(filewriter);
		bufferwriter.write(content);
		bufferwriter.close();
		
		
	}

}
