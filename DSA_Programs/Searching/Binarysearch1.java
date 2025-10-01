package BinarySearch;

public class Binarysearch1 {

	public int BinarySearch1(int[] arr, int value) {

		int start = 0;
		int end = arr.length - 1;

		if (value > arr[end] || value < arr[start]) {
			return -1;
		}

		while (start <= end) {

			int mid = (start + end) / 2;

			if (value == arr[mid]) {
				return mid;
			} else if (value < arr[mid]) {
				end = mid - 1;
			} else {
				start = mid + 1;
			}

		}

		return -1;
	}

	public static void main(String[] args) {

		Binarysearch1 b = new Binarysearch1();

		int[] arr = { 10, 20, 30, 40, 50, 60, 70, 80 };

		int x = b.BinarySearch1(arr, 70);

		if (x == -1) {
			System.out.println("Element Not Found");
		} else {
			System.out.println("Element " + arr[x] + " found at index " + x);

		}

	}
}