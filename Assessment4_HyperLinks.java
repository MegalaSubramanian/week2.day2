package week2.day2.assessment;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assessment4_HyperLinks {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://www.leafground.com/pages/Link.html");
		driver.manage().window().maximize();
		WebElement home1 = driver.findElement(By.xpath("(//a[@link ='blue'])[1]"));
		home1.click();
		String value1 = driver.getTitle();
		driver.navigate().back();	
		System.out.println(driver.findElement(By.xpath("(//a[@link ='blue'])[2]")).getAttribute("href"));
		driver.findElement(By.xpath("//a[text() ='Verify am I broken?']")).click();
		WebElement status = driver.findElement(By.xpath("//h1[text() = 'HTTP Status 404 – Not Found']"));
		if((status.getText()).equals("HTTP Status 404 – Not Found")) {
			System.out.println(status.getText());
		}else {
			System.out.println("Page is not broken");
		}
		driver.navigate().back();
		WebElement home2 = driver.findElement(By.xpath("(//a[text() = 'Go to Home Page'])[2]"));
		home2.click();
		String value2 = driver.getTitle();
		if(value1.equals(value2)) {
			
			System.out.println(" Home2 interact with same link name  ");
		}
		driver.navigate().back();
		List<WebElement> linkList = driver.findElements(By.tagName("a"));	
		System.out.println(linkList.size());

	}

}
