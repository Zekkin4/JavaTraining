package Exercise7;

import java.io.BufferedReader;

import java.io.FileReader;

public class Printer {

	public static void main(String[] args) {

		try (BufferedReader reader = new BufferedReader(new FileReader("/Users/zekkin/eclipse-workspace/text.txt"))) {

			String line;

			while ((line = reader.readLine()) != null) {

				System.out.println(line);

			}

		}

		catch (Exception e) {

			e.printStackTrace();

		}

	}

}
