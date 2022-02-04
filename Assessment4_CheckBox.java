package week2.day2.assessment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assessment4_CheckBox {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://www.leafground.com/pages/checkbox.html");
		driver.manage().window().maximize();
//WebElement java = driver.findElement(By.xpath("(//label[text()='Select the languages that you know?']/following::input)[1]"));
//java.click();
driver.findElement(By.xpath("(//input[@type ='checkbox'])[1]")).click();		
driver.findElement(By.xpath("(//input[@type ='checkbox'])[4]")).click();
System.out.println(driver.findElement(By.xpath("(//input[@type ='checkbox'])[6]")).isSelected());
driver.findElement(By.xpath("(//input[@type ='checkbox'])[8]")).click();
driver.findElement(By.xpath("(//input[@type ='checkbox'])[9]")).click();
driver.findElement(By.xpath("(//input[@type ='checkbox'])[10]")).click();
driver.findElement(By.xpath("(//input[@type ='checkbox'])[11]")).click();
driver.findElement(By.xpath("(//input[@type ='checkbox'])[12]")).click();
driver.findElement(By.xpath("(//input[@type ='checkbox'])[13]")).click();

	}

}
