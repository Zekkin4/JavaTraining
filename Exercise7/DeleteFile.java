package Exercise7;

import java.io.File;

import java.io.IOException;

public class DeleteFile {

	public static void main(String[] args) throws IOException {

		File f = new File("/Users/zekkin/eclipse-workspace/old.txt");

		try {

			while (true)

				if (f.delete())

				{

					System.out.println(f.getName() + " deleted");

					return;

				} else {

					f.createNewFile();

				}

		} catch (Exception e) {

			e.printStackTrace();

		}

	}

}
