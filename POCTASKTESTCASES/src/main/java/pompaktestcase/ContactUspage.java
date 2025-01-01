package pompaktestcase;

import java.awt.AWTException;


import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import basepktestcase.baseclasstestcase;

public class ContactUspage extends baseclasstestcase {

	public By ContactUs = By.xpath(" //a[text()=' Contact us']");
	public By Name = By.xpath("//input[@name='name']");
	public By EmailId = By.xpath("//input[@name='email']");
	public By Subject = By.xpath("//input[@name='subject']");
	public By Message = By.xpath("//textarea[@id='message']");
	public By Submit = By.xpath("//div[@class='form-group col-md-12']//input[@name='submit']");
	public By Home = By.xpath("//a[text()=' Home']");
	public By Successmsg = By.xpath("//div[@class='status alert alert-success']");
	
	
	
	public void Click_Contactus() {	
		driver.findElement(ContactUs).click();
	}
	
	public void Verify_GetInTouch() {
		boolean displayed = driver.findElement(By.xpath("//h2[text()='Get In Touch']")).isDisplayed();
		System.out.println("Get in touch is visible :"+displayed);
	}
	
	public void EnterName_Email_Subject_Message() {
		driver.findElement(Name).sendKeys("prema");
		driver.findElement(EmailId).sendKeys("premapranesh15@gmail.com");
		driver.findElement(Subject).sendKeys("AutomationTesting");
		driver.findElement(Message).sendKeys("Helpful",Keys.TAB);
	}
	
	public void Upload_File_fromPC() throws AWTException, InterruptedException {

		WebElement ChooseFile = driver.findElement(By.xpath("//input[@type='file']"));
	
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click()", ChooseFile);
		Robot robot = new Robot();
		Thread.sleep(2000);
		robot.keyPress(KeyEvent.VK_D);
		robot.keyRelease(KeyEvent.VK_D);
		robot.keyPress(KeyEvent.VK_O);
		robot.keyRelease(KeyEvent.VK_O);
		robot.keyPress(KeyEvent.VK_W);
		robot.keyRelease(KeyEvent.VK_W);
		robot.keyPress(KeyEvent.VK_N);
		robot.keyRelease(KeyEvent.VK_N);
		robot.keyPress(KeyEvent.VK_L);
		robot.keyRelease(KeyEvent.VK_L);
		robot.keyPress(KeyEvent.VK_DOWN);
		robot.keyRelease(KeyEvent.VK_DOWN);
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(2000);
		robot.keyPress(KeyEvent.VK_P);
		robot.keyRelease(KeyEvent.VK_P);
		robot.keyPress(KeyEvent.VK_I);
		robot.keyRelease(KeyEvent.VK_I);
		robot.keyPress(KeyEvent.VK_C);
		robot.keyRelease(KeyEvent.VK_C);
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(2000);
	}
	public void Click_SubmitButton() throws AWTException {
		WebElement SubmitBtn = driver.findElement(Submit);
		Actions actions = new Actions(driver);
		actions.moveToElement(SubmitBtn).click().perform();
		
	}
	
	public void Click_OKButton() {
		Alert alert = driver.switchTo().alert();
		alert.accept();
	}
	
	public void Verify_SuccessMessage() {
		boolean success = driver.findElement(Successmsg).isDisplayed();
	System.out.println(" Success message is visible :"+success);
	}
	
	public void Click_HomeButton() {
		driver.findElement(Home).click();
		
	}
	
	public void Verify_LandedToHomepage() {
		boolean Tohomepage = driver.findElement(Home).isDisplayed();
		System.out.println("Landed to homepage :"+Tohomepage);
	}
	
	
}
