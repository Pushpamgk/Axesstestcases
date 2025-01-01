package pompaktestcase;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import basepktestcase.baseclasstestcase;

public class ProductsPageclass extends baseclasstestcase {

	public By Productpge = By.xpath("//h2[text()='All Products']");
	public By ProductList = By.xpath("//h2[text()='Brands']");
	public By FirstViewProduct = By.xpath("//a[text()='View Product']");
	public By Productdetailpage = By.xpath("//div[@class='product-information']");
	public By ProdName = By.xpath("//h2[text()='Blue Top']");
	public By Category = By.xpath("//p[text()='Category: Women > Tops']");
	public By Price = By.xpath("//span[text()='Rs. 500']");
	public By Availability = By.xpath("//p[text()=' In Stock']");
	public By Condition = By.xpath("//p[text()=' New']");
	public By Search = By.xpath("//input[@name='search']");
	public By ClickIcon = By.xpath("//button[@type='button']");
	public By SearchedProducts = By.xpath("//h2[text()='Searched Products']");
	public By FirstProduct = By.xpath("//div[@class='single-products']");
	public By SecondProduct = By.xpath("(//div[@class='single-products'])[2]");
	public By Addtocart1 = By.xpath("(//a[text()='Add to cart'])[1]");
	public By ContinueShopping = By.xpath("//button[text()='Continue Shopping']");
	public By ViewCrt = By.xpath("//u[text()='View Cart']");
	public By Addtocart2 = By.xpath("(//a[@data-product-id='2'])[1]");
	public By Prod1details = By.xpath("//section[@id='cart_items']//tr[@id='product-1']");
	public By Prod2details = By.xpath("//section[@id='cart_items']//tr[@id='product-2']");
	public By BlueTopPrice = By.xpath("(//p[text()='Rs. 500'])[1]");
	public By MenTshirtPrice = By.xpath("(//p[text()='Rs. 400'])[1]");
	public By BluetopQty = By.xpath("(//button[text()='1'])[1]");
	public By MentshirtQty = By.xpath("(//button[text()='1'])[2]");
	public By BlueTopTotalPrice = By.xpath("(//p[text()='Rs. 500'])[2]");
	public By MenTshirtTotalPrice = By.xpath("(//p[text()='Rs. 400'])[2]");
	public By Addproduct = By.xpath("(//p[text()='Men Tshirt']/..//a[text()='Add to cart'])[1]");
	public By Prddetail = By.xpath("//div[@class='product-information']");
	public By Four = By.xpath("(//input[@value='1'])[1]");
	public By Addcartafter4 = By.xpath("//button[@type='button']");
	public By ProductDisplay = By.xpath("//a[text()='Blue Top']/../../..//button[text()='4']");
	public By Womentops = By.xpath("//h2[text()='Women - Tops Products']");
	public By Categorydisplay = By.xpath("//h2[text()='Category']");
	public By Mencategory = By.xpath("(//span[@class='badge pull-right'])[2]");
	public By Menjeans = By.xpath("//a[text()='Jeans ']");
	public By Jeanspage = By.xpath("//li[text()='Men > Jeans']");
	public By Polo = By.xpath("//a[text()='Polo']");
	public By Brandvariety = By.xpath("//div[@class='brands_products']");
	public By Polopage = By.xpath("//li[text()='Polo']");
	public By Poloproduct = By.xpath("//h2[text()='Brand - Polo Products']");
	public By Babyhug = By.xpath("//a[text()='Babyhug']");
	public By Babyhugpage = By.xpath("//li[text()='Babyhug']");
	public By Babyhugproduct = By.xpath("//h2[text()='Brand - ']");
	public By WriteReview = By.xpath("//a[text()='Write Your Review']");
	public By Name = By.xpath("//input[@id='name']");
	public By Mail = By.xpath("(//input[@type='email'])[1]");
	public By ProdReview = By.xpath("//textarea[@name='review']");
	public By SubmitReview = By.xpath("//button[@class='btn btn-default pull-right']");
	//public By SuccessReview = By.xpath("//span[contains(text(),'Thank you for your review'])");
	public By SuccessReview = By.xpath("//div[@id='review-section']");
	
	
	
	public void Verify_Usernavigated_Allproductspage() {
		boolean productpage = driver.findElement(Productpge).isDisplayed();
		System.out.println("User navigated to all products page :" + productpage);
	}

	public void verify_ProductsList() {
		boolean listofProducts = driver.findElement(ProductList).isDisplayed();
		System.out.println("Products list is visible :" + listofProducts);
	}

	public void Click_ViewProduct_FirstProduct() {
		driver.findElement(FirstViewProduct).click();
	}

	public void Verify_UserLanded_productDetail() {
		boolean prodetail = driver.findElement(Productdetailpage).isDisplayed();
		System.out.println("Product detail information :" + prodetail);
	}

	public void Verify_ProductnameAndCategory() {

		boolean prodname = driver.findElement(ProdName).isDisplayed();
		System.out.println("product name is visible :" + prodname);
		boolean category = driver.findElement(Category).isDisplayed();
		System.out.println("Category is visible : " + category);
	}

	public void Verify_Price_And_Availability() {

		boolean price = driver.findElement(Price).isDisplayed();
		System.out.println("Price of product is visible :" + price);
		boolean avail = driver.findElement(Availability).isDisplayed();
		System.out.println("Availability is visible :" + avail);
	}

	public void Verify_ConditionAndBrand() {

		boolean procondtion = driver.findElement(Condition).isDisplayed();
		System.out.println("Condition is visible :" + procondtion);
		boolean probrand = driver.findElement(By.xpath("//p[text()=' Polo']")).isDisplayed();
		System.out.println("Brand is visible :" + probrand);
	}

	public void EnterProductname_And_ClickSearch() {
		WebElement EnterSearch = driver.findElement(Search);
		EnterSearch.sendKeys("Men Tshirt");
		WebElement Clicksearch = driver.findElement(ClickIcon);
		Clicksearch.click();
	}

	public void Verify_Searchedproducts_visible() {
		boolean Searchedprd = driver.findElement(SearchedProducts).isDisplayed();
		System.out.println("SEARCHED PRODUCTS is visible : " + Searchedprd);

	}

	public void Verify_Allproducts_relatedtoSearch_visible() {
		List<WebElement> products = driver.findElements(FirstProduct);
		if (products.size() > 1) {
			System.out.println("All products related to search are visible");
		} else {
			System.out.println("All products related to search is not visible");
		}

	}

	public void MouseHover_Firstproduct() {
		WebElement First = driver.findElement(FirstProduct);
		Actions actions = new Actions(driver);
		actions.moveToElement(First).perform();
	}

	public void Click_AddToCArt1() {
		driver.findElement(Addtocart1).click();

	}

	public void Click_ContinueShopping() {
		driver.findElement(ContinueShopping).click();

	}

	public void MouseHover_SecondProduct() {
		WebElement Second = driver.findElement(SecondProduct);
		Actions actions = new Actions(driver);
		actions.moveToElement(Second).perform();

	}

	public void Click_Viewcart_button() {
		driver.findElement(ViewCrt).click();

	}

	public void Click_AddToCart2() {
		driver.findElement(Addtocart2).click();
	}

	public void Verify_BothProducts_InCart() {
		boolean product1 = driver.findElement(Prod1details).isDisplayed();
		System.out.println("Firstproduct is diplayed with details :" + product1);
		boolean product2 = driver.findElement(Prod2details).isDisplayed();
		System.out.println("Secondproduct is displayed with details :" + product2);

	}

	public void VerifyPrice_Quantity_TotalPrice() {
		String price1 = driver.findElement(BlueTopPrice).getText();
		System.out.println("Price of Blue Top :" + price1);
		String price2 = driver.findElement(MenTshirtPrice).getText();
		System.out.println("Price of Men Tshirt :" + price2);

		String BlueTop = driver.findElement(BluetopQty).getText();
		System.out.println("Quantity of blue top :" + BlueTop);
		String MenTshirt = driver.findElement(MentshirtQty).getText();
		System.out.println("Quantity of MenTshirt :" + MenTshirt);

		String Value1 = driver.findElement(BlueTopTotalPrice).getText();
		System.out.println("Total Price of Blue Top :" + Value1);
		String Value2 = driver.findElement(MenTshirtTotalPrice).getText();
		System.out.println("Total Price of Men Tshirt :" + Value2);

	}

	public void Verify_ProductDetail_IsOpened() {
		boolean ProductDetail = driver.findElement(Prddetail).isDisplayed();
		System.out.println("Product detail is opened :" + ProductDetail);
	}

	public void Increase_Quantity_ToFour() {
		WebElement Increase = driver.findElement(Four);
		Increase.clear();
		Increase.sendKeys("4");
	}

	public void Clicking_AddToCart_AfterIncreasing() {
		driver.findElement(Addcartafter4).click();
	}

	public void VerifyProductdisplayed_With_ExactQuantity() {
		String Qty4 = driver.findElement(ProductDisplay).getText();
		System.out.println("Quantity of Blue Top :" + Qty4);
	}

	public void VerifyCategorypage_And_TextWomenProducts() {
		String Tops = driver.findElement(Womentops).getText();
		System.out.println("Women products :" + Tops);
		boolean categorypage = driver.findElement(Categorydisplay).isDisplayed();
		System.out.println("Category page is diplayed :" + categorypage);
	}

	public void Clickon_AnyCategory_OfMenCategory() {
		driver.findElement(Mencategory).click();
		driver.findElement(Menjeans).click();
	}

	public void VerifyUser_Navigatedto_Menjeans_categoryPage() {
		String Jeans = driver.findElement(Jeanspage).getText();
		System.out.println("Page displayed :" + Jeans);
	}

	public void Verify_Brands_Are_Visible() {

		boolean brands = driver.findElement(Brandvariety).isDisplayed();
		System.out.println("Brands displayed :" + brands);
	}

	public void ClickOn_AnyBrandName() {
		driver.findElement(Polo).click();
	}

	public void VerifyUserNavigated_Brandpage_and_Brandproducts_Visible() {
		String brandpage = driver.findElement(Polopage).getText();
		System.out.println("The displayed brandpage :" + brandpage);
		String brandprodct1 = driver.findElement(Poloproduct).getText();
		System.out.println("The displayed brandproducts :" + brandprodct1);
	}

	public void Clickon_OtherBrandName() {
		driver.findElement(Babyhug).click();
	}

	public void VerifyUserNavigated_AnotherBrandpage_AndProductsVisible() {
		String Otherbrand = driver.findElement(Babyhugpage).getText();
		System.out.println("The displayed brandpage :" + Otherbrand);
		String brandprodct2 = driver.findElement(Babyhugproduct).getText();
		System.out.println("The displayed brandproducts :" + brandprodct2);
	}

	public void Add_thoseProducts_ToCart() {
		driver.findElement(Addproduct).click();
		driver.findElement(ContinueShopping).click();
	}

	public void Verify_WriteYourReview_IsVisible() {
		String review = driver.findElement(WriteReview).getText();
		System.out.println("Write your review is visible :" + review);
	}

	public void EnterName_email_Review() {
		WebElement reviewname = driver.findElement(Name);
		reviewname.click();
		reviewname.sendKeys("premalatha", Keys.TAB);
		driver.findElement(Mail).sendKeys("prema.dgl@gmail.com", Keys.TAB);
		driver.findElement(ProdReview).sendKeys("good product");
	}

	public void ClickSubmit_ForReviewButton() throws InterruptedException {

		WebElement submit = driver.findElement(SubmitReview);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click()", submit);
		Thread.sleep(2000);
	}

	public void VerifySuccessMessage_Review() {

		String successalert = driver.findElement(SuccessReview)
				.getText();
		System.out.println("Review Success message :" + successalert);

	}

}