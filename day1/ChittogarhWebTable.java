package week5.day1;

import java.time.Duration;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChittogarhWebTable {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.chittorgarh.com/");
		driver.findElement(By.xpath("//a[@id='navbtn_stockmarket']")).click();
		driver.findElement(By.xpath("(//a[text()='NSE Bulk Deals'])[1]")).click();
		List<WebElement> names = driver.findElements(By.xpath("//table[@class='table table-bordered table-condensed table-striped']//tr/td[3]"));
		for (int i = 0; i < names.size(); i++) {
			System.out.println(names.get(i).getText());
		}
		System.out.println(names.size());
		Set<WebElement> st = new LinkedHashSet<WebElement>(names);
		System.out.println(st.size());
		if(names.size()==st.size())
		{
			System.out.println("No Duplicates");
		}
		else
		{
			System.out.println("Duplicates");
		}
		//column count
		List<WebElement> findElements2 = driver.findElements(By.xpath("//table[@class='table table-bordered table-condensed table-striped']//th"));
		System.out.println(findElements2.size());
	}

}

/*Launch the URL https://www.chittorgarh.com/
2. Click on stock market
3. Click on NSE bulk Deals
4. Get all the Security names
5. Ensure whether there are duplicate Security names*/