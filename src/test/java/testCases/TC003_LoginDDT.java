package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import PageObjects.HomePage;
import PageObjects.LoginPage;
import PageObjects.MyAccountPage;
import testBase.BaseClass;
import utilities.DataProviders;

public class TC003_LoginDDT extends BaseClass{

	@Test(dataProvider = "LoginData",dataProviderClass = DataProviders.class,groups="Datadriven")
	public void verify_LoginDTT(String email, String password, String expResult)
	{
		logger.info("***** starting TC003 LoginDDT *****");
		
		try
		{
		HomePage hp= new HomePage(driver);
		hp.clickMyAccount();
		hp.clickLogin();
		
		LoginPage lp= new LoginPage(driver);
		lp.setEmail(email);
		lp.setPassword(password);
		lp.clickLogin();
		
		MyAccountPage macc= new MyAccountPage(driver);
		boolean targetPage=macc.isMyAccountPageExists();
		
		/* Data is Valid----->login success - test pass - logout
		 * 						login fail - test fail 
		 * 
		 * Data is Invalid------> login success - test fail
		 * 							login fail - test pass
		 */
		if(expResult.equalsIgnoreCase("Valid"))
		{
			if(targetPage==true) //login success
			{
				Assert.assertTrue(true); //test pass
				macc.clickLogout(); //logout
			}
			else	//login fail
			{
				Assert.assertTrue(false);	//test fail				
			}
		}
		if(expResult.equalsIgnoreCase("Invalid"))
		{
			if(targetPage==true)	//login success
			{
				macc.clickLogout();
				Assert.assertTrue(false); //test fail
			}
			else	//login fail
			{
				Assert.assertTrue(true); //test pass
			}
		}
		}catch( Exception e)
		{
			Assert.fail();
		}
		
		logger.info("***** finished TC003 LoginDDT *****");		
	}
}
