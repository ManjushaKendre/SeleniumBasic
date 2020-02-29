package Feb22;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToursRegistrer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Ganpat\\Downloads\\chromedriver_win32\\chromedriver.exe");
		 
		WebDriver driver = new ChromeDriver(); 	 // this line initiates the browser
		driver.get("http://newtours.demoaut.com");// this lines given url
        WebElement textBox = driver.findElement(By.name("first_name")); // the value of name is stored in textbox object
		
		textBox.sendKeys("JOHN");
		


	}

}
