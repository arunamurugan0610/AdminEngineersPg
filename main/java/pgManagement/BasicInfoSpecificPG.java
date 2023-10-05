package pgManagement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BasicInfoSpecificPG {

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
	
	 driver.findElement(By.xpath("//div[contains(text(),'BoyS PG')]")).click();
	//boolean image1= driver.findElement(By.xpath("//div[@class='swiper-slide swiper-slide-active card']//img[@alt='_photo']")).getAttribute("src").contains("https://d2v4bybytnkmx7.cloudfront.net/pg-images/202309271157550");
//	boolean image2=  driver.findElement(By.xpath("/html/body/div/div[2]/div[1]/main/div/div[2]/section[1]/figure/img")).getAttribute("src").contains("https://d2v4bybytnkmx7.cloudfront.net/pg-images/202309271157551");
	boolean managerName = driver.findElement(By.xpath("//span[normalize-space()='Aruna']")).getText().contains("Aruna");
	boolean phoneNo = driver.findElement(By.xpath("//a[normalize-space()='9876543212']")).getText().contains("9876543212");
	boolean roomsAvailable = driver.findElement(By.xpath("//body[1]/div[1]/div[2]/div[1]/main[1]/div[2]/section[1]/div[1]/div[1]/table[1]/tbody[1]/tr[3]/td[3]")).getText().contains("2/0/0/0");
	boolean total = driver.findElement(By.xpath("//td[normalize-space()='0 / 2']")).getText().contains("0 / 2");
	WebElement amenities=   driver.findElement(By.xpath("/html/body/div/div[2]/div[1]/main/div[2]/section[1]/div/div/table/tbody/tr[5]/td[3]"));
    boolean amenities1=amenities.getText().contains("WIFI");
    boolean amenities2=amenities .getText().contains("refrigerator");
	boolean noOfEmployee = driver.findElement(By.xpath("//td[contains(text(),'2')]")).getText().contains("2");
	boolean ebPerUnit = driver.findElement(By.xpath("/html/body/div/div[2]/div[1]/main/div[2]/section[1]/div/div/table/tbody/tr[7]/td[3]")).getText().contains("400");
	boolean address = driver.findElement(By.xpath("//td[@class='pl-1 text-ellipsis overflow-hidden']")).getText().contains("Address");
	boolean description = driver.findElement(By.xpath("//p[normalize-space()='Description']")).getText().contains("Description");
	boolean TermsCondition = driver.findElement(By.xpath("//p[normalize-space()='Terms & conditions']")).getText().contains("Terms & conditions");
	
//	if(image1){
//		System.out.println("Basic Info profile picture passed");
//	}if(image2){
//		System.out.println("Basic Info profile picture passed");
//	}
	if(managerName){
		System.out.println("Basic Info phoneNo passed");
	}if(phoneNo){
		System.out.println("Basic Info profile picture passed");
	}if(roomsAvailable){
		System.out.println("Basic Info roomsAvailable passed");
	}if(total){
		System.out.println("Basic Info total passed");
	}if(amenities1){
		System.out.println("Basic Info amenities1 passed");
	}if(amenities2){
		System.out.println("Basic Info amenities2 passed");
	}if(noOfEmployee){
		System.out.println("Basic Info noOfEmployee passed");
	}if(address){
		System.out.println("Basic Info address passed");
	}if(description){
		System.out.println("Basic Info description passed");
	}if(TermsCondition){
		System.out.println("Basic Info TermsCondition passed");
	}if(ebPerUnit){
		System.out.println("Basic Info ebPerUnit passed");
	}else{
		System.out.println("No basic info failed");
	}
	
	driver.close();
	
	}

}

