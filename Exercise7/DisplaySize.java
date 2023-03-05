package Exercise7;

import java.io.File;

public class DisplaySize {

	public static void main(String[] args) {

		try {

			File file = new File("/Users/zekkin/eclipse-workspace/pic.jpg");

			System.out.println(file.length());

		} catch (Exception e) {

			e.printStackTrace();

		}

	}

}
