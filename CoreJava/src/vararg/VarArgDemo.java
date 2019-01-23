package vararg;

public class VarArgDemo {
	public static void m1(int...d){
		for(int i : d) {
			System.out.println(i);
		}
	}
	public static void main(String[] args) {
		//m1(1,2);
		//m1(1,2,3);
		String s1 = "\0B";
		String s2 = "\0\0C";
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
	}

}
