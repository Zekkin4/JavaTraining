package Exercise2;

import java.io.*;

public class IOException_1 {

	// Example of FileNotFoundException

	public static void main(String[] args) {

		// Creating an instance of FileReader class
		try {
		

		FileReader fileReader = new FileReader("Zekkin04.txt");

		System.out.println(fileReader.read());

		fileReader.close();
		

	}

}
}
