package selenium.test;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadWriteProperties {
	public static void main(String[] args) throws IOException {
		Properties prop = new Properties();
		FileInputStream inputSt = new FileInputStream("C:\\Users\\Jayalaxmi\\SELINIUM-Workspace\\selinium\\src\\test\\resources\\Properties\\testdata.properties");
		prop.load(inputSt);
		System.out.println(prop.getProperty("browser"));
		System.out.println(prop.getProperty("url"));
		
		FileOutputStream op = new FileOutputStream("C:\\Users\\Jayalaxmi\\SELINIUM-Workspace\\selinium\\src\\test\\resources\\Properties\\testdata.properties2");
	
		prop.setProperty("testdata", "576878");
		prop.store(op, "This is customer from tc3");
}
}
