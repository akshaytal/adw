package Vpage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Fbpage {
	
	@FindBy(xpath="")
	private WebElement user;
	
	@FindBy(xpath="")
	private WebElement pass;
	
	@FindBy(xpath="")
	private WebElement login1;
	
	public Fbpage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		}
     
	public void login(String u1,String p1) {
		user.sendKeys(u1);
		pass.sendKeys(p1);
		login1.click();
	}
}
