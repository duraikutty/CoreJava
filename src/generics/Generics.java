package generics;

class DemoGen<T> {
	T obj;

	public DemoGen(T obj) {
		this.obj = obj;
	}

	public void show() {
		System.out.println("Type of obj " + obj.getClass().getName());
	}

	public T getObj() {
		return obj;
	}

}

public class Generics {

	public static void main(String[] args) {
		DemoGen<Integer> d1 = new DemoGen<Integer>(20);
		d1.show();
		System.out.println(d1.getObj());

		DemoGen<String> d2 = new DemoGen<String>("DURAI");
		d2.show();
		System.out.println(d2.getObj());

	}

}
