package pgManagementIncomeExpense;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class ValidData {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver .get("http://192.168.1.12:3000/");
		driver.manage().window().maximize();
//         driver.findElement(By.xpath("//*[@id=\"details-button\"]")).click();
//         driver.findElement(By.xpath("//*[@id=\"proceed-link\"]")).click();
		 driver.findElement(By.cssSelector("#email_id")).sendKeys("admin@engineerspg.com");
		 driver.findElement(By.cssSelector("#password")).sendKeys("Qwerty@123");
    	 driver.findElement(By.cssSelector("button[type='submit']")).click();
        driver.findElement(By.xpath("//a[contains(@href,'/app/pg-list')]")).click();
        driver.findElement(By.xpath("//div[contains(text(),'BoyS PG')]")).click();
		driver.findElement(By.xpath("/html/body/div/div[2]/div[1]/main/div/div[1]/div/div/div[9]")).click();
		driver.findElement(By.xpath("//button[normalize-space()='Add New']")).click();
		driver.findElement(By.xpath("/html/body/div/div[4]/div/form/div[1]/div/div")).click(); 
		driver.findElement(By.xpath("//li[contains(text(),'Income')]")).click();
		driver.findElement(By.xpath("/html/body/div/div[4]/div/form/div[2]/div/div/input")).sendKeys("Rent");
		driver.findElement(By.name("price")).sendKeys("400000");
		driver.findElement(By.name("invoiceNumber")).sendKeys("4001");
		driver.findElement(By.xpath("/html/body/div/div[4]/div/form/div[6]/div/div/div[4]/div[1]")).sendKeys("Description");
		driver.findElement(By.xpath("/html/body/div/div[4]/div/form/div[3]/div")).click();
		WebElement IEType =driver.findElement(By.xpath("/html/body/div/div[4]/div/form/div[3]/div/div[1]/div[2]/input"));
		IEType.sendKeys("first rent");
		IEType.sendKeys(Keys.ENTER);
		driver.findElement(By.xpath("//button[normalize-space()='Save']")).click();
	boolean IE = driver.findElement(By.xpath("//div[normalize-space()='4001']")).getText().contains("4001");
			if(IE){
			System.out.println("IE created - Passed");
		}else{
			System.out.println("IE not created - Failed");
		}
		driver.close();
		
	}

}
