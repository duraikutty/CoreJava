package InnerClass;

import InnerClass.outter.inner;

interface outter {
	public void m1();

	interface inner {
		public void m2();
	}
}

class Test1 implements outter{

	@Override
	public void m1() {
		System.out.println("outter interface");
		
	}
	
}

class Test2 implements inner{

	@Override
	public void m2() {
		System.out.println("inner interface");
		
	}
	
}

public class Outer {

	public static void main(String[] args) {
		Test1 test1 = new Test1();
		test1.m1();
		
		Test2 test2 = new Test2();
		test2.m2();
	}

}
