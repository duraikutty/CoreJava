package javaeight;

public interface Interface8 {
	int add();
	default void sub() {
		System.out.println("SUB FROM INTERFACE");
	}
}
