package array;

public class ArrayRotation {
	public static void rotate(int[] arr, int n) {
		int j;
		for (int i = 0; i < n; i++) {
			int temp = arr[0];
			for (j = 0; j < arr.length - 1; j++) {
				arr[j] = arr[j + 1];
			}
			arr[j] = temp;
		}
		for (int k : arr) {
			System.out.println(k);
		}

	}

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5, 6, 7 };
		rotate(arr, 4);
	}

}
