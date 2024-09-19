package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import PageObjects.HomePage;
import PageObjects.LoginPage;
import PageObjects.MyAccountPage;
import testBase.BaseClass;

public class TC002_LoginTest extends BaseClass{

	@Test(groups={"Sanity","Master"})
	public void verify_login()
	{
		logger.info("***** Startin Login Test ******");
		try
		{
		HomePage hp= new HomePage(driver);
		hp.clickMyAccount();
		hp.clickLogin();
		
		LoginPage lp= new LoginPage(driver);
		lp.setEmail(p.getProperty("email"));
		lp.setPassword(p.getProperty("password"));
		lp.clickLogin();
		
		MyAccountPage macc= new MyAccountPage(driver);
		boolean targetPage=macc.isMyAccountPageExists();
		Assert.assertTrue(targetPage);//Assert.assertEquals(targetPage, true, "Lest failed");
		}
		catch(Exception e)
		{
			Assert.fail();
		}
		logger.info("***** Finished Login test ******");	
	}
	
}
