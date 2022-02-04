package week2.day2.assessment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assessment2_EditLead {

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
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text() = 'Leads']")).click();
		driver.findElement(By.linkText("Find Leads")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//input[@name = 'firstName'])[3]")).sendKeys("megs");
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("(//a[@class = 'linktext'])[4]")).click();
		Thread.sleep(4000);
		System.out.println(driver.getTitle());
		if ((driver.getTitle()).contains("View Lead | opentaps CRM")) {
			System.out.println("Title Matched");
		} else {
			System.out.println("Title did not match");
		}
		driver.findElement(By.linkText("Edit")).click();
		Thread.sleep(2000);
		WebElement company = driver.findElement(By.xpath("//input[@id ='updateLeadForm_companyName']"));
		company.clear();
		company.sendKeys("a");
		driver.findElement(By.xpath("//input[@value='Update']")).click();
		Thread.sleep(2000);
		String comp = driver.findElement(By.xpath("(//span[@class='tabletext'])[3]")).getText();
		System.out.println(comp);
		if (comp.contains("a")) {
			System.out.println("Company name updated");
		} else {
			System.out.println("Company name not updated");
		}
		driver.close();
	}

}
