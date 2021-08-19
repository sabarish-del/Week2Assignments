package week2Day1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Salesforce {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get(" https://www.salesforce.com/in/form/signup/freetrial-sales/?d=70130000000Enyk");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);
		driver.findElement(By.name("UserFirstName")).sendKeys("Test");
		driver.findElement(By.name("UserLastName")).sendKeys("Leaf");
		driver.findElement(By.name("UserEmail")).sendKeys("TestLeaf@gmail.com");
		driver.findElement(By.name("CompanyName")).sendKeys("TestLeaf");
		driver.findElement(By.name("UserPhone")).sendKeys("9487151573");
		
		WebElement drpDown2 = driver.findElement(By.name("UserTitle"));
		Select drpDow2 = new Select(drpDown2);
		drpDow2.selectByValue("Customer_Service_Manager_AP");

		WebElement drpDown3 = driver.findElement(By.name("CompanyEmployees"));
		Select drpDow3 = new Select(drpDown3);
		drpDow3.selectByIndex(3);

		WebElement drpDown4 = driver.findElement(By.name("CompanyCountry"));
		Select drpDow4 = new Select(drpDown4);
		drpDow4.selectByVisibleText("Argentina");
		
		driver.findElement(By.className("checkbox-ui")).click();
		driver.close();

	}

}
