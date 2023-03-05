package Exercise7;

import java.io.FileNotFoundException;

import java.io.FileReader;

import java.io.FileWriter;

import java.io.IOException;

import java.io.Reader;

import java.io.Writer;

public class CopyFile {

	public static void main(String[] args) throws FileNotFoundException, IOException {

		try (FileReader reader = new FileReader("/Users/zekkin/eclipse-workspace/text.txt");

				FileWriter writer = new FileWriter("/Users/zekkin/eclipse-workspace/write.txt")) {

			int a;

			while ((a = reader.read()) != -1) {

				writer.write(a);

			}

			System.out.println("file copied");

		} catch (Exception e) {

			e.printStackTrace();

		}

	}

}
