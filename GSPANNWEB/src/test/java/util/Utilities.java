package util;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.common.BaseClass;

public class Utilities{
	
	public String file(String key) 
	{
		FileInputStream file = null;
		try {
			file = new FileInputStream("PropertiesFiles/config.properties");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
		Properties pr = new Properties();
		try {
			pr.load(file);
		} catch (IOException e) {
			e.printStackTrace();
		}
		return pr.getProperty(key);
	}
	
	public static Utilities util = new Utilities();

}
