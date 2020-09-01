package online.memphis;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class UserInput {

	public static String getInput() {
		try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
			return reader.readLine();
		} catch (IOException ignored) {

		}
	}
}
