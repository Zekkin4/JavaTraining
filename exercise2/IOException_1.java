package Exercise2;

import java.io.*;

class FileOpener{
	public static void openFile() throws IOException {

		FileReader fileReader = new FileReader("Zekkin04.txt");
		System.out.println(fileReader.read());
		fileReader.close();	
	}
}

public class IOException_1 {

	// Example of FileNotFoundException

	
	public static void main(String[] args) throws IOException{
		FileOpener.openFile();
	}


}


//without throws
//Exception in thread "main" java.lang.Error: Unresolved compilation problem: 
//	Unhandled exception type IOException
//
//	at zekkin/Exercise2.IOException_1.main(IOException_1.java:20)


//with throws
//Exception in thread "main" java.io.FileNotFoundException: Zekkin04.txt (No such file or directory)
//at java.base/java.io.FileInputStream.open0(Native Method)