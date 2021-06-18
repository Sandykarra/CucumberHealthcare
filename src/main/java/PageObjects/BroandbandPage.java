package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BroandbandPage {
	
	  WebDriver driver;
	  
	  public BroandbandPage(WebDriver driver) {
	        this.driver = driver;
	        PageFactory.initElements(driver, this);
	    }

	  
	 // @FindBy(xpath="//a[@class='nav-item-link nav-link tab-focus primary-nav-link svelte-vivf6p'][normalize-space()='Broadband']")
//WebElement lnkBroadba;
	  
@FindBy(linkText="Broadband")
WebElement lnkBroadba;

@FindBy(xpath="//a[@class='Button-sc-1hnjlx5-0 eWIQMg']")
WebElement lnkCombroadbane;

@FindBy(xpath="//a[normalize-space()='Join now']")
WebElement txtJoin;


//Action methods*************************************************88

	  public void selBroadband() {
		  lnkBroadba.click();
		  
	  }
	  
	  public void clkCompareBroadbandPack() {
		  lnkCombroadbane.click();
		  
	  }

public String txtJoinNow() {
	return txtJoin.getText();

	
}




















}
