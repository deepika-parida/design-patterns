package com.design.patterns.creational.singleton;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;

public class SerializedSingletonTest {
	
	public static void main(String[] args) {
		SerializedSingleton i = SerializedSingleton.getInstance();
		System.out.println(i);
		try {
			ObjectOutput o = new ObjectOutputStream(new FileOutputStream("abc.ser"));
			o.writeObject(i);
			o.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			ObjectInput in = new ObjectInputStream(new FileInputStream("abc.ser"));
			SerializedSingleton j = (SerializedSingleton)in.readObject();
			in.close();
			System.out.println(j);
		} catch (IOException | ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
