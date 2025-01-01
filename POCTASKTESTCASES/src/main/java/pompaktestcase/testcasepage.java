package pompaktestcase;

import org.openqa.selenium.By;

import basepktestcase.baseclasstestcase;

public class testcasepage extends baseclasstestcase{
	
	public By Testpage = By.xpath("//b[text()=' Cases']");
	
	
	public void Verify_UserNavigated_testpage() {
		boolean testpage = driver.findElement(Testpage).isDisplayed();
		System.out.println("Testcase page is visible :" + testpage);

	}

}
