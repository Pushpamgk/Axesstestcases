package pompaktestcase;

import org.openqa.selenium.By;

import basepktestcase.baseclasstestcase;

public class Accountcreatedclass extends baseclasstestcase {
	
	public By AccountCreated = By.xpath("//b[text()='Account Created!']");
	public By Continue = By.xpath("//a[text()='Continue']");
	public By Loggedin = By.xpath("//a[text()=' Logged in as ']");
	public By DeleteAccount = By.xpath(" //a[text()=' Delete Account']");
	public By AccountDeleted = By.xpath("//b[text()='Account Deleted!']");
	
	
	public void Verify_Accountcreated() {
		String createaccount = driver.findElement(AccountCreated).getText();
		System.out.println("visible content =" +createaccount);
	}
	
	public void ClickContinue() {
		driver.findElement(Continue).click();
	}
	
	public void VerifyLoggedin() {
		String logintext = driver.findElement(Loggedin).getText();
		System.out.println("Login details: "+logintext);
		
	}
	
	
	public void Click_DeleteAccount() {
		driver.findElement(DeleteAccount).click();
	}
	
	public void VerifyAccountDeleted() {
		String delaccount = driver.findElement(AccountDeleted).getText();
		System.out.println("Visible content: "+delaccount); 
		
		
	}

}
