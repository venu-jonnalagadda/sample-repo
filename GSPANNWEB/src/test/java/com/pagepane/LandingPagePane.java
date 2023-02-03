package com.pagepane;

import java.util.List;
import java.util.Set;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.common.BaseClass;

public class LandingPagePane extends BaseClass{
	
	
	
	public LandingPagePane(WebDriver driver) {
		this.driver = super.driver;
//        PageFactory.initElements(this.driver, this);
    }
	
	
	String navItem = "//a[contains(@class,'nav-a')  and text()='$Dynamic']";
	String brandCheckOpt = "//a//span[text()='$Dynamic']";
	
	String navItemTrade = "//header//a[contains(@href,'tdameritrade')  and text()='$Dynamic']";
	String component = "//div[@class='left-rail-container']//a[text()='$Dynamic']";
	
   @FindBy(xpath="//img[contains(@alt,'company-branding')]")
	WebElement logo;

   @FindBy(xpath="//div[@data-component-type='s-search-result']//a//img")
	WebElement productItem;
	
   @FindBy(xpath="//input[@id='add-to-cart-button']")
	WebElement addToCart;


   @FindBy(xpath="//div[@id='attach-desktop-sideSheet']")
   WebElement sideBar;

   @FindBy(xpath="//div[@id='attach-desktop-sideSheet']//span[text()=' Cart ']")
   WebElement sideBarCart;

   @FindBy(xpath="(//div[@id='nav-cart-count-container']//span)[1]")
   WebElement varifyCartCount;


	public  void luanchApplication() {
//		driver.get("https://www.amazon.in");
		System.out.println(" title "+driver.getTitle());
		
//		Assert.assertEquals(driver.getTitle(), "Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in");
	}
	
	public void clickTheNavItem(String itemName) {
		getDynamicLocator(navItem, itemName).click();
	}

	public void userOnTheProductsListPage() {
		System.out.println(" product title "+driver.getTitle());
		
	}

	public void UserSelectBrandOption(String string) {
		
		getDynamicLocator(brandCheckOpt, string).click();
	}

	public void userClickTheProduct() throws InterruptedException {
		Thread.sleep(1000);
		WebElement element = driver.findElement(By.xpath("//div[@data-component-type='s-search-result']//a//img"));
		JavascriptExecutor executor = (JavascriptExecutor)driver;
		executor.executeScript("arguments[0].click();", element);
//		productItem.click();
		
		
		
	}

	public void clickTheAddToCart() throws InterruptedException {
		for(String winHandle : driver.getWindowHandles()){
		    driver.switchTo().window(winHandle);
		}
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='add-to-cart-button']")).click();
		Thread.sleep(30000); 
		WebElement element = driver.findElement(By.xpath("//a[@id='attach-close_sideSheet-link']"));
//		Actions action = new Actions(driver);
//		action.moveToElement(element);
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
//		JavascriptExecutor executor = (JavascriptExecutor)driver;
//		executor.executeScript("arguments[0].click();", element);
		element.click();
		
	}

	public void verifyTheCartCount() {
		Assert.assertEquals("1", driver.findElement(By.xpath("(//div[@id='nav-cart-count-container']//span)[1]")).getText().trim());
	}

	public void clickTheSeeMoreDetails() {
		for(String winHandle : driver.getWindowHandles()){
		    driver.switchTo().window(winHandle);
		}
		WebElement element = driver.findElement(By.xpath("//a[@id='seeMoreDetailsLink']"));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
		element.click();
		
	}

	public void productTechnicalDetails() {
		List<WebElement> element = driver.findElements(By.xpath("//table[contains(@id,'productDetails_techSpec')]//tbody//tr//td"));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element.get(0));
		for (WebElement ele : element) {
			;
			Assert.assertFalse(ele.getText().trim().isEmpty());
		}
	}

	public void clickTheTDAmeriTradeAppNavItem(String navItemInput) {
		getDynamicLocator(navItemTrade, navItemInput).click();
		
	}

	public void clickTheTDAmeriTradeAppComponent(String componentInput) {
		getDynamicLocator(component, componentInput).click();
		
	}
	
	
}
