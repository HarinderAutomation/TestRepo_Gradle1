package mytest;


import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;


public class Hari {
	WebDriver driver;
	 @Test 
	    public void testSomeLibraryMethod_3() throws InterruptedException {
	       // Library classUnderTest = new Library();
	        System.out.println("***********************Hello Harinder_3*********************");
	        System.setProperty("webdriver.chrome.driver",
					System.getProperty("user.dir") + "/BrowserExecutables/chromedriver_win32.exe");
			System.out.println("Google chrome selected");
			ChromeOptions options = new ChromeOptions();
			options.addArguments("--start-maximized");
	        
	        driver= new ChromeDriver();
	        driver.get("https://www.google.com/");
	        Thread.sleep(3000);
	        driver.quit();
	       // Assert.assertEquals("rwr", "545");
	    }
}
