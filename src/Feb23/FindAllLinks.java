package Feb23;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindAllLinks {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Ganpat\\Downloads\\chromedriver_win32\\chromedriver.exe");
		 
		WebDriver driver = new ChromeDriver(); 	 // this line initiates the browser
		driver.get("https://www.google.co.in");// this lines given url
		 Thread.sleep(3000);
		 List<WebElement> alllinks = driver.findElements(By.tagName("a"));
		 
		 System.out.println(alllinks);
		 for (WebElement link:alllinks) {
			 System.out.println(link.getText() + "-->" + link.getAttribute("href"));
			 
		 }
		 
		 
		 
		 
		

	}

}
