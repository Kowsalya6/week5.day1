package week5.day1;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PrintValuesinTable {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://html.com/tags/table/");
		driver.findElement(By.xpath("//caption[text()='The Three Most Popular JavaScript Libraries']/parent::table"));
		List<WebElement> values = driver.findElements(By.xpath("//caption[text()='The Three Most Popular JavaScript Libraries']/parent::table//tr[2]/td"));
		for (int i = 0; i < values.size(); i++) {
			System.out.println(values.get(i).getText());
		}
	}

}


/*1. Launch the URL https://html.com/tags/table/
2. You have to print the respective values based on given Library
(hint: if the library was absolute usage, then print all its value)*/