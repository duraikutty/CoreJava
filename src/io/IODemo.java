package io;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;

import com.sun.javafx.print.Units;

public class IODemo {

	public static void main(String[] args) throws IOException {
		
		File file = new File("D:..\\durai");
		System.out.println(file.exists());
		
		String name = file.getName();
		String parent = file.getParent();
		String path = file.getPath();
		//System.out.println(name);
		//System.out.println(parent);
		System.out.println(file.getCanonicalFile());
		
		
	}

}
