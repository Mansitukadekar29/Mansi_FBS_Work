package BinarySearch;

public class Binarysearch {

	public static void main(String[] args) {
		int arr[] = { 1, 3, 5, 7, 9, 11, 13, 15 };
		int size = arr.length;
		int ele = 3;
		int start = 0;
		int end = size - 1;
		boolean found = false;

		if (ele < arr[0] || ele > arr[size - 1]) {
			System.out.println("Element not found");
			return;
		}

		while (start <= end) {
			int mid = (start + end) / 2;

			if (ele == arr[mid]) {
				System.out.println("Element found: " + arr[mid] + " at index " + mid);
				found = true;
				break;
			} else if (ele < arr[mid]) {
				end = mid - 1;
			} else {
				start = mid + 1;
			}
		}

		if (!found) {
			System.out.println("Element not found");
		}
	}
}