//Day11   6/8/2016

package mypackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Demo1 {
	@Test
	public void testA(){
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.google.co.in/");
		driver.close();
		
	}
}
