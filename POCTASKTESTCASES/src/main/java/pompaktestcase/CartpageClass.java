package pompaktestcase;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import basepktestcase.baseclasstestcase;

public class CartpageClass extends baseclasstestcase {

	public By Cartpage = By.xpath("//a[text()=' Cart']");
	public By Checkout = By.xpath("//a[text()='Proceed To Checkout']");
	public By Reg_login = By.xpath("//u[text()='Register / Login']");
	public By Addressdetails = By.xpath("//h2[text()='Address Details']");
	public By Revieworder = By.xpath("//h2[text()='Review Your Order']");
	public By Description = By.xpath("//textarea[@name='message']");
	public By Placeorder = By.xpath("//a[text()='Place Order']");
	public By DelvAddress = By.xpath("//ul[@id='address_delivery']");
	public By BillAddress = By.xpath("//ul[@id='address_invoice']");
	public By Delproduct1 = By.xpath("//a[@data-product-id='1']");
	public By ProdinCart = By.xpath("//section[@id='cart_items']");
	public By Visibleprd = By.xpath("//tr[@id='product-2']");
	public By RecProd = By.xpath("//tr[@id='product-3']");
	
	
	
	public void Verify_Cartpage_displayed() {
		String cart = driver.findElement(Cartpage).getText();
		System.out.println("Displayed page :" + cart);
	}

	public void Click_ProceedtoCheckout_Button() {
		driver.findElement(Checkout).click();

	}

	public void Click_Register_Or_LoginButton() {
		driver.findElement(Reg_login).click();
	}

	public void Verify_Addressdetails_and_ReviewYourOrder() {
		boolean Address = driver.findElement(Addressdetails).isDisplayed();
		System.out.println("Address details is displayed :" + Address);

		boolean Review = driver.findElement(Revieworder).isDisplayed();
		System.out.println("Review your order is diplayed :" + Review);
	}

	public void EnterDescription_And_PlaceOrder() {
		driver.findElement(Description).sendKeys("Expecting Fast Delivery");
		driver.findElement(Placeorder).click();
	}

	public void Verify_DeliveryAddress() {
		boolean delivery = driver.findElement(DelvAddress).isDisplayed();
		System.out.println("Delivery address is same :"+delivery);
		
	}
	public void Verify_BillingAddress() {
		boolean Billing = driver.findElement(BillAddress).isDisplayed();
		System.out.println("Billing Address is same :" +Billing);
	}
	
	public void Click_X_Button_Forparticularproduct() {	
		driver.findElement(Delproduct1).click();
	}
	
	public void Verify_ProductRemoved_Fromcart() {
		
		List<WebElement> cartitems = driver.findElements(ProdinCart);
		if(cartitems.size()<=1) {
			System.out.println("Product is removed from cart");
		}
		else {
			System.out.println("Product is not removed from cart");
		}
	}
	public void Verify_ProductsVisible_InCart() {
		boolean product = driver.findElement(Visibleprd).isDisplayed();
		System.out.println("The cartitem is visible :"+product);
	
	}
	public void Verify_RecommendedProduct_CartPage() {
		boolean cartitm = driver.findElement(RecProd).isDisplayed();
	System.out.println("Recommended product is displayed :"+cartitm);
	}

}
