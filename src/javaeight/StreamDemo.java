package javaeight;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class Demoo {
	public static String print(String s) {
		System.out.println(s);
		return "";
	}
}

class Parent {
	String name;
	String id;

	public Parent(String name, String id) {
		super();
		this.name = name;
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}
}

public class StreamDemo {

	public static void main(String[] args) {

		List<String> l = Arrays.asList("durai", "kutty", "durai");
		// l.stream().filter(n -> n.equals("durai")).forEach(System.out::println);

		l.stream().map(String::toString).map(String::valueOf).forEach(System.out::println);

		System.out.println("*** 1 ***");
		l.stream().map(Demoo::print);

		l.stream().map(String::toString);

		List<Integer> num = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);

		Optional<Integer> i = num.stream().reduce(Integer::sum);
		System.out.println(i.get());

		System.out.println(num.stream().map(String::valueOf).reduce(String::concat));

		int ii = num.stream().filter(j -> j % 2 == 0).map(e -> e * 2).reduce(0, Integer::sum);
		System.out.println(ii);
		
		List<Parent> P = Arrays.asList(
				new Parent("durai", "1"),
				new Parent("kutty", "2")
				);
		
		Map<String, String> m = P.stream().collect(Collectors.toMap(Parent::getName,Parent::getId));
		System.out.println(m);
		
		System.out.println(Stream.iterate(100, e->e+1));
	}

}
