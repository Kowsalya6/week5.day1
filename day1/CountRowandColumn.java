package week5.day1;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CountRowandColumn {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://html.com/tags/table/");
		List<WebElement> columncount = driver.findElements(By.xpath("//table[@class='attributes-list']//th"));
		System.out.println(columncount.size());
		List<WebElement> rowcount = driver.findElements(By.xpath("//table[@class='attributes-list']//tr/td[1]"));
		System.out.println(rowcount.size());
	}

}


/*1. Launch the URL https://html.com/tags/table/
2. Get the count of number of rows
3. Get the count of number of columns
*/