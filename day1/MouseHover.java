package week5.day1;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHover {
		public static void main(String[] args) throws IOException {
			ChromeDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			driver.get("https://www.leafground.com/menu.xhtml");
			 driver.findElement(By.xpath("(//span[text()='Customers'])[1]")).click();
			WebElement customer = driver.findElement(By.xpath("(//a[@role='menuitem'])[2]"));
			customer.click();
			Actions action = new Actions(driver);
			action.moveToElement(customer).perform();
			File source = driver.getScreenshotAs(OutputType.FILE);
			File dest = new File("snap/drag.png");
			FileUtils.copyFile(source, dest);
			WebElement orders = driver.findElement(By.xpath("(//span[text()='Orders'])[1]"));
			action.moveToElement(orders).perform();
			WebElement Shipments = driver.findElement(By.xpath("(//span[text()='Shipments'])[1]"));
			action.moveToElement(Shipments).perform();
			WebElement Profile = driver.findElement(By.xpath("(//span[text()='Profile'])[1]"));
			action.moveToElement(Profile).perform();

			}
}
