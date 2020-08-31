package online.memphis;

import online.memphis.StringSorter;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Arrays;
import java.lang.StringBuilder;

public class MainProgram {

	private static StringSorter sorter = new StringSorter(new BubbleSorter());

	public static void main(String[] args) {

		System.out.println("StringSorter is running...");
		System.out.println("Enter words here with spaces between: ");
		
		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
			String[] words = br.readLine().split("\\s{1,*}");
			if (!words[0].isEmpty()) {
				System.out.println("You've entered " + words.length + " words");
				System.out.println("StringSorter now is closed.");
			} else {
				System.out.println("You've not entered even a single word.");
			}
		} catch (IOException ignored) {}
	}
}
