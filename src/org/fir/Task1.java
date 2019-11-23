package org.fir;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Task1 {
	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\dell\\eclipse-workspace\\Firefox\\driver\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver ();
		driver.get("http://www.greenstechnologys.com/");
		
	}

}
