package Exercise7;

import java.io.BufferedReader;

import java.io.IOException;

import java.io.StringReader;

public class WordCounter {

	public static void main(String[] args) throws IOException {

		String input = "Hello World...!";

		int count = 0;

		try (BufferedReader reader = new BufferedReader(new StringReader(input))) {

			String line;

			while ((line = reader.readLine()) != null) {

				String[] words = line.split("\\s+");

				count += words.length;

			}

		} catch (IOException e) {

			e.printStackTrace();

		} catch (Exception e) {

			e.printStackTrace();

		}

		System.out.println("No.of words " + count);

	}

}
