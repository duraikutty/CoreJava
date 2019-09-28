package javaeight;

import java.util.Date;
import java.util.function.Supplier;

public class SupplierDemo {

	public static void main(String[] args) {
		Supplier<Date> s =()->new Date();
		System.out.println(s.get());
		
		Supplier<Integer> otp = () -> {
			Integer i = 100;
			return i;
		};
		
		System.out.println(otp.get());
		
	}

}
