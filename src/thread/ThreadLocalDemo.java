package thread;
public class ThreadLocalDemo {

	public static void main(String[] args) {
		ThreadLocal tl = new ThreadLocal();
		tl.set("durai");
		System.out.println(tl.get());
		tl.remove();
		System.out.println(tl.get());

	}

}
