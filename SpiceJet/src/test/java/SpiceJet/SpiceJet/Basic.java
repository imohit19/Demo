package SpiceJet.SpiceJet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Basic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver","C:\\Users\\Ishan Mohit\\Desktop\\selenium\\SpiceJet\\geckodriver.exe");
		 
		// Initialize browser
		WebDriver driver=new FirefoxDriver();
		
		
		//driver.get("https://demo.actitime.com/login.do");
	//driver.findElement(By.xpath("//input[@id='username']")).sendKeys("trainee");
	//input[contains(@name,'username')]
	//driver.findElement(By.xpath("//input[contains(@name,'username')]")).sendKeys("trainee");
	
	//driver.findElement(By.xpath("//input[@name='pwd']")).sendKeys("trainee");
	//driver.findElement(By.xpath("//a[contains(@id,'loginButton')]")).click();
	
	//a[starts-with(text(),'Forgot')]
		

		driver.get("https://www.selenium.dev/downloads/");
		driver.findElement(By.xpath("//td[starts-with(text(),'Java')][1]/..//a[contains(@href,'https://selenium-release.storage.googleapis.com/3.141/selenium-java-3.141.59.zip')]")).click();
		
		
	}

}
