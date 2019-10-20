package string;

public class StringDemo {

	static int minimumSwaps(int[] arr) {
		int l = arr.length;
		int swapCount = 0;
		
		for (int i = 0; i < l; i++) {
			int min = i;
			for (int j = i; j <= l; j++) {
				if (j < l-1 && arr[min] > arr[j+1]) {
					min = j + 1;
				}
			}
			if (min != i) {
				int temp = arr[i];
				arr[i] = arr[min];
				arr[min] = temp;
				swapCount++;
				for(int k : arr) {
					System.out.println(k);
				}
				System.out.println();
			}
		}
		return swapCount;
	}

	public static void main(String[] args) {

		int i = minimumSwaps(new int[] { 3, 7, 6, 9, 1, 8, 10, 4, 2, 5});
		System.out.println(i);

	}
}
