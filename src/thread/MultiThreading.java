package thread;
class ThreadDemo extends Thread {
	int total = 0;

	public void run() {
		synchronized (this) {
			System.out.println("CHILD Start calc");
			for (int i = 0; i <= 100; i++) {
				total = total + i;
			}
			this.notify();
		}
	}
}

public class MultiThreading {
	public static void main(String[] args) throws InterruptedException {
		ThreadDemo demo = new ThreadDemo();
		System.out.println(demo.isDaemon());
		demo.start();
		Thread.sleep(10000);
		synchronized (demo) {
			System.out.println("MAIN Trying to call wait method");
			demo.wait(15000);
			System.out.println("MAIN Got Notify");
		}
		System.out.println(demo.total);
	}
}