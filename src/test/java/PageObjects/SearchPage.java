package PageObjects;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SearchPage extends BasePage {

	public SearchPage(WebDriver driver) {
		super(driver);
		
	}

	@FindBy (xpath= "//div[@class='product-thumb']//h4/a")
	List<WebElement> productNames;
	
	public boolean isProductExists(String chkProduct)
	{
		try
		{
		for(WebElement product: productNames)
		{
			if(product.getText().toLowerCase().contains(chkProduct.toLowerCase()))
			{
				return true;
			}			
					
		}
		return false;
		}catch (Exception e) {
			return false;
		}
	}
	
}
