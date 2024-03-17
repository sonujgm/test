import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class test_intro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webDriver.chrome.driver", "C:\\Users\\DELL\\drivers\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://account.box.com/login"); 
		System.out.println(driver.getTitle());
	}

}
