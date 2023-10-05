package pgManagementSpecificPG;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class EmployeeListingInSpecificPG {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver .get("https://3.110.102.12/login");
         driver.findElement(By.xpath("//*[@id=\"details-button\"]")).click();
         driver.findElement(By.xpath("//*[@id=\"proceed-link\"]")).click();
		 driver.findElement(By.cssSelector("#email_id")).sendKeys("admin@engineerspg.com");
		 driver.findElement(By.cssSelector("#password")).sendKeys("Qwerty@123");
		 driver.findElement(By.cssSelector("button[type='submit']")).click();
         driver.findElement(By.xpath("//a[contains(@href,'/app/pg-list')]")).click();
	     driver.findElement(By.xpath("//div[contains(text(),'Boys PG')]")).click();
	
	 boolean Employeename = driver.findElement(By.xpath("/html/body/div/div[2]/div[1]/main/div/div[2]/section[2]/div/div/div/div[3]/table/tbody/tr[1]/td[2]/div/a")).getText().contains("Michael antony");
	 boolean employeeDesignation = driver.findElement(By.xpath("//div[normalize-space()='Staff']")).getText().contains("Staff");
	boolean employeeLogin = driver.findElement(By.xpath("/html/body/div/div[2]/div[1]/main/div/div[2]/section[2]/div/div/div/div[3]/table/tbody/tr[1]/td[4]/div/div")).getText().contains("05/10/2023"); 
	boolean phoneNumber = driver.findElement(By.xpath("/html/body/div/div[2]/div[1]/main/div/div[2]/section[2]/div/div/div/div[3]/table/tbody/tr[1]/td[5]/div/div/a")).getAttribute("href").contains("tel:+919500411626");
	 
	if(Employeename){
		System.out.println("employee name Listing Passed");
	}if(employeeDesignation){
		System.out.println("Employee Designation Listing Passed");
	}if(employeeLogin){
		System.out.println("employee Login Listing Passed");
	}if(phoneNumber){
		System.out.println("phone Number Listing Passed");
	}else{
		System.out.println("Employee Listing Failed in Specific PG");
	}
	 
	driver.close();
	}

}
