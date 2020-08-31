package online.memphis;

public class BubbleSorter implements Sorter {

	@Override
	public void sort(String[] array, boolean ignoreCase) {
		sort0(array, (first, second) -> compare(array[first], array[second], ignoreCase));
	}

	@Override
	public void sortReverse(String[] array, boolean ignoreCase) {
		sort0(array, (first, second) -> compare(array[first], array[second], ignoreCase) * -1);
	}

	private void sort0(String[] array, Order order) {
		for (int i = array.length - 1; i > 0; i--) {
			for (int j = 0; j < array.length - 1; j++) {
				if (order.ordering(j, j+1) > 0) {
					String temp = array[j];
					array[j] = array[j+1];
					array[j+1] = temp;
				}
			}
		}
	}

	private int compare(String str1, String str2, boolean ignoreCase) {
		int length = str1.length() <= str2.length() ? str1.length() : str2.length();
		int result = 0;
		for (int i = 0; i < length; i++) {
			result = (!ignoreCase) ?
					str1.charAt(i) - str2.charAt(i) :
					Character.toLowerCase(str1.charAt(i)) - Character.toLowerCase(str2.charAt(i));
			if (result != 0) break;
		}
		if (result == 0) result = str1.length() - str2.length();
		return result;
	}

	private interface Order {
		int ordering(int first, int second);
	}
}
