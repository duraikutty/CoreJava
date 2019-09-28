package javaeight;

import java.util.function.Consumer;
import java.util.function.Predicate;

class Student1{
	String name;
	String no;
	public Student1(String name, String no) {
		super();
		this.name = name;
		this.no = no;
	}
	
}

public class ConsumerDemo {

	public static void main(String[] args) {
	
			Consumer<String> c = (s)->System.out.println(s);
			//c.accept("durai");
			
			Student1 s1 = new Student1("durai", "10");
			Student1 s2 = new Student1("kutty", "20");
			
			Predicate<Student1> pStu = (s)->s.name.equalsIgnoreCase("durai");
			Consumer<Student1> cStu = (s)->{
				if(pStu.test(s)) {
					System.out.println(s.name);
					System.out.println(s.no);
				}
			};
			
			cStu.accept(s1);

	}

}
