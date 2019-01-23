import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

class MyCallable implements Callable<String>{

	@Override
	public String call() throws Exception {
		return "DURAI";
	}
}
public class CallableDemo {

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		ExecutorService executorService = Executors.newFixedThreadPool(3);
		MyCallable t1 = new MyCallable();
		MyCallable t2 = new MyCallable();
		
		Future<String> r1 = executorService.submit(t1);
		Future<String> r2 = executorService.submit(t2);
		System.out.println(r1.get());
		System.out.println(r2.get());
		
	}

}
