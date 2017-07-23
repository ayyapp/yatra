package POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class yatra_Home 
{
WebDriver driver;
public yatra_Home(WebDriver driver) 
{
	// TODO Auto-generated constructor stub
	this.driver=driver;
	PageFactory.initElements(driver, this);
}

@FindBy(xpath=".//*[@id='BE_flight_origin_city']")
WebElement origin;

@FindBy(xpath=".//*[@id='BE_flight_arrival_city']")
WebElement destination;

@FindBy(xpath=".//*[@id='BE_flight_form']/div/div[2]/ul/li[3]/i")
WebElement calendarIcon;

@FindBy(xpath=".//*[@id='a_2016_12_28']/span")
WebElement dateSelected;

@FindBy(xpath=".//*[@id='BE_flight_paxInfoBox']/i")
WebElement passengarIcon;

@FindBy(xpath=".//*[@id='BE_flight_passengerBox']")
WebElement passengarBox;

@FindBy(xpath=".//*[@id='msdrpdd20_msdd']/div[1]/span[2]")
WebElement addPassenger;

@FindBy(css="#BE_flight_paxInfoBox>span")
WebElement passengerCheck;

@FindBy(xpath=".//*[@id='BE_flight_flsearch_btn']")
WebElement search_Btn;

@FindBy(css=".done")
WebElement btnDone;

public void enterOrigin(String Origin)
{
	origin.sendKeys(Origin);
	WebDriverWait wait = new WebDriverWait(driver,10);
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".ac_cityname>span")));
	driver.findElement(By.cssSelector(".ac_cityname>span")).click();
}

public void enterDestination(String Destination) 
{
destination.sendKeys(Destination);
WebDriverWait wait = new WebDriverWait(driver,10);
wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("html/body/div[16]/ul/div[2]/div/li[1]/div[1]/p[1]/span")));
driver.findElement(By.xpath("html/body/div[16]/ul/div[2]/div/li[1]/div[1]/p[1]/span")).click();
}

public void selectDate()
{
	calendarIcon.click();
	dateSelected.click();
}

public void enterNumOfPassengers()
{
passengarIcon.click();
WebDriverWait wait = new WebDriverWait(driver,5);
wait.until(ExpectedConditions.visibilityOf(passengarBox));
addPassenger.click();
btnDone.click();
}

public void checkPassenger()
{
Assert.assertEquals(passengerCheck.getText(), "2 Traveller(s), Economy", "Total Passengar Not Updated");
System.out.println("Number of passenger to be taken is checked!");
}

public void enter_SearcDetails(String Origin,String Destination)
{
	this.enterOrigin(Origin);
	this.enterDestination(Destination);
	this.selectDate();
	this.enterNumOfPassengers();
	this.checkPassenger();
	search_Btn.click();
}

}
