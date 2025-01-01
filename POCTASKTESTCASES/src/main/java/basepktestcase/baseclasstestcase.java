package basepktestcase;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class baseclasstestcase {

	public static WebDriver driver;

	public static void Browserlaunch() {
		driver = new ChromeDriver();
	}
	public static void WebsiteUrl(String url) {
		driver.get(url);
	}
	public static void Maximize() {
		driver.manage().window().maximize();
	}
	public static void Implicitlywait() {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	}

}
