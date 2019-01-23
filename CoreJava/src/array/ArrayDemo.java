package array;

public class ArrayDemo {
	
	public static void main(String[] args) {
		int[] i = {10,20,30};
		int[] j = {40,50,60};
		i = j;
		j = i;
		for(int k : i) {
			System.out.println(k);
		}
	}

}
