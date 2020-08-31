package online.memphis;

public class BubbleSorter implements Sorter {

	@Override
	public void sort(String[] array) {
		sort0(array, (first, second) -> compare(array[first], array[second]));
	}

	@Override
	public void sortReverse(String[] array) {
		sort0(array, (first, second) -> compare(array[first], array[second]) * -1);
	}

	private void sort0(String[] array, Order order) {
		for (int i = 0; i < array.length - 1; i++) {
			for (int j = i; j < array.length - 1; j++) {
				if (order.ordering(i, i+1) > 0) {
					String temp = array[i];
					array[i] = array[i+1];
					array[i+1] = temp;
				} else {
					break;
				}
			}
		}
	}

	private int compare(String str1, String str2) {
		String copy1 = str1.toLowerCase();
		String copy2 = str2.toLowerCase();
		int length = str1.length() <= str2.length() ? str1.length() : str2.length();
		int result = 0;
		for (int i = 0; i < length; i++) {
			result = copy1.charAt(i) - copy2.charAt(i);
			if (result != 0) break;
		}
		if (result == 0) result = str1.length() - str2.length();
		return result;
	}

	private interface Order {
		int ordering(int first, int second);
	}
}
