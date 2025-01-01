package Stepdef;

import java.awt.AWTException;

import org.openqa.selenium.By;

import basepktestcase.baseclasstestcase;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import junit.framework.Assert;
import pompaktestcase.Accountcreatedclass;
import pompaktestcase.Accountdetailsclass;
import pompaktestcase.CartpageClass;
import pompaktestcase.ContactUspage;
import pompaktestcase.Paymentpageclass;
import pompaktestcase.ProductsPageclass;
import pompaktestcase.homepageclass;
import pompaktestcase.loginPageclass;
import pompaktestcase.testcasepage;

public class stepclasstestcase extends baseclasstestcase {

	homepageclass hm = new homepageclass();
	Accountdetailsclass ac = new Accountdetailsclass();
	Accountcreatedclass cr = new Accountcreatedclass();
	ContactUspage con = new ContactUspage();
	ProductsPageclass pro = new ProductsPageclass();
	CartpageClass cart = new CartpageClass();
	loginPageclass log = new loginPageclass();
	Paymentpageclass pay = new Paymentpageclass();
	testcasepage ts = new testcasepage();

	@Given("User Launch the browser")
	public void user_launch_the_browser() {

		Browserlaunch();
		Maximize();

	}

	@Then("Navigate to automation exercise url")
	public void navigate_to_automation_exercise_url() {

		WebsiteUrl("https://automationexercise.com/");

	}

	@Then("Verify that home page is visible successfully")
	public void verify_that_home_page_is_visible_successfully() throws InterruptedException {
		Implicitlywait();
		hm.verifyhomepage();
		Thread.sleep(2000);

	}

	@Then("User Click on Signup or Login button")
	public void user_click_on_signup_login_button() {
		Implicitlywait();
		hm.ClickSignup_or_loginbutton();

	}

	@Then("Verify New User Signup is visible")
	public void verify_new_user_signup_is_visible() {
		Implicitlywait();
		log.Verify_NewUserSignup();

	}

	@Then("User Enter name and email address")
	public void user_enter_name_and_email_address() {
		Implicitlywait();
		log.Entername_and_Email();

	}

	@Then("Click Signup button")
	public void click_signup_button() {
		Implicitlywait();
		log.ClickSignup_button();

	}

	@Then("Verify that ENTER ACCOUNT INFORMATION is visible")
	public void verify_that_enter_account_information_is_visible() {
		Implicitlywait();
		ac.Verify_EnterAccountInformation();

	}

	@Then("User  Select Mr or Mrs")
	public void user_select_mr_or_mrs() {
		Implicitlywait();
		ac.Select_Mr_or_Mrs();
	}

	@Then("Enter the password")
	public void enter_the_password() {
		Implicitlywait();
		ac.Enter_Password();
	}

	@Then("choose Date of birth")
	public void choose_date_of_birth() {
		Implicitlywait();
		ac.Choose_DateofBirth();

	}

	@Then("Select checkbox Sign up for our newsletter!")
	public void select_checkbox_sign_up_for_our_newsletter() {
		Implicitlywait();
		ac.SelectCheckbox_Newsletter();
	}

	@Then("Select checkbox Receive special offers from our partners!")
	public void select_checkbox_receive_special_offers_from_our_partners() {
		Implicitlywait();
		ac.SelectCheckbox_Specialoffers();
	}

	@Then("User Enter Firstname and lastname")
	public void user_enter_firstname_and_lastname() {
		Implicitlywait();
		ac.Enter_FirstnameAndLastname();
	}

	@Then("User Enter company, address and address2")
	public void user_enter_company_address_and_address2() {
		Implicitlywait();
		ac.EnterCompany_Address_Address2();
	}

	@Then("User Enter State,City,Zipcode and mobilenumber")
	public void user_enter_state_city_zipcode_and_mobilenumber() {
		Implicitlywait();
		ac.EnterState_City_Zipcode_mobilenumber();
	}

	@Then("Click Create Account button")
	public void click_create_account_button() {
		Implicitlywait();
		ac.Click_CreateAccountbutton();
	}

	@Then("Verify that ACCOUNT CREATED is visible")
	public void verify_that_account_created_is_visible() {
		Implicitlywait();
		cr.Verify_Accountcreated();

	}

	@Then("Click Continue button")
	public void click_continue_button() {
		Implicitlywait();
		cr.ClickContinue();
	}

	@Then("Verify that Logged in as username is visible")
	public void verify_that_logged_in_as_username_is_visible() {
		Implicitlywait();
		cr.VerifyLoggedin();
	}

	@Then("Click Delete Account button")
	public void click_delete_account_button() {
		Implicitlywait();
		cr.Click_DeleteAccount();
	}

	@Then("Verify Login to your account is visible")
	public void verify_login_to_your_account_is_visible() {
		Implicitlywait();
		log.Verify_LoginToYour_Account();
	}

	@Then("User Enter correct email address and password")
	public void user_enter_correct_email_address_and_password() {
		Implicitlywait();
		log.EnterCorrect_EmailIdPassword();
	}

	@Then("Click login button")
	public void click_login_button() {
		Implicitlywait();
		log.Click_LoginButton();
	}

	@Then("User Enter incorrect email address and password")
	public void user_enter_incorrect_email_address_and_password() {
		Implicitlywait();
		log.EnterIncorrect_Emailpassword();
	}

	@Then("Verify error Your email or password is incorrect is visible")
	public void verify_error_your_email_or_password_is_incorrect_is_visible() {
		Implicitlywait();
		log.Verify_EmailPassword_isIncorrect();

	}

	@Then("User Click Logout button")
	public void user_click_logout_button() {
		Implicitlywait();
		hm.Click_LogoutButton();
	}

	@Then("Verify that user is navigated to login page")
	public void verify_that_user_is_navigated_to_login_page() {
		Implicitlywait();
		log.VerifyUser_navigated_Loginpage();
	}

	@Then("User Enter name and already registered email address")
	public void user_enter_name_and_already_registered_email_address() {
		Implicitlywait();
		log.Enter_Alreadyregistered_NameandEmail();
	}

	@Then("Verify error Email Address already exist is visible")
	public void verify_error_email_address_already_exist_is_visible() {
		Implicitlywait();
		log.Verify_Email_AlreadyExists();
	}

	@Then("User Click on Contact Us button")
	public void user_click_on_contact_us_button() {
		Implicitlywait();
		con.Click_Contactus();
	}

	@Then("Verify GET IN TOUCH is visible")
	public void verify_get_in_touch_is_visible() {
		Implicitlywait();
		con.Verify_GetInTouch();
	}

	@Then("Enter name, email, subject and message")
	public void enter_name_email_subject_and_message() {
		Implicitlywait();
		con.EnterName_Email_Subject_Message();
	}

	@Then("Upload file")
	public void upload_file() throws AWTException, InterruptedException {
		Implicitlywait();
		con.Upload_File_fromPC();
		Thread.sleep(2000);
	}

	@Then("Click Submit button")
	public void click_submit_button() throws InterruptedException, AWTException {
		Implicitlywait();
		con.Click_SubmitButton();
		Thread.sleep(2000);
	}

	@Then("Click OK button")
	public void click_ok_button() {
		Implicitlywait();
		con.Click_OKButton();
	}

	@Then("Verify success message Success! Your details have been submitted successfully is visible")
	public void verify_success_message_success_your_details_have_been_submitted_successfully_is_visible() {
		Implicitlywait();
		con.Verify_SuccessMessage();
	}

	@Then("Click Home button")
	public void click_home_button() {
		Implicitlywait();
		con.Click_HomeButton();

	}

	@Then("verify that landed to home page successfully")
	public void verify_that_landed_to_home_page_successfully() {
		Implicitlywait();
		con.Verify_LandedToHomepage();

	}

	@Then("User Click on Test Cases button")
	public void user_click_on_test_cases_button() {
		Implicitlywait();
		hm.Click_TestCases();

	}

	@Then("Verify user is navigated to test cases page successfully")
	public void verify_user_is_navigated_to_test_cases_page_successfully() {
		Implicitlywait();
		ts.Verify_UserNavigated_testpage();

	}

	@Then("Click on Products button")
	public void click_on_products_button() {
		Implicitlywait();
		hm.Click_Productsbutton();
	}

	@Then("Verify user is navigated to ALL PRODUCTS page successfully")
	public void verify_user_is_navigated_to_all_products_page_successfully() {
		Implicitlywait();
		pro.Verify_Usernavigated_Allproductspage();
	}

	@Then("Verify the products list is visible")
	public void verify_the_products_list_is_visible() {
		Implicitlywait();
		pro.verify_ProductsList();
	}

	@Then("Click on View Product of first product")
	public void click_on_view_product_of_first_product() {
		Implicitlywait();
		pro.Click_ViewProduct_FirstProduct();
	}

	@Then("Verify User is landed to product detail page")
	public void verify_user_is_landed_to_product_detail_page() {
		Implicitlywait();
		pro.Verify_UserLanded_productDetail();
	}

	@Then("Verify that productname and category is visible")
	public void verify_that_productname_and_category_is_visible() {
		Implicitlywait();
		pro.Verify_ProductnameAndCategory();
	}

	@Then("verify that price and availability is visible")
	public void verify_that_price_and_availability_is_visible() {
		Implicitlywait();
		pro.Verify_Price_And_Availability();
	}

	@Then("verify that condition and Brand is visible")
	public void verify_that_condition_and_brand_is_visible() {
		Implicitlywait();
		pro.Verify_ConditionAndBrand();
	}

	@Then("Enter product name and Click search button")
	public void enter_product_name_and_click_search_button() throws InterruptedException {
		Implicitlywait();
		pro.EnterProductname_And_ClickSearch();
		Thread.sleep(2000);
	}

	@Then("Verify SEARCHED PRODUCTS is visible")
	public void verify_searched_products_is_visible() throws InterruptedException {
		Implicitlywait();
		pro.Verify_Searchedproducts_visible();
		Thread.sleep(2000);
	}

	@Then("Verify all the products related to search are visible")
	public void verify_all_the_products_related_to_search_are_visible() throws InterruptedException {
		Implicitlywait();
		pro.Verify_Allproducts_relatedtoSearch_visible();
		Thread.sleep(2000);
	}

	@Then("Scroll down to footer")
	public void scroll_down_to_footer() throws AWTException {
		Implicitlywait();
		hm.Scrolldown_To_Footer();
	}

	@Then("Verify text SUBSCRIPTION")
	public void verify_text_subscription() {
		Implicitlywait();
		hm.Verify_Text_Subscription();
	}

	@Then("Enter email address in input and click arrow button")
	public void enter_email_address_in_input_and_click_arrow_button() {
		Implicitlywait();
		hm.EnterEmail_And_ClickArrow();
	}

	@Then("Verify success message You have been successfully subscribed is visible")
	public void verify_success_message_you_have_been_successfully_subscribed_is_visible() {
		Implicitlywait();
		hm.Verify_SuccessMessage();
	}

	@Then("User Click Cart button")
	public void user_click_cart_button() {
		Implicitlywait();
		hm.Click_CartButton();
	}

	@Then("User Hover over first product and click Add to cart")
	public void user_hover_over_first_product_and_click_add_to_cart() {
		Implicitlywait();
		pro.MouseHover_Firstproduct();
		pro.Click_AddToCArt1();
	}

	@Then("Click Continue Shopping button")
	public void click_continue_shopping_button() {
		Implicitlywait();
		pro.Click_ContinueShopping();

	}

	@Then("User Hover over second product and click Add to cart")
	public void user_hover_over_second_product_and_click_add_to_cart() {
		Implicitlywait();
		pro.MouseHover_SecondProduct();
		pro.Click_AddToCart2();

	}

	@Then("Click View Cart button")
	public void click_view_cart_button() {
		Implicitlywait();
		pro.Click_Viewcart_button();
	}

	@Then("Verify both products are added to Cart")
	public void verify_both_products_are_added_to_cart() {
		Implicitlywait();
		pro.Verify_BothProducts_InCart();
	}

	@Then("Verify their prices, quantity and total price")
	public void verify_their_prices_quantity_and_total_price() {
		Implicitlywait();
		pro.VerifyPrice_Quantity_TotalPrice();
	}

	@Then("Click View Product for any product on home page")
	public void click_view_product_for_any_product_on_home_page() {
		Implicitlywait();
		pro.Click_ViewProduct_FirstProduct();
	}

	@Then("Verify product detail is opened")
	public void verify_product_detail_is_opened() {
		Implicitlywait();
		pro.Verify_ProductDetail_IsOpened();
	}

	@Then("Increase quantity to four")
	public void increase_quantity_to_four() {
		Implicitlywait();
		pro.Increase_Quantity_ToFour();
	}

	@Then("User Click Add to cart button")
	public void user_click_add_to_cart_button() {
		Implicitlywait();
		pro.Clicking_AddToCart_AfterIncreasing();
	}

	@Then("Verify that product is displayed in cart page with exact quantity")
	public void verify_that_product_is_displayed_in_cart_page_with_exact_quantity() {
		Implicitlywait();
		pro.VerifyProductdisplayed_With_ExactQuantity();
	}

	@Then("User Add products to cart")
	public void user_add_products_to_cart() throws InterruptedException {
		Implicitlywait();
		hm.Add_Products_ToCart();
		Thread.sleep(2000);
	}

	@Then("Click Cart button")
	public void click_cart_button() {
		Implicitlywait();
		hm.Click_CartButton();
	}

	@Then("Verify that cart page is displayed")
	public void verify_that_cart_page_is_displayed() {
		Implicitlywait();
		cart.Verify_Cartpage_displayed();
	}

	@Then("Click Proceed To Checkout button")
	public void Click_proceed_to_checkout_button() {
		Implicitlywait();
		cart.Click_ProceedtoCheckout_Button();
	}

	@Then("Click Register or Login button")
	public void click_register_or_login_button() {
		Implicitlywait();
		cart.Click_Register_Or_LoginButton();
	}

	@Then("Fill all details in Signup and create account")
	public void fill_all_details_in_signup_and_create_account() {
		Implicitlywait();
		log.Entername_and_Email();
		log.ClickSignup_button();
		ac.Select_Mr_or_Mrs();
		ac.Enter_Password();
		ac.Choose_DateofBirth();
		ac.SelectCheckbox_Newsletter();
		ac.SelectCheckbox_Specialoffers();
		ac.Enter_FirstnameAndLastname();
		ac.EnterCompany_Address_Address2();
		ac.EnterState_City_Zipcode_mobilenumber();
		ac.Click_CreateAccountbutton();

	}

	@Then("Verify ACCOUNT CREATED and click Continue button")
	public void verify_account_created_and_click_continue_button() {
		Implicitlywait();
		cr.Verify_Accountcreated();
		cr.ClickContinue();
	}

	@Then("Verify Logged in as username at top")
	public void verify_logged_in_as_username_at_top() {
		Implicitlywait();
		cr.VerifyLoggedin();
	}

	@Then("Verify Address Details and Review Your Order")
	public void verify_address_details_and_review_your_order() {
		Implicitlywait();
		cart.Verify_Addressdetails_and_ReviewYourOrder();
	}

	@Then("Enter description in comment text area and click Place Order")
	public void enter_description_in_comment_text_area_and_click_place_order() {
		Implicitlywait();
		cart.EnterDescription_And_PlaceOrder();
	}

	@Then("Enter payment details: Name on Card, Card Number, CVC, Expiration date")
	public void enter_payment_details_name_on_card_card_number_cvc_expiration_date() {
		Implicitlywait();
		pay.Enter_PaymentDetails();

	}

	@Then("Click Pay and Confirm Order button")
	public void click_pay_and_confirm_order_button() {
		Implicitlywait();
		pay.Click_PayandConfirmOrder_Button();
	}

	@Then("Verify success message Your order has been placed successfully")
	public void verify_success_message_your_order_has_been_placed_successfully() throws InterruptedException {
		Implicitlywait();
		pay.VerifySuccessmessage_Orderplaced();
		Thread.sleep(2000);
	}

	@Then("Verify ACCOUNT DELETED and click Continue button")
	public void verify_account_deleted_and_click_continue_button() {
		Implicitlywait();
		cr.VerifyAccountDeleted();
		cr.ClickContinue();
	}

	@Then("Verify that the delivery address is same")
	public void verify_that_the_delivery_address_is_same() {
		Implicitlywait();
		cart.Verify_DeliveryAddress();
	}

	@Then("Verify that the billing address is same")
	public void verify_that_the_billing_address_is_same() {
		Implicitlywait();
		cart.Verify_BillingAddress();

	}

	@Then("Click Download Invoice button and verify invoice is downloaded successfully")
	public void click_download_invoice_button_and_verify_invoice_is_downloaded_successfully() {
		Implicitlywait();
		pay.Click_DownloadInvoice_And_VerifyInvoice();

	}

	@Then("Click X button corresponding to particular product")
	public void click_x_button_corresponding_to_particular_product() throws InterruptedException {
		Implicitlywait();
		cart.Click_X_Button_Forparticularproduct();
		Thread.sleep(2000);

	}

	@Then("Verify that product is removed from the cart")
	public void verify_that_product_is_removed_from_the_cart() {
		Implicitlywait();
		cart.Verify_ProductRemoved_Fromcart();

	}

	@Then("Verify that categories are visible on left side bar")
	public void verify_that_categories_are_visible_on_left_side_bar() {
		Implicitlywait();
		hm.Verify_Categories_Visible();

	}

	@Then("Click on Women category")
	public void click_on_women_category() throws AWTException {
		Implicitlywait();
		hm.ClickOn_WomenCategory();
	}

	@Then("Click on any category link under Women category")
	public void click_on_any_category_link_under_women_category() throws InterruptedException {
		Implicitlywait();
		hm.Clickon_Anycategory_InWomen();
		Thread.sleep(2000);
	}

	@Then("Verify that category page is displayed and confirm text WOMEN - TOPS PRODUCTS")
	public void verify_that_category_page_is_displayed_and_confirm_text_women_tops_products() {
		Implicitlywait();
		pro.VerifyCategorypage_And_TextWomenProducts();

	}

	@Then("click on any category link of Men category")
	public void Click_on_any_category_link_of_men_category() {
		Implicitlywait();
		pro.Clickon_AnyCategory_OfMenCategory();
	}

	@Then("Verify that user is navigated to MenJeans category page")
	public void verify_that_user_is_navigated_to_men_jeans_category_page() {
		Implicitlywait();
		pro.VerifyUser_Navigatedto_Menjeans_categoryPage();
	}

	@Then("Verify that Brands are visible")
	public void verify_that_brands_are_visible() {
		Implicitlywait();
		pro.Verify_Brands_Are_Visible();
	}

	@Then("Click on any brand name")
	public void click_on_any_brand_name() {
		Implicitlywait();
		pro.ClickOn_AnyBrandName();
	}

	@Then("Verify that user is navigated to brand page and brand products are displayed")
	public void verify_that_user_is_navigated_to_brand_page_and_brand_products_are_displayed() {
		Implicitlywait();
		pro.VerifyUserNavigated_Brandpage_and_Brandproducts_Visible();
	}

	@Then("On left side bar click on any other brand link")
	public void on_left_side_bar_click_on_any_other_brand_link() {
		Implicitlywait();
		pro.Clickon_OtherBrandName();
	}

	@Then("Verify that user is navigated to that brand page and can see products")
	public void verify_that_user_is_navigated_to_that_brand_page_and_can_see_products() {
		Implicitlywait();
		pro.VerifyUserNavigated_AnotherBrandpage_AndProductsVisible();
	}

	@Then("Add those products to cart")
	public void add_those_products_to_cart() {
		Implicitlywait();
		pro.Add_thoseProducts_ToCart();
	}

	@Then("Click Cart button and verify that products are visible in cart")
	public void click_cart_button_and_verify_that_products_are_visible_in_cart() {
		Implicitlywait();
		hm.Click_CartButton();
		cart.Verify_ProductsVisible_InCart();
	}

	@Then("Click Signup or Login button and submit login details")
	public void click_signup_or_login_button_and_submit_login_details() {
		Implicitlywait();
		hm.ClickSignup_or_loginbutton();
		log.EnterCorrect_EmailIdPassword();
		log.Click_LoginButton();
	}

	@Then("Again go to Cart page")
	public void again_go_to_cart_page() {
		Implicitlywait();
		hm.Click_CartButton();
	}

	@Then("Verify that those products are visible in cart after login as well")
	public void verify_that_those_products_are_visible_in_cart_after_login_as_well() {
		Implicitlywait();
		cart.Verify_ProductsVisible_InCart();
	}

	@Then("Click on View Product button")
	public void click_on_view_product_button() {
		Implicitlywait();
		pro.Click_ViewProduct_FirstProduct();
	}

	@Then("Verify Write Your Review is visible")
	public void verify_write_your_review_is_visible() {
		Implicitlywait();
		pro.Verify_WriteYourReview_IsVisible();
	}

	@Then("Enter name email and review")
	public void enter_name_email_and_review() {
		Implicitlywait();
		pro.EnterName_email_Review();
	}

	@Then("Click Submit for review button")
	public void click_submit_for_review_button() throws InterruptedException {
		Implicitlywait();
		pro.ClickSubmit_ForReviewButton();
	}

	@Then("Verify success message Thank you for your review")
	public void verify_success_message_thank_you_for_your_review() throws InterruptedException, AWTException {
		Implicitlywait();
		pro.VerifySuccessMessage_Review();
		Thread.sleep(2000);
	}

	@Then("Scroll to bottom of page")
	public void scroll_to_bottom_of_page() throws AWTException {
		Implicitlywait();
		hm.ScrollTo_BottomPage();
	}

	@Then("Verify RECOMMENDED ITEMS are visible")
	public void verify_recommended_items_are_visible() {
		Implicitlywait();
		hm.VerifyRecommendedItems_visible();
	}

	@Then("Click on Add To Cart on Recommended product")
	public void click_on_add_to_cart_on_recommended_product() throws InterruptedException {
		Implicitlywait();
		hm.AddToCart_RecommendedProduct();
		Thread.sleep(2000);
	}

	@Then("Click on View Cart button")
	public void click_on_view_cart_button() {
		Implicitlywait();
		hm.Clickon_ViewCart_button();
	}

	@Then("Verify that recommendedproduct is displayed in cart page")
	public void verify_that_recommendedproduct_is_displayed_in_cart_page() {
		Implicitlywait();
		cart.Verify_RecommendedProduct_CartPage();
	}
	
	@Then("Click on arrow at bottom right side to scrollup")
	public void click_on_arrow_at_bottom_right_side_to_scrollup()  {
	    Implicitlywait();
	    hm.Clickon_ArrowatBottom_rightside_To_Scrollup();
	}
	@Then("Verify text Full-Fledged practice website for Automation Engineers")
	public void verify_text_full_fledged_practice_website_for_automation_engineers() {
	    Implicitlywait();
	    hm.VerifyFullText_AutomationEngineers();
	}
	@Then("Scroll up page to top")
	public void scroll_up_page_to_top() throws AWTException {
	   Implicitlywait();
	   hm.ScrollUp_PagetoTop();
	}


	

}
