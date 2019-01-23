import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;

class Display {
	ReentrantLock lock = new ReentrantLock();

	public void wish(String name) {
		while (true) {
			try {
				if (lock.tryLock(2, TimeUnit.SECONDS)) {
					System.out.println(Thread.currentThread().getName() + " Lock  got.");
					for (int i = 0; i < 10; i++) {
						System.out.println("GOOD MORNING : " + name);
						try {
							Thread.sleep(1000);
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					}
					lock.unlock();
					break;
				} else {
					System.out.println(Thread.currentThread().getName() + " Lock not got. Retry!!!");
				}
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}

class MyThread extends Thread {
	Display display;
	String name;

	MyThread(Display display, String name) {
		this.display = display;
		this.name = name;
	}

	public void run() {
		display.wish(name);
	}
}

public class ThreadGroupDemo {
	public static void main(String[] args) {
		Display display = new Display();
		MyThread thread1 = new MyThread(display, "DURAI");
		MyThread thread2 = new MyThread(display, "HARI");

		thread1.start();
		;
		thread2.start();
	}
}
