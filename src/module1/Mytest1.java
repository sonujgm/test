package module1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Mytest1 {

	@Test
	public void demo() {
		
		System.setProperty("webDriver.chrome.driver", "C:\\Users\\DELL\\drivers\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://account.box.com/login"); 
		System.out.println(driver.getTitle());
		driver.quit();
	}
}
