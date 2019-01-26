package javaeight;

interface left{
	default void m1() {
		System.out.println("Left");
	}
	static void m2() {
		System.out.println("Static");
	}
}

interface right{
	default void m1() {
		System.out.println("Right");
	}
}

class P implements Interface8,left,right{
	
	
	@Override
	public int add() {
		return 0;
	}

	@Override
	public void m1() {
		System.out.println("I");
	}
	
	public void sub() {
		System.out.println("SUB FROM CLASS");
	}
}

class Indian implements left{
	public static void main(String[] args) {
		P d = new P();
		d.sub();
		d.m1();
		left.m2();
	}
}
