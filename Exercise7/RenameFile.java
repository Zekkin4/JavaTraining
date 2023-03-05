package Exercise7;

import java.io.File;

import java.io.IOException;

public class RenameFile {

	public static void main(String[] args) throws IOException {

		File oldfile = new File("/Users/zekkin/eclipse-workspace/new.txt");

		File newfile = new File("/Users/zekkin/eclipse-workspace/file.txt");

		oldfile.createNewFile();

		if (oldfile.renameTo(newfile)) {

			System.out.println("File name succesfully changed");

		} else {

			System.out.println("Rename failed");

		}

	}

}
