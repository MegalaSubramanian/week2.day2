package week2.day2.assessment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assessment1_FacebookSignUp {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://en-gb.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		driver.findElement(By.xpath("(//a[@role='button'])[2]")).click();
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Test");
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Leaf");
		driver.findElement(By.xpath("//input[@name='lastname']/following::input")).sendKeys("9863457852");
		driver.findElement(By.xpath("//div[contains(text() , 'password')]/following::input")).sendKeys("selenium");
		Select date = new Select(driver.findElement(By.id("day")));
		date.selectByValue("3");
		Select month = new Select(driver.findElement(By.id("month")));
		month.selectByValue("9");
		Select year = new Select(driver.findElement(By.id("year")));
		year.selectByValue("1993");
		driver.findElement(By.xpath("//label[text()='Female']")).click();

	}

}
