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
		array2 = new String[]{"Just", "justify", "applet", "New-York", "Apple", "new", "newspaper", "$_first_word"};
		array3 = new String[]{"First", "second", "Third", "fourth", "fifth", "Sixth", "seventh"};
	}

	@Test
	public void sortIgnoreCaseSuccess() {
		String[] result1 = {"apple", "banana", "Coconut", "Grape", "Orange", "peach", "Pear"};
		String[] result2 = {"$_first_word", "Apple", "applet", "Just", "justify", "new", "New-York", "newspaper"};
		String[] result3 = {"fifth", "First", "fourth", "second", "seventh", "Sixth", "Third"};
		sorter.sort(array1, true);
		sorter.sort(array2, true);
		sorter.sort(array3, true);
		assertArrayEquals(result1, array1);
		assertArrayEquals(result2, array2);
		assertArrayEquals(result3, array3);
	}

	@Test
	public void sortNotIgnoreCaseSuccess() {
		String[] result1 = {"Coconut", "Grape", "Orange", "Pear", "apple", "banana", "peach"};
		String[] result2 = {"$_first_word", "Apple", "Just", "New-York", "applet", "justify", "new", "newspaper"};
		String[] result3 = {"First", "Sixth", "Third", "fifth", "fourth", "second", "seventh"};
		sorter.sort(array1, false);
		sorter.sort(array2, false);
		sorter.sort(array3, false);
		assertArrayEquals(result1, array1);
		assertArrayEquals(result2, array2);
		assertArrayEquals(result3, array3);
	}

	@Test
	public void sortReverseIgnoreCase() {
		String[] result1 = {"Pear", "peach", "Orange", "Grape", "Coconut", "banana", "apple"};
		sorter.sortReverse(array1, true);
		assertArrayEquals(result1, array1);
	}
}
