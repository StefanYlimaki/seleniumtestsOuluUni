import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import static org.openqa.selenium.support.ui.ExpectedConditions.presenceOfElementLocated;

public class HelloSelenium {

	public static void main(String[] args) {

	System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\stefa\\\\Documents\\\\Okeeei\\\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();

	driver.get("https://www.oulu.fi/university/");
	//driver.findElement(By.id("L2AGLb")).sendKeys(Keys.ENTER);
   	//String title = driver.findElement(By.id("title-oy-logo-en")).getText();
	String title = driver.getTitle();
	//Check if title matches with University of Oulu
   	
	if(title.equals("University of Oulu")) {
		System.out.println("The title matches to \"University of Oulu\"");
	} else {
		System.out.println("The title doesn't match to \"University of Oulu\". The title is \"" + title + "\"");
	}

	if(driver.getPageSource().contains("Thesis defense announcements")) {
		System.out.println("The page contains \"Thesis defense announcements\"");
	} else {
		System.out.println("The page doesn't contain \"Thesis defense announcements\"");
	}
	
	//closing the browser 
	driver.close();
	}
	
}