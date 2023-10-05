package employeeRole;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DeleteEmployee {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver .get("https://3.110.102.12/login");
         driver.findElement(By.xpath("//*[@id=\"details-button\"]")).click();
         driver.findElement(By.xpath("//*[@id=\"proceed-link\"]")).click();
		 driver.findElement(By.cssSelector("#email_id")).sendKeys("admin@engineerspg.com");
		 driver.findElement(By.cssSelector("#password")).sendKeys("Qwerty@123");
		 driver.findElement(By.cssSelector("button[type='submit']")).click();
		 driver.findElement(By.xpath("//li[3]//div[1]//div[1]//*[name()='svg']//*[name()='path' and contains(@fill-rule,'evenodd')]")).click();
			driver.findElement(By.cssSelector("a[href='/app/employee-role']")).click();
			try{
				driver.findElement(By.xpath("//button[normalize-space()='Add Employee Role']")).click();
			}catch(StaleElementReferenceException e){
				driver.findElement(By.xpath("//button[normalize-space()='Add Employee Role']")).click();
			}
			driver.findElement(By.xpath("//input[@placeholder='Enter role title']")).sendKeys("Sub Manager");
		 driver.findElement(By.xpath("//body[1]/div[1]/div[2]/div[1]/main[1]/div[1]/div[3]/div[2]/div[1]/div[1]/div[1]/div[1]/label[1]/input[1]")).click();
		driver.findElement(By.xpath("//button[normalize-space()='Create']")).click();		
		driver.findElement(By.xpath("/html/body/div/div[2]/div[1]/main/div[1]/div[3]/div/div[2]/div/div[3]/table/tbody/tr[1]/td[3]/div/div/span[2]/html/body/div/div[2]/div[1]/main/div[1]/div[3]/div/div[2]/div/div[3]/table/tbody/tr[1]/td[3]/div/div/span[2]")).click();
//		driver.findElement(By.xpath("//button[normalize-space()='Cancel']")).click();
//		driver.findElement(By.xpath("/html/body/div/div[2]/div[1]/main/div[1]/div[3]/div/div[2]/div/div[3]/table/tbody/tr[1]/td[3]/div/div/span[2]")).click();
    	driver.findElement(By.id("btn-yes-1")).click();
			WebElement title = driver.findElement(By.xpath("//div[contains(text(),'Sub Manager')]"));
		
		if(title.isDisplayed()){
			System.out.println("Employee Role was not deleted - Failed");
		}else{
			System.out.println("Employee Role is not deleted - Passed");
		}

			
		driver.close();
		
	}

}
