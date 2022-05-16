package Pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class HTMLcanvasStudio 
{
	static WebDriver driver;
	static WebElement element;

	private String ImageTemp="//*[@id='imageTemp']";
	private String DrawAline="//*[@title='Draw a line']";

	public HTMLcanvasStudio setDriver() {

		System.setProperty("webdriver.chrome.driver", "Drivers\\chromedriver.exe");
		driver=new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("http://www.htmlcanvasstudio.com/");

		//System.out.println(driver.getTitle());

		return this;
	}

	public HTMLcanvasStudio clickOnDrawALine() {

		element=driver.findElement(By.xpath(DrawAline));
		
		element.click();

		return this;

	}

	public HTMLcanvasStudio drawLines() {

		Actions a=new Actions(driver);

		element= driver.findElement(By.xpath(ImageTemp));

		a.moveToElement(element, 20,50).click();

		for(int i=1;i<150;i++) {
			a.moveToElement(element, 20+i,50).perform();
		}

		a.click();
		
		a.moveToElement(element, 50,20).click();

		for(int i=1;i<150;i++) { 
			a.moveToElement(element, 50,20+i).perform(); 
		}

		a.click();
		
		return this;

	}


	public HTMLcanvasStudio closeBrowser() {

		driver.quit();

		return this;
	}
	
}
