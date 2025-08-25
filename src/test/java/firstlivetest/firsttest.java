package firstlivetest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class firsttest {

	@Test
	public static void f1() throws InterruptedException {
		// TODO Auto-generated method stub
		
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://chatgpt.com/");
		System.out.println("ChatGpt opened");
		Thread.sleep(4000);

		driver.quit();
		System.out.println("Browser closed");
	}

}
