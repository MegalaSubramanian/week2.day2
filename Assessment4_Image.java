package week2.day2.assessment;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assessment4_Image {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.leafground.com/pages/Image.html");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//img[@src='../images/home.png']")).click();
		String homepage = driver.getTitle();
		System.out.println(homepage);		
		if(homepage.contains("TestLeaf - Selenium Playground")) {
			System.out.println("Homepage is displayed");
		}else {
			System.out.println("Homepage is not displayed");
		}
		driver.navigate().back();
		WebElement brokenimage = driver.findElement(By.xpath("//img[@src='../images/abcd.jpg']"));
		String attribute = brokenimage.getAttribute("src");
		driver.get(attribute);
		//driver.navigate().to(attribute);(this code also works)
		String title = driver.getTitle();	
		if(title.contains("404")) {
			System.out.println("Image is broken");
		}else {
			System.out.println("Image is not broken");
		}
		driver.navigate().back();
		driver.findElement(By.xpath("//img[@src='../images/keyboard.png']")).click();		
		driver.navigate().back();
	}

}
