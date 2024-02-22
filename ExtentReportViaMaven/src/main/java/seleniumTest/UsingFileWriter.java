package seleniumTest;

import java.io.FileWriter;
import java.io.IOException;

public class UsingFileWriter {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		String location ="UsingFileWriter.txt";
		String content = "Learn Automation using File writer";
		
		FileWriter filewriter = new FileWriter(location);
		filewriter.write(content);
		filewriter.close();
	}

}
