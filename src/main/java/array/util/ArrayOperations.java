package array.util;

/**
 * Utility class which performs various operations with integer arrays.
 */
public class ArrayOperations {
	private final int[] numbers; // array that needs to be sorted.
	private final int[] unsorted; // reference array which stays unsorted.

	public ArrayOperations(int[] numbers) {
		this.numbers = numbers;
		this.unsorted = numbers.clone();
	}

	/*
	 * ********************************************************** Please implement
	 * the following methods. * It is intended that they are not static. *
	 ***********************************************************/

	/**
	 * Prints out the numbers array.
	 */

	public void print() {
		StringBuilder strBuild = new StringBuilder();
		for (int i = 0; i < numbers.length; i++) {
			strBuild.append(numbers[i]);
			if (i < numbers.length - 1)
				strBuild.append(", ");
		}
		System.out.println("[" + strBuild + "]");
	}

	/**
	 * @return the sorted numbers array.
	 * @see <a
	 *      href="sorting algortihms">http://faculty.cs.niu.edu/~hutchins/csci241/sorting.htm</a>
	 */
	public int[] sort() {
		Integer temp = 0;
		for (int i = 0; i < numbers.length; i++) {
			int j = i;
			while ((j > 0) && (numbers[j] < numbers[j - 1])) {
				temp = numbers[j];
				numbers[j] = numbers[j - 1];
				numbers[j - 1] = temp;
				j--;
			}
		}
		return numbers;
	}

	/**
	 * @return the sorted array in reverse order
	 */
	public int[] revertSort() {

		int revert[] = new int[numbers.length];
		int j = 0;

		for (int i = numbers.length - 1; i >= 0; i--) {
			revert[j++] = numbers[i];
		}
		return revert;
	}

	/**
	 * @return the unsorted array in reverted order.
	 */
	public int[] reverted() {

		int temp[] = new int[unsorted.length];
		int j = 0;

		for (int i = unsorted.length - 1; i >= 0; i--) {
			// System.out.print(i + " ");
			temp[j++] = unsorted[i];
		}

		return temp;
	}

	/**
	 * @param value which should be searched for.
	 * @return true if the array contains the value, false otherwise.
	 */
	public boolean contains(int value) {
		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] == value) {
				return true;
			}
		}
		return false;
	}

	/**
	 * @return the average value of all elements summed up.
	 */
	public double average() {

		double sum = 0;

		for (int i = 0; i < numbers.length; i++) {
			sum += numbers[i];
		}
		sum = sum / numbers.length;

		return sum;
	}

	/**
	 * @return the average value of all elements summed up, but without the highest
	 *         and the lowest value.
	 */
	public double trimmedMean() {

		double sum = 0;

		int max = maxValue();
		int min = minValue();

		for (int i = 0; i < numbers.length; i++) {
			sum += numbers[i];
		}
		int shorten = numbers.length - 2;
		sum = (sum - min - max) / shorten;

		return sum;
	}

	/**
	 * @return the max value of the array. In the array [1,9,3] max would be 9.
	 */
	public int maxValue() {

		int max = numbers[0];

		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] > max) {
				max = numbers[i];
			}
		}
		return max;
	}

	/**
	 * @return the min value of the array. In the array [1,9,3] min would be 1.
	 */
	public int minValue() {

		int min = numbers[0];

		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] < min) {
				min = numbers[i];
			}
		}
		return min;
	}

	/*
	 * ********************************************************** Feel free to add
	 * as many private helper methods as * you like. *
	 ***********************************************************/

	private int someHelper(int[] tmp) {
		return 1;
	}
}
