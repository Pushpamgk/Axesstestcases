package pompaktestcase;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import basepktestcase.baseclasstestcase;

public class Accountdetailsclass extends baseclasstestcase {

	public By VerifyAccount = By.xpath("//b[text()='Enter Account Information']");
	public By Radiobutton = By.xpath("(//input[@type='radio'])[2]");
	public By Password = By.xpath("//input[@id='password']");
	public By Days = By.xpath("//select[@id='days']");
	public By Months = By.xpath("//select[@id='months']");
	public By Years = By.xpath("//select[@id='years']");
	public By ChooseNewsletter = By.xpath("(//input[@type='checkbox'])[1]");
	public By ChooseSpecialOffer = By.xpath("//input[@id='optin']");
	public By Firstname = By.xpath("//input[@id='first_name']");
	public By lastname = By.xpath("//input[@id='last_name']");
	public By Company = By.xpath("//input[@name='company']");
	public By Address1 = By.xpath("//input[@name='address1']");
	public By Address2 = By.xpath("//input[@name='address2']");
	public By State = By.xpath("//input[@id='state']");
	public By City = By.xpath("//input[@id='city']");
	public By Zipcode = By.xpath("//input[@id='zipcode']");
	public By Mobilenumber = By.xpath("//input[@id='mobile_number']");
	public By CreateAccount = By.xpath("//button[text()='Create Account']");
	

	public void Verify_EnterAccountInformation() {
		String account = driver.findElement(VerifyAccount).getText();
		System.out.println("Account page = " + account);
	}

	public void Select_Mr_or_Mrs() {
		driver.findElement(Radiobutton).click();
	}

	public void Enter_Password() {
		driver.findElement(Password).sendKeys("pranitha");
	}

	public void Choose_DateofBirth() {
		WebElement day = driver.findElement(Days);
		day.click();
		Select select = new Select(day);
		select.selectByValue("25");
		day.click();

		WebElement month = driver.findElement(Months);
		month.click();
		Select select1 = new Select(month);
		select1.selectByVisibleText("January");
		month.click();

		WebElement year = driver.findElement(Years);
		year.click();
		Select select2 = new Select(year);
		select2.selectByVisibleText("1990");
		year.click();

	}

	public void SelectCheckbox_Newsletter() {
		driver.findElement(ChooseNewsletter).click();
	}

	public void SelectCheckbox_Specialoffers() {
		driver.findElement(ChooseSpecialOffer).click();
	}

	public void Enter_FirstnameAndLastname() {
		driver.findElement(Firstname).sendKeys("Prema");
		driver.findElement(lastname).sendKeys("latha");

	}

	public void EnterCompany_Address_Address2() {
		driver.findElement(Company).sendKeys("Axess technology");
		driver.findElement(Address1).sendKeys("Tidelpark,Tharamani,Chennai");
		driver.findElement(Address2).sendKeys("Tidelpark,RajivGandhi salai,chennai");

	}

	public void EnterState_City_Zipcode_mobilenumber() {

		driver.findElement(State).sendKeys("Tamilnadu");
		driver.findElement(City).sendKeys("Chennai");
		driver.findElement(Zipcode).sendKeys("600113");
		driver.findElement(Mobilenumber).sendKeys("8220414448");

	}

	public void Click_CreateAccountbutton() {
		driver.findElement(CreateAccount).click();

	}
	

}
