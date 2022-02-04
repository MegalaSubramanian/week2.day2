package week2.day2.assessment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assessment2_CreateContact {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		driver.findElement(By.id("username")).sendKeys("Democsr");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		// Thread.sleep(2000);
		driver.findElement(By.linkText("Contacts")).click();
		driver.findElement(By.linkText("Create Contact")).click();
		driver.findElement(By.id("firstNameField")).sendKeys("Test");
		driver.findElement(By.id("lastNameField")).sendKeys("Leaf");
		driver.findElement(By.id("createContactForm_firstNameLocal")).sendKeys("Batch");
		driver.findElement(By.id("createContactForm_lastNameLocal")).sendKeys("six");
		driver.findElement(By.name("departmentName")).sendKeys("Teaching");
		driver.findElement(By.name("description")).sendKeys("Teaching Selenium Automation Testing");
		driver.findElement(By.id("createContactForm_primaryEmail")).sendKeys("Test@testleaf.com");
		Select state = new Select(driver.findElement(By.name("generalStateProvinceGeoId")));
		state.selectByVisibleText("New York");
		driver.findElement(By.className("smallSubmit")).click();
		driver.findElement(By.linkText("Edit")).click();
		driver.findElement(By.name("description")).clear();
		driver.findElement(By.name("importantNote")).sendKeys("Testing Notes");
		driver.findElement(By.xpath("//input[@class='smallSubmit']")).click();
		System.out.println(driver.getTitle());
	}

}
