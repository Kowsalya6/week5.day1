package week5.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Drag {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.leafground.com/drag.xhtml");
		Actions action = new Actions(driver);
		WebElement source = driver.findElement(By.xpath("//p[text()='Drag to target']"));
		WebElement dest = driver.findElement(By.xpath("//span[text()='Droppable Target']"));
		action.dragAndDrop(source, dest).perform();
		String cssValue = driver.findElement(By.id("form:drop_header")).getCssValue("color");
		System.out.println(cssValue);

	}

}
