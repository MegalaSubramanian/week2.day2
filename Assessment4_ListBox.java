package week2.day2.assessment;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assessment4_ListBox {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://www.leafground.com/pages/Dropdown.html");
		driver.manage().window().maximize();
		Select dropdown1 = new Select(driver.findElement(By.id("dropdown1")));
		dropdown1.selectByIndex(1);
		Select dropdown2 = new Select(driver.findElement(By.name("dropdown2")));
		dropdown2.selectByVisibleText("Selenium");
		Select dropdown3 = new Select(driver.findElement(By.id("dropdown3")));
		dropdown3.selectByValue("1");
		Select dropdown = new Select(driver.findElement(By.className("dropdown")));
		List<WebElement> options = dropdown.getOptions();
		System.out.println(options.size());
		WebElement sendKey = driver.findElement(By.xpath("((//div[@class='example'])[5])/select"));
		sendKey.sendKeys("Selenium");
		Select multiple = new Select(driver.findElement(By.xpath("((//div[@class='example'])[6])/select")));
		multiple.selectByIndex(1);

	}

}
