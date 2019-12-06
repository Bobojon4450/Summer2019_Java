package day58_Exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class WarmUp {
	
	public static void main(String[] args) {
		wait(2.5);
		System.out.println("Batch 12");
		
		
		Properties property = new Properties();
		String path = "C:\\Users\\Vaha\\Desktop\\Data.properties";
		try {
			FileInputStream file = new FileInputStream(path);
			property.load(file);
		} catch (Exception e) {
			e.printStackTrace();
		}
        String Name =   property.getProperty("ID");
        System.out.println(Name);
		
	}
	
	public static void wait(double seconds) {
		try {
			Thread.sleep((long) (seconds * 1000));
		} catch (InterruptedException e) {
			System.out.println("Exception thrown");
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	
	public static String getData(String key, String path) {
		String data = "";
		Properties prop = new Properties();

		try {
			FileInputStream input = new FileInputStream(path);
			prop.load(input);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		data = prop.getProperty(key);
		return data;
	}
	
	
	
}
