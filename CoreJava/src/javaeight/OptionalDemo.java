package javaeight;

import java.util.ArrayList;

public class OptionalDemo {

	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(10);
		al.add(20);
		
		al.forEach((i)->System.out.println(i));
		
		int add = al.stream().mapToInt(i->i).sum();
		System.out.println(add);
	}

}
