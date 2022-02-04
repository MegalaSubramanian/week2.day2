package week2.day2.assessment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assessment2_DuplicateLead {

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
		driver.findElement(By.xpath("//a[@href='/crmsfa/control/leadsMain']")).click();
		driver.findElement(By.linkText("Find Leads")).click();
		driver.findElement(By.linkText("Email")).click();
		driver.findElement(By.name("emailAddress")).sendKeys("megala@gmail.com");
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		Thread.sleep(4000);
		String leadID = driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']//a[1]"))
				.getText();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']//a[1]")).click();
		driver.findElement(By.xpath("//a[text() = 'Duplicate Lead']")).click();
		Thread.sleep(4000);
		String title = driver.getTitle();
		System.out.println(title);
		if (title.contains("Duplicate Lead | opentaps CRM")) {
			System.out.println("Title Matched");
		} else {
			System.out.println("Title did not match");
		}
		driver.findElement(By.xpath("//input[@value='Create Lead']")).click();
		Thread.sleep(2000);
		String firstName = driver.findElement(By.xpath("//span[@id='viewLead_firstName_sp']")).getText();
		String lastName = driver.findElement(By.xpath("//span[@id='viewLead_lastName_sp']")).getText();
		System.out.println(firstName + lastName);
		if ((firstName + lastName).equals("dd")) {
			System.out.println("Name matched");
		} else {
			System.out.println("Name did not match");
		}
		driver.close();
	}

}
