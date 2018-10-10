package com.himanshu.patterns.singleton;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Test {

	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
		DateUtil date1 = DateUtil.getInstance();
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(new File("/Users/himanshuchhabra/dateUtil.ser")));
		oos.writeObject(date1);
		
		DateUtil date2 = null;
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream(new File("/Users/himanshuchhabra/dateUtil.ser")));
		date2 = (DateUtil) ois.readObject();
		
		
		oos.close();
		ois.close();
		System.out.println(date1 == date2);
	}

}

/*
 * 		DateUtil date1 = DateUtil.getInstance();
		DateUtil date2 = DateUtil.getInstance();
		System.out.println(date1 == date2);
 */
