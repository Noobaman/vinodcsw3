package Testcases;

import java.util.concurrent.TimeUnit;

import org.junit.Ignore;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import globals.Globals;
import pagObjects.AddToCartObjects;
import pagObjects.LoginPageobjects;

public class TestAddToWishlist extends Globals {
	@BeforeMethod
	public void launchUrl() throws Exception {

		System.setProperty("browser", "Chrome");

		setUp();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		browserNav(QA_CoverStoryURL);
		LoginPageobjects lgin = new LoginPageobjects(driver);

	}
	//@Test(priority = 0)
	@Ignore
	public void PlaceOrder_withoutPrelogin() throws Exception {

		LoginPageobjects lgin = new LoginPageobjects(driver);
		AddToCartObjects addcart = new AddToCartObjects(driver);

		moveToElement(addcart.clothing);
		Thread.sleep(2000);
		addcart.dressAndJumpsuits.click();
		addcart.maxi.click();
		Thread.sleep(3000);
		addcart.PLP.click();
		Thread.sleep(3000);

		if (addcart.selectSizeXS.isEnabled()) {
			addcart.selectSizeXS.click();
			System.out.println("Extra Small size is selected");

		} else if (addcart.selectSizeS.isEnabled()) {
			addcart.selectSizeS.click();
			System.out.println("Small size is selected");
			
		} else if (addcart.selectSizeM.isEnabled()) {
			addcart.selectSizeM.click();
			System.out.println("Medium size is selected");
			
		} else if (addcart.selectSizeL.isEnabled()) {
			addcart.selectSizeL.click();
			System.out.println("Large size is selected");
			
		} else {
			System.out.println("Product is Out of stock");
			
		}

		Thread.sleep(3000);
		addcart.addTocartButton.click();
		Thread.sleep(3000);
		addcart.cartIcon_PDP.click();
		Thread.sleep(1000);
		addcart.viewCartButton_PDP.click();
	}

}
