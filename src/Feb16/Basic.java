package Feb16;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Basic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","C:\\Users\\Ganpat\\Downloads\\chromedriver_win32\\chromedriver.exe");
		 
		WebDriver driver = new ChromeDriver(); 	 // this line initiates the browser
		driver.get("https://www.seleniumeasy.com/test/input-form-demo.html");// this lines given url
		
		WebElement textBox = driver.findElement(By.name("first_name")); // the value of name is stored in textbox object
		
		textBox.sendKeys("JOHN");
		
		WebElement textBox1 = driver.findElement(By.name("last_name")); // the value of name is stored in textbox object
		
		textBox1.sendKeys("SMITH");
		
		WebElement textBox2 = driver.findElement(By.name("email")); // the value of name is stored in tb object
		
		textBox2.sendKeys("john.smith@gmail.com");
		
		WebElement textBox3 = driver.findElement(By.name("phone")); // the value of name is stored in tb object
		
		textBox3.sendKeys("8421333795");
		
		WebElement textBox4 = driver.findElement(By.name("address")); // the value of name is stored in tb object
		
		textBox4.sendKeys("line no 6 Balaji Park keshanad road wagholi");
    
		WebElement textBox5 = driver.findElement(By.name("city")); // the value of name is stored in textbox object
		
		textBox5.sendKeys("Pune");
		
		WebElement textBox6 = driver.findElement(By.name("zip")); // the value of name is stored in textbox object
		
		textBox6.sendKeys("411022");
		
		String title = driver.getTitle();
		
		System.out.println(title);
		
		driver.findElement(By.name("Selenium Easy")).click();
	}

}
