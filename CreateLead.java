package week2Day1;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import io.github.bonigarcia.wdm.WebDriverManager;
public class CreateLead {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		//Launch the chrome browser
		ChromeDriver driver=new ChromeDriver();
		//Load url
		driver.get("http://leaftaps.com/opentaps/control/main");
		//To print the title
		String title = driver.getTitle();
		System.out.println(title);
		//maximize the browser
		driver.manage().window().maximize();
		//driver.close();
		//Wait time
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		//Step5 : Locate the username and enter the demosalesmanager
		WebElement findElement = driver.findElement(By.id("username"));
		findElement.sendKeys("demosalesmanager");
		//Step5 : Locate the Password(Weblelement) and enter the demosalesmanager
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		//driver.findElement(By.partialLinkText("CRM")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("SG");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("sabarish");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("pattabiraman");
		WebElement ph = driver.findElement(By.id("createLeadForm_primaryPhoneCountryCode"));
		ph.clear();
		ph.sendKeys("9488987718");
		WebElement source = driver.findElement(By.id("createLeadForm_dataSourceId"));
		Select se=new Select(source);
		se.selectByIndex(1);
		WebElement source2 = driver.findElement(By.id("createLeadForm_marketingCampaignId"));
		Select se2= new Select(source2);
		se2.selectByValue("CATRQ_AUTOMOBILE");
		WebElement ind = driver.findElement(By.id("createLeadForm_industryEnumId"));
		Select se3=new Select(ind);
		se3.selectByVisibleText("Telecommunications");
		WebElement drpDown2 = driver.findElement(By.id("createLeadForm_currencyUomId"));
		Select drpDow2 = new Select(drpDown2);
		drpDow2.selectByValue("DZD");
		String text = driver.findElement(By.id("createLeadForm_firstName")).getAttribute("value");

		System.out.println("First Name : " + text);

		driver.findElement(By.className("smallSubmit")).click();


		String title1 = driver.getTitle();
		String title2 = "View Lead | opentaps CRM";
		if(title1.equals(title2))
		{
			
			System.out.println("Title Matches and title is : "+ title);
		}
		else
		{
			
			System.out.println("Tiltle mismatch and title is : "+ title);
		}
		
		
	}

}
