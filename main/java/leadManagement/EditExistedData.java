package leadManagement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class EditExistedData {

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
		driver.findElement(By.xpath("/html/body/div/div[2]/div[2]/ul/li[7]/a")).click();
	   driver.findElement(By.xpath("//span[normalize-space()='Lead Information']")).click();

	 driver.findElement(By.xpath("/html/body/div/div[2]/div[1]/main/div[1]/div[3]/div/div[2]/div/div[3]/table/tbody/tr[1]/td[7]/div/div/div")).click();
	 boolean name = driver.findElement(By.name("name")).getAttribute("value").contains("Aruna");
	boolean title =	driver.findElement(By.name("tittle")).getAttribute("value").contains("regarding PG");
		boolean description = driver.findElement(By.xpath("/html/body/div/div[4]/div/form/div[3]/div/div/div[4]/div[1]")).getText().contains("Checking");
	boolean phoneNo = 	driver.findElement(By.name("phoneNo")).getAttribute("value").contains("9876543211");
	boolean address =	driver.findElement(By.name("address")).getText().contains("20\3 5 th Street Dr subharaya nagar kodambakkam");
	boolean referedby =	driver.findElement(By.name("referedBy")).getAttribute("value").contains("Aruna");
	boolean leadtype	=driver.findElement(By.xpath("/html/body/div/div[4]/div/form/div[7]/div/div")).getText().contains("online");
	boolean pGType	=driver.findElement(By.xpath("/html/body/div[1]/div[4]/div/form/div[8]/div/div")).getText().contains("BoyS PG");
	if(name){
		System.out.println("Name existed - Passed");
	}if(title){
		System.out.println("title existed - Passed");
	}if(description){
		System.out.println("description existed - Passed");
	}if(phoneNo){
		System.out.println("phoneNo existed - Passed");
	}if(address){
		System.out.println("address existed- Passed");
	}if(referedby){
		System.out.println("address existed - Passed");
	}if(pGType){
		System.out.println("selectPG existed - Passed");
	}if(leadtype){
		System.out.println("leadType existed - Passed");
	}else{
		System.out.println("No existed - Failed");
	}
	
	driver.close();
	
	
	
	
	
	}

}
