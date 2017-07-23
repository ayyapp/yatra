package Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import POM.user_iFrame;
import POM.yatra_Home;
import POM.yatra_ReviewPage;
import POM.yatra_SearchPage;

public class Test {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
WebDriver driver = new FirefoxDriver();
driver.manage().window().maximize();
driver.get("https://www.yatra.com/");

yatra_Home       ob1 = new yatra_Home(driver);
yatra_SearchPage ob2=new yatra_SearchPage(driver);
yatra_ReviewPage ob3 = new yatra_ReviewPage(driver);
user_iFrame      ob4= new user_iFrame(driver);

ob1.enter_SearcDetails("Bangalore", "Goa");
System.out.println("Search Details Entered");
ob2.getSearchDetails();
System.out.println("Search Details Got");
ob3.verifyFlightDetail();
System.out.println("Flight Details Verified");
ob4.enterEmail("nivassahoo.36@gmail.com");
ob4.enterMobile("9677165029");
ob4.clickBook();
	
}

}
