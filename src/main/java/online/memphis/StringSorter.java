package online.memphis;

import online.memphis.Sorter;
import online.memphis.BubbleSorter;

import java.lang.StringBuilder;

public class StringSorter {

	private Sorter sorter;
	private StringBuilder builder;

	public StringSorter(Sorter sorter) {
		this.sorter = sorter;
	}

	public void sort(String[] array) {
		sorter.sort(array);
	}

	public void sortReverse(String[] array) {
		sorter.sortReverse(array);
	}

	public void print(String[] array) {
		builder = new StringBuilder();
		String delimiter = "====================";
		builder.append("\n").append(delimiter);
		for (String str : array) {
			if (!str.isEmpty()) builder.append(str).append(" ");
		}
		builder.append("\n").append(delimiter);
		System.out.println(builder);
		builder.delete(0, builder.length());
		builder = null;
	}
}
