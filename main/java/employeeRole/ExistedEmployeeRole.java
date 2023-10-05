package employeeRole;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ExistedEmployeeRole {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		 driver .get("https://3.110.102.12/login");
         driver.findElement(By.xpath("//*[@id=\"details-button\"]")).click();
         driver.findElement(By.xpath("//*[@id=\"proceed-link\"]")).click();
  		 driver.findElement(By.cssSelector("#email_id")).sendKeys("admin@engineerspg.com");
		 driver.findElement(By.cssSelector("#password")).sendKeys("Qwerty@123");
		 driver.findElement(By.cssSelector("button[type='submit']")).click();
		 driver.findElement(By.xpath("//li[3]//div[1]//div[1]//*[name()='svg']//*[name()='path' and contains(@fill-rule,'evenodd')]")).click();
		 driver.findElement(By.xpath("//a[normalize-space()='Employee Role']")).click();
		 try{
		WebElement element= driver.findElement(By.xpath("//button[normalize-space()='Add Employee Role']"));
		element.click();
		 }catch (StaleElementReferenceException e) {
			    WebElement newElement = driver.findElement(By.xpath("//button[normalize-space()='Add Employee Role']"));
			    newElement.click();
		 }	 
		 driver.findElement(By.xpath("//input[@placeholder='Enter role title']")).sendKeys("Sub Manager");
		 driver.findElement(By.xpath("//div//div//div//div//div//div//div[2]//div[1]//div[1]//div[1]//label[1]//input[1]")).click();
		 driver.findElement(By.xpath("//button[normalize-space()='Create']")).click();
		 driver.findElement(By.xpath("/html/body/div/div[2]/div[1]/main/div[1]/div[3]/div/div[2]/div/div[3]/table/tbody/tr[1]/td[3]/div/div/span[1]")).click();
		
		 boolean roleName = driver.findElement(By.xpath("//input[@placeholder='Enter role title']")).getAttribute("value").contains("Sub Manager");
		 boolean pageAccess =   driver.findElement(By.xpath("//div//div//div//div//div//div//div[2]//div[1]//div[1]//div[1]//label[1]//input[1]")).getAttribute("value").contains("true");
		if (roleName){
			System.out.println("Existed role title present");
		}if(pageAccess){
			System.out.println("Existed checkbox clicked present");
		}else{
			System.out.println("No existed data");
		}
	driver.close();
	}

}
