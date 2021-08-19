package week2Day1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class facebookworkout {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         WebDriverManager.chromedriver().setup();
         ChromeDriver driver=new ChromeDriver();
         driver.get("https://en-gb.facebook.com/");
         driver.manage().window().maximize();
         driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
         driver.findElement(By.linkText("Create New Account")).click();
         driver.findElement(By.name("firstname")).sendKeys("Sabarish");
         driver.findElement(By.name("lastname")).sendKeys("Pattabiraman");
         driver.findElement(By.name("reg_email__")).sendKeys("sabarish90ragavendra@gmail.com");
         driver.findElement(By.name("reg_passwd__")).sendKeys("Sab123");
         WebElement birthday = driver.findElement(By.name("birthday_day"));
         Select drp1=new Select(birthday);
         drp1.selectByValue("1");
         WebElement birthday2 = driver.findElement(By.id("month"));
         Select drp2=new Select(birthday2);
         drp2.selectByIndex(0);
         WebElement birthday3 = driver.findElement(By.id("year"));
         Select drp3=new Select(birthday3);
         drp3.selectByVisibleText("1992");
         driver.findElement(By.className("_8esa")).click();
         driver.findElement(By.name("websubmit")).clear();
         
         
         
	}

}
