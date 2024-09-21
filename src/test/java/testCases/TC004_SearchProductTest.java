package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import PageObjects.HomePage;
import PageObjects.SearchPage;
import testBase.BaseClass;

public class TC004_SearchProductTest extends BaseClass{
	
	@Test(groups={"master"})
	public void verify_productSearch()
	{
		logger.info("**** Starting TC004_SearchProductTest ****");
		
		try
		{
		String userSearch="samsung phone";
		
		HomePage hp=new HomePage(driver);
		hp.inputProductName(userSearch);
		hp.clickSearch();
		
		SearchPage sp= new SearchPage(driver);
		boolean productFound=sp.isProductExists(userSearch);
		
		Assert.assertTrue(productFound,userSearch);
		}catch (Exception e) {
			Assert.fail();
		}
		logger.info("**** Finished TC004_SearchProductTest ****");
	}

}
