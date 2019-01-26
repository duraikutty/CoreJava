package javaeight;

import java.util.ArrayList;
import java.util.function.Predicate;


class Employee{
	String name;
	String id;
	public Employee(String name, String id) {
		super();
		this.name = name;
		this.id = id;
	}
	
	
}

public class PredicateDemo {

	public static void main(String[] args) {
		
		Predicate<Integer> p = (I) -> I%2==0;
		System.out.println(p.test(10));
		
		Predicate<String> pStr = (s) -> s.length() > 5;
		System.out.println(pStr.test("Durair"));
		
		
		ArrayList<Employee> al = new ArrayList<Employee>();
		al.add(new Employee("durai","1"));
		al.add(new Employee("kutty", "2"));
		
		Predicate<Employee> pEmp = (e) -> e.name.equalsIgnoreCase("durai");
		for(Employee e : al) {
			System.out.println(e.name);
			System.out.println(pEmp.test(e));
		}
		
		
		Predicate<Integer> p1 = (I)->I%2==0;
		Predicate<Integer> p2 = (I)->I>10;
		
		System.out.println("Combine : "+p1.and(p2).test(13));
		
		p1.negate().test(10);
		
		
		
		

	}

}
