import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HelloSelenium {

	public static void main(String[] args) {

	System.setProperty("webdriver.chrome.driver", "C:\\Users\\stefa\\\\Documents\\Okeeei\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();

	// Heading to the address
	driver.get("https://www.oulu.fi/university/");
	// Getting the title of the page
	String title = driver.getTitle();
	
	//Check if title matches with "University of Oulu"
	if(title.equals("University of Oulu")) {
		//The title matched "University of Oulu"
		System.out.println("The title matches to \"University of Oulu\"");
	} else {
		//The title doesn't match "University of Oulu"
		System.out.println("The title doesn't match to \"University of Oulu\". The title is \"" + title + "\"");
	}

	//Check if the web page contains text "Thesis defense announcements"
	if(driver.getPageSource().contains("Thesis defence announcements")) {
		//The page contains the text "Thesis defense announcements"
		System.out.println("The page contains \"Thesis defense announcements\"");
	} else {
		//The page doesn't contain the text "Thesis defense announcements"
		System.out.println("The page doesn't contain \"Thesis defense announcements\"");
	}
	
	//closing the browser 
	driver.close();
	}
}
