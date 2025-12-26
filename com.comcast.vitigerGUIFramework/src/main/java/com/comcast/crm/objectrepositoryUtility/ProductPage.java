package com.comcast.crm.objectrepositoryUtility;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProductPage {

	@FindBy(name="search_text")
	private WebElement searchfield;
	
	public WebElement getSearchfield()
	{
		return searchfield;
	}
}
