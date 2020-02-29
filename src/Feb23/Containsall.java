package Feb23;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Containsall {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Ganpat\\Downloads\\chromedriver_win32\\chromedriver.exe");
		 
		WebDriver driver = new ChromeDriver(); 	 // this line initiates the browser
		driver.get("https://www.seleniumeasy.com/test/basic-first-demo.html");// this lines given url
		
		//driver.findElement(By.xpath("//input[@id ='firstname']")).sendKeys("Ajay");
		
		driver.findElement(By.xpath("//button[contains(text),'Show Message']")).click();

	}

}
