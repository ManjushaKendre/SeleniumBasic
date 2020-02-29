package Feb23;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class LoginFormTesting {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Ganpat\\Downloads\\chromedriver_win32\\chromedriver.exe");
		 
		WebDriver driver = new ChromeDriver(); 	 // this line initiates the browser
		driver.get("https://www.seleniumeasy.com/test/basic-select-dropdown-demo.html");// this lines given url
		
		WebElement dd = driver.findElement(By.id("select-demo"));
		 
		Select dropd = new Select(dd);
		
		dropd.selectByValue("Sunday");
		Thread.sleep(1000);
		
		dropd.selectByIndex(3);
		
		Select multid = new Select(driver.findElement(By.name("States")));
		
		multid.selectByValue("New Jersey");
		Thread.sleep(1000);//select by value
		
		multid.selectByIndex(3); // select by index of value
		Thread.sleep(1000);
		multid.deselectAll();
		
		Thread.sleep(1000);
		
		
		//driver.close(); // close the current browser
		
		driver.navigate().back();
		Thread.sleep(3000);
		
		driver.navigate().forward();
		Thread.sleep(3000);
		
		driver.navigate().refresh();
		Thread.sleep(3000);
		
		
		driver.navigate().to("https://www.google.co.in");
		Thread.sleep(3000);
		
		
		
		
		
		
		
		
		
		
		
	}

}
