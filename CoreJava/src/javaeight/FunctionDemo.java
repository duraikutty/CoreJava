package javaeight;

import java.util.function.Function;

class Student{
	String name;
	String id;
	public Student(String name, String id) {
		super();
		this.name = name;
		this.id = id;
	}
	
}

public class FunctionDemo {

	public static void main(String[] args) {
		
		Function<Integer, Integer> squ = (I)->I*I;
		System.out.println(squ.apply(10));
		
		Function<String, Integer> len = (s)->s.length();
		System.out.println(len.apply("durai"));
		
		Function<Student, String> grade = (s)->{
			String name = s.name;
			String gradeName = null;
			if(name.equalsIgnoreCase("Durai")) {
				gradeName = "GOOD";
			}
			return gradeName;
		};
		
		System.out.println(grade.apply(new Student("durai", "10")));
		
		Function<Integer, Integer> squ1 = (i)->i*i;
		Function<Integer, Integer> mul = (i)->i*2;
		
		System.out.println(squ1.andThen(mul).apply(2));
		System.out.println(squ1.compose(mul).apply(2));
		

	}

}
