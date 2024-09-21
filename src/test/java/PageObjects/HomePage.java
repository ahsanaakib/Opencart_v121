package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {

	public HomePage(WebDriver driver) 
	{
		super(driver);
	}

	@FindBy(xpath = "//span[normalize-space()='My Account']") 
	WebElement lnkMyaccount;
	
	@FindBy(xpath = "//a[normalize-space()='Register']") 
	WebElement lnkRegister;
	
	@FindBy(xpath="//ul[@class='dropdown-menu dropdown-menu-right']//a[normalize-space()='Login']")
	WebElement linkLogin;
	
	@FindBy(xpath="//input[@placeholder='Search']")
	WebElement txtInputSearch;
	
	@FindBy (xpath="//button[@class='btn btn-default btn-lg']")
	WebElement btnSearch;
	
	public void clickMyAccount()
	{
		lnkMyaccount.click();
	}
	public void clickRegister()
	{
		lnkRegister.click();
	}
	public void clickLogin()
	{
		linkLogin.click();
	}
	
	//user search
	public void inputProductName(String pname)
	{
		txtInputSearch.sendKeys(pname);
	}
	
	public void clickSearch()
	{
		btnSearch.click();
		
	}
}
