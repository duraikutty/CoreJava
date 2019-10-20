package array;

public class ArrayCreation {
	
	public static void main(String[] args) {
		int size = 10;
		int [] intArray = new int[size];
		double[] doubleArray = new double[size];
		short[] shortArray = new short[size];
		boolean[] booleanArray = new boolean[size];
		byte[] byteArray = new byte[size];
		
		System.out.println(intArray.getClass().getName());;
		System.out.println(doubleArray.getClass().getName());
		System.out.println(shortArray.getClass().getName());
		System.out.println(booleanArray.getClass().getName());
		System.out.println(byteArray.getClass().getName());
		
		int [][] twodIntArray = new int[size][size];
		double[][]twodDoubleArray = new double[size][size];
		short[][] twodShortArray = new short[size][size];
		boolean[][] twodBooleanArray = new boolean[size][size];
		byte[][] twodByteArray = new byte[size][size];
		
		System.out.println(twodIntArray.getClass().getName());;
		System.out.println(twodDoubleArray.getClass().getName());
		System.out.println(twodShortArray.getClass().getName());
		System.out.println(twodBooleanArray.getClass().getName());
		System.out.println(twodByteArray.getClass().getName());
		
		int[] intArraywithZero = new int[0];
		System.out.println("Array length : "+intArraywithZero.length);
		//int ii = intArraywithZero[0]; leads to ArrayIndexOutOfBoundsException
		/* To specify aray size, allowed types int,char,byte,*/
		int [] intArr = new int['k']; 
		
		
		int[] i = {10,20,30};
		int[] j = {40,50,60};
		
		i = j;
		j = i;
		for(int k : j) {
			System.out.println(k);
		}
		
		int [] x = {1,2,3};
		int [] y = {4,5};
		
		x = y;
		y = x;
		for(int kj : y) {
			System.out.println(kj);
		}
		
		
	}

}
