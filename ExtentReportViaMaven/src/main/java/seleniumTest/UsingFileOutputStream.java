package seleniumTest;

import java.io.FileOutputStream;
import java.io.IOException;

public class UsingFileOutputStream {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		String location ="UsingFileOutpuStream.txt";
		String content = "Learn Automation using File OutPut Stream";
		
		FileOutputStream fileoutput = new FileOutputStream(location);
		byte [] writethis =content.getBytes();
		fileoutput.write(writethis);
		fileoutput.close();
		
	}

}
