package POM;

import java.util.ArrayList;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class yatra_SearchPage 
{
WebDriver driver;

public yatra_SearchPage(WebDriver driver) 
{
	this.driver=driver;
	PageFactory.initElements(driver, this);
}



@FindBy(xpath=".//*[@id='BLRGOI6E623620161228']/div[1]/ul/li[1]/small[1]")
WebElement flytName;

@FindBy(xpath=".//*[@id='BLRGOI6E623620161228']/div[1]/ul/li[2]/div[1]/span")
WebElement departTime;

@FindBy(xpath=".//*[@id='BLRGOI6E623620161228']/div[1]/ul/li[2]/div[2]/span")
WebElement arriveTime;

@FindBy(xpath=".//*[@id='BLRGOI6E623620161228']/div[1]/ul/li[2]/div[3]/span")
WebElement durationTime;

@FindBy(xpath=".//*[@id='fare-BLRGOI6E623620161228']")
WebElement fare;

@FindBy(xpath=".//*[@id='BLRGOI6E623620161228']/div[1]/ul/li[5]/div/p[2]/span[1]")
WebElement book_btn;

public String getName() 
{
return flytName.getText();
}

public String getDeparture()
{
return departTime.getText();	
}

public String getArrival()
{
return arriveTime.getText();	
}

public String getDuration()
{
return durationTime.getText();	
}

public String getFare()
{
return fare.getText();	
}

public void bookNow()
{
book_btn.click();	
}

public ArrayList<String> getFlightDetails() 
	{
	ArrayList<String> list = new ArrayList<String>();
	list.add(this.getName());
	list.add(this.getDeparture());
	list.add(this.getArrival());
	list.add(this.getDuration());
	list.add(this.getFare());	
	return list;
	}

public void getSearchDetails() throws Exception
{
System.out.println("Flight Name:"+this.getFlightDetails().get(0));
System.out.println("Departure Time:"+this.getFlightDetails().get(1));
System.out.println("Arrival Time:"+this.getFlightDetails().get(2));
System.out.println("Duration:"+this.getFlightDetails().get(3));
System.out.println("Fare:"+this.getFlightDetails().get(4));
this.bookNow();
Thread.sleep(5);
}

}
