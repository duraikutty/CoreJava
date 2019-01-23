package javaeight;

public class Lambda {
	public static void main(String[] args) {
		FunctionalInterfaceDemo fi = ()->System.out.println("hello");
		fi.functionalInterfaceFn();
	}
}
