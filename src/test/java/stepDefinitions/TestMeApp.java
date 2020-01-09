package stepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class TestMeApp {
	static WebDriver driver;

	@Given("User launches the TestMeApp")
	public void user_launches_the_TestMeApp() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\training_d2.03.07\\Downloads\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();

		//Navigate to the URL
		driver.get("http://10.232.237.143:443/TestMeApp/loginhere.htm");

		//Maximize the window
		driver.manage().window().maximize();

	}

	@Given("User provides the valid Username {string}")
	public void user_provides_the_valid_Username(String string) {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new cucumber.api.PendingException();
		driver.findElement(By.xpath(".//*[@id='userName']")).sendKeys(string);
		
	}

	@Then("User provides valid password {string}")
	public void user_provides_valid_password(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		driver.findElement(By.xpath(".//*[@id='password']")).sendKeys(string);
	}

	@When("User clicks in login button at the end of the form")
	public void user_clicks_in_login_button_at_the_end_of_the_form() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		driver.findElement(By.xpath(".//*[@type='submit']")).click();
	}

	@When("User clicks on AllCategories")
	public void user_clicks_on_AllCategories() {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new cucumber.api.PendingException();
		driver.findElement(By.xpath("//*[@id=\"menu3\"]/li[2]/a")).click();
	}

	@Then("User clicks on Electronics")
	public void user_clicks_on_Electronics() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		driver.findElement(By.xpath("//*[@id=\"menu3\"]/li[2]/ul/li[1]/a/span")).click();
	}

	@Then("User clicks on Headphone")
	public void user_clicks_on_Headphone() {
	    // Write code here that turns the phrase above into concrete actions
//	    throw new cucumber.api.PendingException();
		driver.findElement(By.xpath("//*[@id=\"submenuul11290\"]/li[1]/a/span")).click();
	}

	@Then("User clicks on cart")
	public void user_clicks_on_cart() {
	    // Write code here that turns the phrase above into concrete actions
//	    throw new cucumber.api.PendingException();
		driver.findElement(By.xpath("/html/body/section/div/div/div[2]/div/div/div/div[2]/center/a")).click();
	}

	@Then("User clicks on remove")
	public void user_clicks_on_remove() {
	    // Write code here that turns the phrase above into concrete actions
//	    throw new cucumber.api.PendingException();
	}

}
