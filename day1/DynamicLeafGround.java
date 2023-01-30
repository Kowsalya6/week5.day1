package week5.day1;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicLeafGround {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://leafground.com/table.xhtml");
		List<WebElement> rowcount = driver.findElements(By.xpath("(//table[@role='grid'])[2]//tr/td[3]"));
		System.out.println(rowcount.size());
		for (int i = 1; i < rowcount.size(); i++) {
			String text = driver.findElement(By.xpath("(//table[@role='grid'])[2]//tr["+i+"]/td[3]")).getText();
			System.out.println(text);
		}
		
	}

}
