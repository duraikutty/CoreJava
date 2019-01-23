import java.io.Externalizable;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;

public class Externalization implements Externalizable {
	transient String name;
	transient int i;
	int j;
	
	
	
	public Externalization() {
		System.out.println("Public No-arg constructor called");
	}

	public Externalization(String name, int i, int j) {
		super();
		this.name = name;
		this.i = i;
		this.j = j;
	}

	@Override
	public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
		name = (String)in.readObject();
		i = in.readInt();
	}

	@Override
	public void writeExternal(ObjectOutput out) throws IOException {
		out.writeObject(name);
		out.writeInt(i);
	}

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		Externalization externalization = new Externalization("DURAI", 10, 20);
		
		FileOutputStream fileOutputStream = new FileOutputStream("abc.ser");
		ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
		objectOutputStream.writeObject(externalization);
		
		FileInputStream fileInputStream = new FileInputStream("abc.ser");
		ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
		Externalization externalization2 = (Externalization)objectInputStream.readObject();
		
		System.out.println(externalization2.name);
		System.out.println(externalization2.i);
		System.out.println(externalization2.j);
	}

}
