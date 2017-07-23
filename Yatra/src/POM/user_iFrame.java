package POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class user_iFrame 
{
WebDriver driver;
public user_iFrame(WebDriver driver)
{
	// TODO Auto-generated constructor stub
	this.driver=driver;
	PageFactory.initElements(driver, this);
}
//Find Elements using FindBy Annotation
@FindBy(name="userForm")
WebElement formBody;

@FindBy(name="email")
WebElement email;

@FindBy(name="mobile")
WebElement mobileNumber;

@FindBy(xpath=".//*[@id='ssoOverlayContent']/div/section/section/section[1]/div/form/div[5]/button")
WebElement bookAsGuestBtn;

public void enterEmail(String emailtext)
{
formBody.sendKeys(emailtext);	
}
public void enterMobile(String number) 
{
formBody.findElement((By) mobileNumber).sendKeys(number);	
}
public void clickBook()
{
bookAsGuestBtn.click();	
}

}
