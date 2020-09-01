package online.memphis;

import online.memphis.StringSorter;
import online.memphis.Help;


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Arrays;
import java.lang.StringBuilder;

public class MainProgram {

	private static StringSorter sorter = new StringSorter(new BubbleSorter());

	private static boolean checkString(String line) {
		if (line.trim().isEmpty()) {
			System.out.println("You've entered nothing to sort.");
			return false;
		} else {
			return true;
		}
	}

	public static void main(String[] args) {
		boolean reverse = false;
		boolean ignoreCase = false;
		for (String argument : args) {
			switch (argument) {
				case "--reverse": reverse = true; break;
				case "--ignore-case": ignoreCase = true; break;
				case "--help": Help.getHelp(); System.exit(0);
				default: System.out.println("Wrong arguments. Run with [--help] to get help."); System.exit(0);
			}
		}

		System.out.println("StringSorter is running...");
		System.out.println("Enter words here with spaces between: ");
		String input = UserInput.getInput();
		if (checkString(input)) {
			String[] result = input.split("\\b");
			if (!reverse) {
				sorter.sort(result, ignoreCase);
			} else {
				sorter.sortReverse(result, ignoreCase);
			}
			sorter.print(result);
		}
		System.out.println("StringSorter is closing...");
	}
}
