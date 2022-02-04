package week2.day2.assessment;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assessment4_Edit {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://www.leafground.com/pages/Edit.html");
		driver.manage().window().maximize();
		driver.findElement(By.id("email")).sendKeys("megala@gmail.com");
		WebElement append = driver.findElement(By.xpath("(//input[@type = 'text'])[2]"));
		append.clear();
		append.sendKeys("done");
		System.out.println("The newly appended value is"+ append.getAttribute("value"));
		append.sendKeys(Keys.TAB);
		System.out.println(
				"The value is" + driver.findElement(By.xpath("(//input[@type = 'text'])[3]")).getAttribute("value"));
		WebElement clean = driver.findElement(By.xpath("//input[@value = 'Clear me!!']"));
		clean.clear();
		System.out.println(driver.findElement(By.xpath("(//input[@type = 'text'])[5]")).isEnabled());
	}

}
