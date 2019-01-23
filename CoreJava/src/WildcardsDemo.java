import java.util.ArrayList;



public class WildcardsDemo {
	public static void m(ArrayList al) {
		al.add(10);
		
	}
	public static void main(String[] args) {
		ArrayList<String> al= new ArrayList<String>();
		al.add("Duari");
		WildcardsDemo.m(al);
		System.out.println(al);
	}
}
