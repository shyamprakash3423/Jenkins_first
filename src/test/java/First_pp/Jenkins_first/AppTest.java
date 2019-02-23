package First_pp.Jenkins_first;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

/**
 * Unit test for simple App.
 */
public class AppTest {
	@Test
    public void testB() {
    	System.out.println("Hello test b");
    	System.setProperty("webdriver.firefox.marionette", "D:\\shyam\\set ups\\geckodriver.exe");
    	WebDriver driver=new FirefoxDriver();
    	driver.get("https:\\www.google.com");
    	System.out.println("test b is pass");
    	
    }
}
