package Feb22;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PractiseForm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Ganpat\\Downloads\\chromedriver_win32\\chromedriver.exe");
		 
		WebDriver driver = new ChromeDriver(); 	 // this line initiates the browser
		driver.get("https://demoqa.com/automation-practice-form/");// this lines given url
		
		driver.findElement(By.name("firstname")).sendKeys("Manjusha");
		
		driver.findElement(By.id("lastname")).sendKeys("Kendre");
		
		List<WebElement>list = driver.findElements(By.name("sex"));
		System.out.println(list.size());
		System.out.println(list);
		
		list.get(1).click();
		
		List<WebElement> yearOfExp = driver.findElements(By.name("exp"));
		System.out.println(yearOfExp.size());
		
		yearOfExp.get(6).click();
		
		List<WebElement> profession = driver.findElements(By.name("profession"));
		System.out.println(profession.size());
		
		for (WebElement ele:profession)
		{
			ele.click(); // this is used for all options in  profession
		
		}
			List<WebElement> tools = driver.findElements(By.name("tool"));
			for(WebElement tool: tools)
			{
				
				if((tool.getAttribute("value").contains("  Selenium Webdriver")))
				{
					tool.click(); // this check for indivisual "selenuim webdriver"
				}
			}
			
					
		
		
		
		
		

		
		
		
		
		
		
		
		


	}

}
