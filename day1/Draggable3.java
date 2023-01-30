package week5.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Draggable3 {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.leafground.com/drag.xhtml");
		WebElement drag = driver.findElement(By.xpath("(//div[@class='ui-panel-content ui-widget-content'])[1]"));
		System.out.println(drag.getLocation());
		Actions builder = new Actions(driver);
		builder.dragAndDropBy(drag, 99,200).perform();
		System.out.println(drag.getLocation());

	}

}
