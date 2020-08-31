package online.memphis;

import org.junit.Test;
import org.junit.Before;
import org.junit.After;

import static org.junit.Assert.*;

public abstract class StringSorterTest {

	private StringSorter sorter;
	private String[] array1;
	private String[] array2;
	private String[] array3;

	public StringSorterTest() {}

 	public StringSorterTest(StringSorter sorter) {
		this.sorter = sorter;
	}

	@Before
	public void setup() {
		array1 = new String[]{"Orange", "apple", "Coconut", "Pear", "peach", "Grape", "banana"};
		array2 = new String[]{"Just", "justify", "applet", "New-york", "Apple", "new", "newspaper", "$_first_word"};
		array3 = new String[]{"first", "second", "third", "fourth", "fifth", "sixth", "seventh"};
	}

	@Test
	public void sortSuccess() {
		String[] result1 = {"apple", "banana", "Coconut", "Grape", "Orange", "peach", "pear"};
		sorter.sort(array1);
		assertArrayEquals(result1, array1);
	}
}
