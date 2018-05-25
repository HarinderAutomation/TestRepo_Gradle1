package mytest;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Test2 {

	WebDriver driver;
	 @Test 
	    public void testSomeLibraryMethod_45() throws InterruptedException {
	       // Library classUnderTest = new Library();
	        System.out.println("***********************Hello Harinder_4*********************");
	        System.setProperty("webdriver.chrome.driver",
					System.getProperty("user.dir") + "/BrowserExecutables/chromedriver_win32.exe");
			System.out.println("Google chrome selected ghghgghghghghg");
			ChromeOptions options = new ChromeOptions();
			options.addArguments("--start-maximized");
	        
	        driver= new ChromeDriver();
	        driver.get("https://www.google.com/");
	        Thread.sleep(3000);
	        driver.quit();
	       // Assert.assertEquals("rwr", "545");
	    }
}
