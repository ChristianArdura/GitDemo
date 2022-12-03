import java.io.FileInputStream;

import java.io.FileOutputStream;

import java.io.IOException;

import java.util.Properties;

public class GlobalValuesDrive {

	public static void main(String[] args) throws IOException {

		// Read data
		Properties prop = new Properties();
		FileInputStream fis = new FileInputStream("C:\\Users\\ChristianArdura\\eclipse-workspace\\Introduction\\src\\data.properties");
		prop.load(fis);
		System.out.println(prop.getProperty("browser"));
		System.out.println(prop.getProperty("url"));

		//Modify data
		prop.setProperty("browser", "firefox");
		System.out.println(prop.getProperty("browser"));

		//Store data
		FileOutputStream fos = new FileOutputStream("C:\\Users\\ChristianArdura\\eclipse-workspace\\Introduction\\src\\data.properties");
		prop.store(fos, null);

	}

}
