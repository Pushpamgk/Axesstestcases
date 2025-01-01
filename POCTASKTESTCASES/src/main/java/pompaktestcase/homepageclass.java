package pompaktestcase;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.RenderingHints.Key;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import basepktestcase.baseclasstestcase;

public class homepageclass extends baseclasstestcase {

	public By Home = By.xpath("//a[text()=' Home']");
	public By SignupLogin = By.xpath(" //a[text()=' Signup / Login']");
	public By Logout = By.xpath(" //a[text()=' Logout']");
	public By TestCases = By.xpath(" //a[text()=' Test Cases']");
	public By Products = By.xpath("//a[text()=' Products']");
	public By Subscription = By.xpath("//h2[text()='Subscription']");
	public By Entermail = By.xpath("//input[@type='email']");
	public By Arrow = By.xpath("//button[@id='subscribe']");
	public By Success = By.xpath("//div[text()='You have been successfully subscribed!']");
	public By Cart = By.xpath("//a[text()=' Cart']");
	public By Addproduct1 = By.xpath("(//p[text()='Blue Top']/..//a[text()='Add to cart'])[1]");
	public By Addproduct2 = By.xpath("(//p[text()='Men Tshirt']/..//a[text()='Add to cart'])[1]");
	public By Continueshopping = By.xpath("//button[text()='Continue Shopping']");
	public By categories = By.xpath("//div[@id='accordian']");
	public By WomenCategory = By.xpath("(//span[@class='badge pull-right'])[1]");
	public By WomenTops = By.xpath("//a[text()='Tops ']");
	public By Recommendeditems = By.xpath("//h2[text()='recommended items']");
	public By AddcartRec = By.xpath("(//a[@data-product-id='3'])[1]");
	public By Viewcart = By.xpath("//u[text()='View Cart']");
	public By UpArrowsymbol = By.xpath("//a[@id='scrollUp']");
	public By Automation = By.xpath("(//h2[text()='Full-Fledged practice website for Automation Engineers'])[1]");
	
	public void verifyhomepage() {
		boolean homepage = driver.findElement(Home).isDisplayed();
		System.out.println("The homepage is visible successfully = " + homepage);
	}

	public void ClickSignup_or_loginbutton() {
		driver.findElement(SignupLogin).click();

	}

	public void Click_LogoutButton() {
		driver.findElement(Logout).click();
	}

	
	public void Click_TestCases() {
		driver.findElement(TestCases).click();
	}


	public void Click_Productsbutton() {
		driver.findElement(Products).click();

	}

	public void Scrolldown_To_Footer() throws AWTException {

		Robot robot = new Robot();
		for (int i = 1; i <= 250; i++) {
			robot.keyPress(KeyEvent.VK_DOWN);
			robot.keyRelease(KeyEvent.VK_DOWN);

		}
	}

	public void Verify_Text_Subscription() {
		boolean Subscript = driver.findElement(Subscription).isDisplayed();
		System.out.println("Text SUBSCRIPTION is visible :" + Subscript);
		Assert.assertTrue(Subscript,true);
	}

	public void EnterEmail_And_ClickArrow() {
		WebElement mail = driver.findElement(Entermail);
		mail.click();
		mail.sendKeys("premapranesh15@gmail.com");
		driver.findElement(Arrow).click();

	}

	public void Verify_SuccessMessage() {
		boolean message = driver.findElement(Success).isDisplayed();
		System.out.println("Successfully subscribed is visible :" + message);
	}

	public void Click_CartButton() {
		driver.findElement(Cart).click();

	}

	public void Add_Products_ToCart() {
		driver.findElement(Addproduct1).click();
		driver.findElement(Continueshopping).click();
		driver.findElement(Addproduct2).click();
		driver.findElement(Continueshopping).click();
	}

	public void Verify_Categories_Visible() {
		String category = driver.findElement(categories).getText();
		System.out.println("categories displayed:" + category);
	}

	public void ClickOn_WomenCategory() throws AWTException {
		Robot robot = new Robot();
		for (int i = 0; i <= 5; i++) {
			robot.keyPress(KeyEvent.VK_DOWN);
		}

		driver.findElement(WomenCategory).click();
	}

	public void Clickon_Anycategory_InWomen() {
		driver.findElement(WomenTops).click();
	}

	public void ScrollTo_BottomPage() throws AWTException {
		Robot robot = new Robot();
		for (int i = 0; i <= 185; i++) {
			robot.keyPress(KeyEvent.VK_DOWN);
			robot.keyRelease(KeyEvent.VK_DOWN);
		}
	}

	public void VerifyRecommendedItems_visible() {

		boolean Recomitem = driver.findElement(Recommendeditems).isDisplayed();
		System.out.println("Recommended items are visible :" + Recomitem);
	}

	public void AddToCart_RecommendedProduct() {
		driver.findElement(AddcartRec).click();

	}

	public void Clickon_ViewCart_button() {
		driver.findElement(Viewcart).click();
	}

	public void Clickon_ArrowatBottom_rightside_To_Scrollup()  {
		driver.findElement(UpArrowsymbol).click();
	}
	
	public void VerifyFullText_AutomationEngineers() {
	boolean text=driver.findElement(Automation).isDisplayed();
	System.out.println("Full Text of Autmation Engineers is displayed :"+text);
	
	}
	public void ScrollUp_PagetoTop() throws AWTException {
		Robot robot = new Robot();
		for (int i = 0; i <= 215; i++) {
			robot.keyPress(KeyEvent.VK_UP);
			robot.keyRelease(KeyEvent.VK_UP);
		}
	}

}
