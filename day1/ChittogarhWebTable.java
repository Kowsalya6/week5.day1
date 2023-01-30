package week5.day1;

import java.time.Duration;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChittogarhWebTable1 {

	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.chittorgarh.com/");
		driver.findElement(By.xpath("//a[@id='navbtn_stockmarket']")).click();
		driver.findElement(By.xpath("(//a[text()='NSE Bulk Deals'])[1]")).click();
		List<WebElement> names = driver.findElements(By.xpath("//table[@class='table table-bordered table-condensed table-striped']//tr"));
		
		List<String> lst = new ArrayList<String>();
		
		for (int i = 1; i < names.size(); i++) {
			
			String text = driver.findElement(By.xpath("//table[@class='table table-bordered table-condensed table-striped']//tr["+i+"]//td[3]")).getText();
			
			lst.add(text);
			
			System.out.println(text);
			
		}
		
		int listSize = lst.size();
		
		System.out.println("Size of List " +listSize);
		
		Set<String> set = new LinkedHashSet<String>(lst);
		
		int setSize = set.size();
		
		System.out.println(setSize);
		
		if (listSize!=setSize) {
			
			System.out.println("There is No Duplicates");
			
		}
		
		else {
			
			System.out.println("There is Duplicatess");
		}
		

	}

}
 
