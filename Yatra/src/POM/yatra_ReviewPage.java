package POM;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class yatra_ReviewPage 
{
	
	WebDriver driver; 
	public yatra_ReviewPage(WebDriver driver) 
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	
	
	@FindBy(xpath=".//*[@id='review-dom']/div[1]/div/div[1]/div[3]/article/div[2]/div/div[1]/h3")
	WebElement departTime;
	
	@FindBy(xpath=".//*[@id='review-dom']/div[1]/div/div[1]/div[3]/article/div[2]/div/div[2]/h3")
	WebElement arriveTime;
	
	@FindBy(xpath=".//*[@id='checkoutBase']/div[2]/main/div/div/form/div[3]/button")
	WebElement continueBtn;
	
	public String departTime()
	{
		String time1=departTime.getText();
		return time1.substring(6,11);
		
	}

	public String arriveTime()
	{
	String time2=arriveTime.getText();
	return time2.substring(6, 11);
	}

	/*public String departTme_SearchPage()
	{
		yatra_SearchPage ob1= new yatra_SearchPage(driver);
		System.out.println("inside departTme_SearchPage method");
		System.out.println(ob1.getDeparture());
		return ob1.getDeparture();
	}*/
	
	public void verifyFlightDetail()
	{
		System.out.println("Entering....Verify Flight Detail Method");
		
		driver.manage().timeouts().pageLoadTimeout(8, TimeUnit.SECONDS);
		WebDriverWait wait = new WebDriverWait(driver,10);
		
		wait.until(ExpectedConditions.visibilityOf(departTime));
		/*System.out.println("Review page time "+this.departTime());
		System.out.println("Search page time "+this.departTme_SearchPage());*/
		
		
		Assert.assertEquals(this.departTime(),"23:05", "Departure Time Verification Failed");
		System.out.println("Depart Time Verified");
		Assert.assertEquals(this.arriveTime(),"00:15", "Arrival Time Verification Failed");
		System.out.println("Arrival Time Verified");
		
		WebDriverWait wait1 = new WebDriverWait(driver,10);
		wait.until(ExpectedConditions.elementToBeClickable(continueBtn));
		continueBtn.click();
	}

}
