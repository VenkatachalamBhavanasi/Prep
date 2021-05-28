package practice.java;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicWebTable {

	@Test
	public void example() {

		System.setProperty("webdriver.chrome.driver", "binary//chromedriver");
		ChromeDriver wd = new ChromeDriver();
		wd.manage().window().maximize();
		wd.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		wd.get("http://demo.guru99.com/test/web-table-element.php");
		// No.of Columns
		List col = wd.findElements(By.xpath("//table/thead/tr/th"));
		System.out.println("No of cols are : " + col.size());
		// No.of rows
		List rows = wd.findElements(By.xpath(".//*[@id='leftcontainer']/table/tbody/tr/td[1]"));
		System.out.println("No of rows are : " + rows.size());
		wd.close();

	}

	@Test
	public void example1() {

		System.setProperty("webdriver.chrome.driver", "binary//chromedriver");
		ChromeDriver wd = new ChromeDriver();
		wd.manage().window().maximize();
		wd.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		wd.get("http://demo.guru99.com/test/web-table-element.php");

		WebElement baseTable = wd.findElement(By.xpath("//table/tbody"));

		// To find third row of table
		// table/tbody/tr[3]

		WebElement tableRow = baseTable.findElement(By.xpath("//table/tbody/tr[3]"));
		String rowtext = tableRow.getText();
		System.out.println("Third row of table : " + rowtext);
		// to get 3rd row's 2nd column data
		WebElement cellIneed = tableRow.findElement(By.xpath("//table/tbody/tr[3]/td[2]"));
		String valueIneed = cellIneed.getText();
		System.out.println("Cell value is : " + valueIneed);
		wd.close();

	}

	@Test
	public void example2() {
		System.setProperty("webdriver.chrome.driver", "binary//chromedriver");
		ChromeDriver wd = new ChromeDriver();
		wd.manage().window().maximize();
		wd.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		wd.get("http://demo.guru99.com/test/table.html");
		WebElement mytable = wd.findElement(By.xpath("/html/body/table/tbody"));
		// To locate rows of table.
		List<WebElement> rows_table = mytable.findElements(By.tagName("tr"));
		// To calculate no of rows In table.
		int rows_count = rows_table.size();
		// Loop will execute till the last row of table.
		for (int row = 0; row < rows_count; row++) {
			// To locate columns(cells) of that specific row.
			List<WebElement> Columns_row = rows_table.get(row).findElements(By.tagName("td"));
			// To calculate no of columns (cells). In that specific row.
			int columns_count = Columns_row.size();
			System.out.println("Number of cells In Row " + row + " are " + columns_count);
			// Loop will execute till the last cell of that specific row.
			for (int column = 0; column < columns_count; column++) {
				// To retrieve text from that specific cell.
				String celtext = Columns_row.get(column).getText();
				System.out
						.println("Cell Value of row number " + row + " and column number " + column + " Is " + celtext);
			}
			System.out.println("-------------------------------------------------- ");
		}

	}

	@Test
	public void example3() {

		System.setProperty("webdriver.chrome.driver", "binary//chromedriver");
		ChromeDriver wd = new ChromeDriver();
		wd.manage().window().maximize();
		wd.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		wd.get("http://demo.guru99.com/test/web-table-element.php");

		WebElement baseTable = wd.findElement(By.xpath("//table/tbody"));

		List<WebElement> tableRow = baseTable.findElements(By.xpath("//table/tbody/tr"));
		int rowSize = tableRow.size();

		for (int i = 0; i < rowSize; i++) {

			List<WebElement> tableColumn = tableRow.get(i).findElements(By.tagName("td"));
			int columnsSize = tableColumn.size();

			for (int j = 0; j < columnsSize; j++) {

				String text = tableColumn.get(j).getText();

				System.out.println("Cell Value of row number " + i + " and column number " + j + " Is " + text);

			}

			System.out.println("-------------------------------------------------- ");

		}

	}

}
