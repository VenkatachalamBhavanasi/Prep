package practice.java;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Iterator;
import java.util.List;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrokenImages {

	@Test
	public void example() throws IOException {

		System.setProperty("webdriver.chrome.driver", "binary//chromedriver");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/broken");

		List<WebElement> links = driver.findElements(By.tagName("a"));
		System.out.println("No of links are " + links.size());

		for (int i = 0; i < links.size(); i++) {

			String url = links.get(i).getAttribute("href");
			System.out.println(url);
			verifyUrl(url);

		}

		driver.quit();

	}

	@Test
	public void example1() throws IOException {

		System.setProperty("webdriver.chrome.driver", "binary//chromedriver");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/broken");

		List<WebElement> links = driver.findElements(By.tagName("a"));
		System.out.println("No of links are " + links.size());

		Iterator<WebElement> iterator = links.iterator();

		while (iterator.hasNext()) {
			String text = iterator.next().getAttribute("href");
			System.out.println(text);
			verifyUrl(text);

		}

		/*
		 * for (int i = 0; i < links.size(); i++) {
		 *
		 * String url = links.get(i).getAttribute("href"); System.out.println(url);
		 * verifyUrl(url);
		 *
		 * }
		 */

		driver.quit();

	}

	private void verifyUrl(String attribute) throws IOException {
		// TODO Auto-generated method stub

		try {
			URL link = new URL(attribute);
			HttpURLConnection connection = (HttpURLConnection) link.openConnection();
			connection.setConnectTimeout(2000);
			connection.connect();
			if (connection.getResponseCode() == 200) {

				System.out.println(attribute + " - " + connection.getResponseMessage());

			}
			if (connection.getResponseCode() == 404) {
				System.out.println(attribute + " - " + connection.getResponseMessage());
			}

		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
