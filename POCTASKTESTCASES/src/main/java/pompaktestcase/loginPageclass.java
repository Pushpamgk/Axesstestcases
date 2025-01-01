package pompaktestcase;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import basepktestcase.baseclasstestcase;

public class loginPageclass extends baseclasstestcase {
	
	public By SignupLogin = By.xpath(" //a[text()=' Signup / Login']");
	public By NewUser = By.xpath("//h2[text()='New User Signup!']");
	public By Name = By.xpath("//input[@placeholder='Name']");
	public By EnterEmail = By.xpath("//form[@action='/signup']//input[@type='email']");
	public By SignUpButton = By.xpath("(//button[@type='submit'])[2]");
	public By LoginToAccount = By.xpath("//h2[text()='Login to your account']");
	public By Email = By.xpath("(//input[@type='email'])[1]");
	public By Password = By.xpath("//input[@name='password']");
	public By Loginbutton = By.xpath("//button[text()='Login']");
	public By Incorrectmail = By.xpath("//p[text()='Your email or password is incorrect!']");
	public By ExistingEmail = By.xpath("//p[text()='Email Address already exist!']");
	
	
	public void VerifyUser_navigated_Loginpage() {
		boolean view = driver.findElement(SignupLogin).isDisplayed();
		System.out.println("User navigated to loginpage :" + view);
	}
	
	
	public void Entername_and_Email() {
		WebElement name = driver.findElement(Name);

		name.click();
		name.sendKeys("premalatha", Keys.TAB);

		WebElement Email = driver.findElement(EnterEmail);
		Email.sendKeys("Pranithapraneshoct2021@gmail.com");
	}

	public void ClickSignup_button() {
		driver.findElement(SignUpButton).click();
	}

	public void Verify_LoginToYour_Account() {
		boolean displayed = driver.findElement(LoginToAccount).isDisplayed();
		System.out.println("verify Login to your account : " + displayed);
	}

	public void Verify_NewUserSignup() {
		String newuser = driver.findElement(NewUser).getText();
		System.out.println("New User page =" + newuser);

	}
	public void EnterCorrect_EmailIdPassword() {

		driver.findElement(Email).sendKeys("praneshpranithaoct11@gmail.com", Keys.TAB);
		driver.findElement(Password).sendKeys("pranitha");

	}

	public void Click_LoginButton() {
		driver.findElement(Loginbutton).click();
	}

	public void EnterIncorrect_Emailpassword() {
		driver.findElement(Email).sendKeys("AmmaAppa@gmail.com", Keys.TAB);
		driver.findElement(Password).sendKeys("prema");
	}
	
	public void Verify_EmailPassword_isIncorrect() {
		boolean displayed2 = driver.findElement(Incorrectmail)
				.isDisplayed();
		System.out.println("Email or password is incorrect is visible :" + displayed2);
	}
	
	public void Enter_Alreadyregistered_NameandEmail() {
		driver.findElement(Name).sendKeys("premalatha");
		driver.findElement(EnterEmail).sendKeys("premapranesh@gmail.com");

	}
	
	public void Verify_Email_AlreadyExists() {
		boolean view1 = driver.findElement(ExistingEmail).isDisplayed();
		System.out.println("Email address already exists :" + view1);
	}

}
