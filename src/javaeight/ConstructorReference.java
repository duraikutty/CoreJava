package javaeight;


interface inter{
	Sample get();
}

class Sample {
	public Sample() {
		System.out.println("Sample class constructor exe");
	}
}


public class ConstructorReference {

	public static void main(String[] args) {
		inter i = Sample::new;
		Sample s = i.get();

	}

}
