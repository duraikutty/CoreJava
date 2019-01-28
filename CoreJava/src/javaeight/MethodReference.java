package javaeight;

class MethodRef {
	public static void m1() {
		for (int i = 0; i < 10; i++) {
			System.out.println("Method Reference static method");
		}
	}
	
	public int m2() {
		for (int i = 0; i < 10; i++) {
			System.out.println("Method Reference instance method");
		}
		return 10;
	}
}

public class MethodReference {

	public static void main(String[] args) {
		Runnable r1 = () ->{
			for(int i=0;i<10;i++) {
				System.out.println("child thread");
			}
		};
		
		Runnable r2 = MethodRef::m1;
		MethodRef mr = new MethodRef();
		Runnable r3 = mr::m2;
		
		Thread t = new Thread(r3);
		t.start();
		for(int i=0;i<10;i++) {
			System.out.println("Main Thread");
		}
	}
}
