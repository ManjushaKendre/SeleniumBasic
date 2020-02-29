package Feb27;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GmailLogin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Ganpat\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://accounts.google.com/");
		WebElement textbox = driver.findElement(By.name("email"));
		
		textbox.sendKeys("manju.kendre12@gmail.com");
		// driver.findElement(By.name("Next")).click();
		 
		WebElement textbox1 = driver.findElement(By.name("password"));
		
		textbox1.sendKeys("Manju123");
		
		String title = driver.getTitle();
		
		System.out.println(title);
		
	}

}
