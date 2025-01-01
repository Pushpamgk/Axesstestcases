package pompaktestcase;



import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import basepktestcase.baseclasstestcase;

public class Paymentpageclass extends baseclasstestcase {
	
	public By Cardname = By.xpath("//input[@name='name_on_card']");
	public By Cardnumber = By.xpath("//input[@name='card_number']");
	public By CVC = By.xpath("//input[@name='cvc']");
	public By ExpiryMonth = By.xpath("//input[@name='expiry_month']");
	public By ExpiryYear = By.xpath("//input[@name='expiry_year']");
	public By Confirmorder = By.xpath("//button[text()='Pay and Confirm Order']");
	public By Successmsg = By.xpath("(//div[@class='alert-success alert'])[1]");
	public By Invoice = By.xpath("//a[text()='Download Invoice']");
	
	
	
	public void Enter_PaymentDetails() {
		WebElement name = driver.findElement(Cardname);
		name.click();
		name.sendKeys("premalatha",Keys.TAB);
		driver.findElement(Cardnumber).sendKeys("654321",Keys.TAB);
		driver.findElement(CVC).sendKeys("311",Keys.TAB);
		driver.findElement(ExpiryMonth).sendKeys("Oct",Keys.TAB);
		driver.findElement(ExpiryYear).sendKeys("2026",Keys.TAB);
	}
	
	public void Click_PayandConfirmOrder_Button() {
		driver.findElement(Confirmorder).click();
	}
	
	public void VerifySuccessmessage_Orderplaced() {
		boolean Success = driver.findElement(Successmsg).isDisplayed();
		System.out.println("Success message is displayed:"+Success);
		Assert.assertTrue(Success,true);
	}
	
	public void Click_DownloadInvoice_And_VerifyInvoice() {
		driver.findElement(Invoice).click();
	}

}
