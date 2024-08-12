package testbase;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class xpath extends Testbase {
	@FindBy(xpath = "//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[1]/div/div[2]/input")
	public  WebElement email;
	
	@FindBy(xpath = "//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[2]/div/div[2]/input")
	public WebElement password;
	
	@FindBy(xpath = "//button[@class='oxd-button oxd-button--medium oxd-button--main orangehrm-login-button']")
	public  WebElement Login;
	
	@FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[1]/header/div[1]/div[1]/span/h6")
	public  WebElement dashboard;
	
	
	
	public xpath(){
		PageFactory.initElements(driver, this);
	}
	
	public void enter_email(String ID) {
		Actions a =new Actions(driver);
		a.moveToElement(email).click().perform();
		email.sendKeys(ID);
	}
	
	public void enter_password(String pass) {
		Actions a =new Actions(driver);
		a.moveToElement(password).click().perform();
		password.sendKeys(pass);
	}

	public void click_on_login_btn() {
		Login.click();
	}
	
	public void verify_dashboard() {
		dashboard.isDisplayed();
	}
}
