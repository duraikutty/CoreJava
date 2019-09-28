package thread;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;


class MyThreadDemo extends Thread{
	public void run() {
		System.out.println("Hi I am "+Thread.currentThread().getName());
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

public class ThreadPoolDemo {

	public static void main(String[] args) {
		ExecutorService executorService = Executors.newFixedThreadPool(1);
		
		MyThreadDemo myThread1 = new MyThreadDemo();
		MyThreadDemo myThread2 = new MyThreadDemo();
		executorService.submit(myThread1);
		executorService.submit(myThread2);

	}

}
