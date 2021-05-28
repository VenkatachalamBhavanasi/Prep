package practice.java;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GreenKart {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "binary//chromedriver");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");

		String[] itemsNeeded = { "Cucumber", "Brocolli" };
		List<String> asList = Arrays.asList(itemsNeeded);
		List<WebElement> list = driver.findElementsByCssSelector("h4.product-name");
		for (int i = 0; i < list.size(); i++) {
			String text = list.get(i).getText().split("-")[0].trim();
			if (asList.contains(text)) {
			//	System.out.println(driver.findElementsByXPath("//img[@alt="+text+"]//following::button"));
				driver.findElementByXPath("//img[@alt='"+text+"']//following::button").click();
				break;

			}

		}

	}

	/*
	 * @Test public void example() {
	 *
	 * System.setProperty("webdriver.chrome.driver", "binary//chromedriver");
	 * ChromeDriver driver= new ChromeDriver(); driver.manage().window().maximize();
	 * driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
	 *
	 *
	 * }
	 */

}
