package pgManagementIncomeExpense;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class EditIncomeAndExpense {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver .get("http://192.168.1.2:3000/");
		driver.manage().window().maximize();
//         driver.findElement(By.xpath("//*[@id=\"details-button\"]")).click();
//         driver.findElement(By.xpath("//*[@id=\"proceed-link\"]")).click();
		 driver.findElement(By.cssSelector("#email_id")).sendKeys("admin@engineerspg.com");
		 driver.findElement(By.cssSelector("#password")).sendKeys("Qwerty@123");
		 driver.findElement(By.cssSelector("button[type='submit']")).click();
         driver.findElement(By.xpath("//a[contains(@href,'/app/pg-list')]")).click();
         driver.findElement(By.xpath("//div[contains(text(),'BoyS PG')]")).click();
         driver.findElement(By.xpath("/html/body/div/div[2]/div[1]/main/div/div[1]/div/div/div[9]")).click();
		 driver.findElement(By.xpath("/html/body/div/div[2]/div[1]/main/div/div[2]/section[2]/div/div/div[2]/div/div[3]/table/tbody/tr[1]/td[7]/div/div/div")).click();
		boolean editPage = driver.findElement(By.xpath("/html/body/div/div[4]/div/h3")).getText().contains("Edit List");
		if(editPage){
			System.out.println("Edit list page - Passed");
		}else{
			System.out.println("Edit list page - Failed");
		}
		
		WebElement updateFor=driver.findElement(By.xpath("/html/body/div/div[4]/div/form/div[3]/div/div/input"));
		updateFor.sendKeys(Keys.CONTROL+"a");
		updateFor.sendKeys(Keys.DELETE);
		updateFor.sendKeys("Advance");		
		driver.findElement(By.xpath("//button[normalize-space()='Save']")).click();		
		boolean updateIncome = driver.findElement(By.xpath("/html/body/div/div[2]/div[1]/main/div/div[2]/section[2]/div/div/div[2]/div/div[3]/table/tbody/tr[1]/td[5]/div")).getAttribute("value").contains("Advance");
		if(updateIncome){
			System.out.println("Updated IE - Passed");
		}else{
			System.out.println("Updated IE - FAiled");
		}
	}

}
