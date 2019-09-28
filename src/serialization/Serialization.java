package serialization;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Account {
	String username = "DuraiKutty";
	transient String password = "Haripriya";
	transient String pin = "HP";
	
	public Account() {
		System.out.println("Account Called");
	}

	private void writeObject(ObjectOutputStream oos) throws IOException {
		oos.defaultWriteObject();
		String ePassword = "123"+password;
		String ePin = "123"+pin;
		oos.writeObject(ePassword);
		oos.writeObject(ePin);
	}
	
	private void readObject(ObjectInputStream ois) throws Exception{
		ois.defaultReadObject();
		String ePassword = (String)ois.readObject();
		String ePin = (String)ois.readObject();
		password = ePassword.substring(3);
		pin = ePin.substring(3);
	}
}

class Bank extends Account implements Serializable{
	int i = 10;

	public Bank() {
		System.out.println("Bank called");
	}
	
}

public class Serialization {
	public static void main(String[] args) throws Exception {
		//Account account = new Account();
		Bank bank = new Bank();
		bank.password="EDITED";
		bank.i = 20;
		FileOutputStream outputStream = new FileOutputStream("serial.ser");
		ObjectOutputStream out = new ObjectOutputStream(outputStream);
		out.writeObject(bank);
		
		FileInputStream inputStream = new FileInputStream("serial.ser");
		ObjectInputStream in = new ObjectInputStream(inputStream);
		Bank bank2 = (Bank)in.readObject();
		
		System.out.println(bank2.username);
		System.out.println(bank2.password);
		System.out.println(bank2.pin);
		System.out.println(bank2.i);
	}
}
 