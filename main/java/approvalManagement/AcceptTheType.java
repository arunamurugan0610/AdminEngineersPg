package approvalManagement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AcceptTheType {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver .get("https://3.110.102.12/login");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//*[@id=\"details-button\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"proceed-link\"]")).click();		
		driver.findElement(By.cssSelector("#email_id")).sendKeys("admin@engineerspg.com");
		driver.findElement(By.cssSelector("#password")).sendKeys("Qwerty@123");
		driver.findElement(By.cssSelector("button[type='submit']")).click();
	
	driver.findElement(By.xpath("//a[contains(@href,'/app/approval-management')]")).click();
	driver.findElement(By.xpath("/html/body/div/div[2]/div[1]/main/div/div/div[3]/div/div/div/div[3]/table/tbody/tr[1]/td[4]/div/div/span[1]")).click();
	//driver.findElement(By.xpath("/html/body/div/div[2]/div[1]/main/div/div/div[1]/div/div/div/div/ul/div[2]/li/span")).click();
	boolean approvedType = driver.findElement(By.xpath("//div[contains(text(),'first rent')]")).getText().contains("First Rent");
	if(approvedType){
		System.out.println("Approved Passed");
	}else{
		System.out.println("Approved Failed");
	}
	
	driver.close();
	
	}

}
