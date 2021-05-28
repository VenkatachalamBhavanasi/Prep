package practice.java;

import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class XandYCordinates {


	@Test
	public void example() {
		System.setProperty("webdriver.chrome.driver", "binary//chromedriver");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		driver.get("https://www.softwaretestingmaterial.com/sample-webpage-to-automate/");
		// find the SoftwareTestingMaterial logo using linkText Locator
		WebElement element = driver.findElement(By.linkText("Software Testing Material"));
		//Used points class to get x and y coordinates of element.
		Point point = element.getLocation();
		int xcord = point.getX();
		System.out.println("Position of the webelement from left side is "+xcord +" pixels");
		int ycord = point.getY();
		System.out.println("Position of the webelement from top side is "+ycord +" pixels");
		// Using Actions class
                Actions action = new Actions(driver);
                //clicking on the logo based on x coordinate and y coordinate
                //you will be redirecting to the home page of softwaretestingmaterial.com
                action.moveToElement(element, xcord, ycord).click().build().perform();




               // Actions action1= new Actions(driver);

               // action1.keyDown(element, Keys.SHIFT).sendKeys("ven").keyUp(Keys.SHIFT);







	}




}
