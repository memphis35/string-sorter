package online.memphis;

public class StringBubbleSorterTest extends StringSorterTest {

	public StringBubbleSorterTest() {
		super(new StringSorter(new BubbleSorter()));
	}
}
