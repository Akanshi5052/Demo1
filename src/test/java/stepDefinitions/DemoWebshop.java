package stepDefinitions;

import org.testng.Assert;
import org.testng.AssertJUnit;
import java.util.concurrent.TimeUnit;
import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class DemoWebshop {
	static WebDriver driver;
	@Given("User launches the DemoWebshop App")
	public void user_launches_the_DemoWebshop_App() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\training_d2.03.07\\Downloads\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();

		//Navigate to the URL
		driver.get("http://demowebshop.tricentis.com/");

		//Maximize the window
		driver.manage().window().maximize();


	}

	@Then("User clicks on SignIn button")
	public void user_clicks_on_SignIn_button() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[1]/div[2]/div[1]/ul/li[1]/a")).click();
		
	}

	@Then("User provides the valid data for all the fields")
	public void user_provides_the_valid_data_for_all_the_fields() {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new cucumber.api.PendingException();
		
	
		driver.findElement(By.xpath(".//*[@for='gender-female']")).click();
		
		driver.findElement(By.xpath(".//*[@id='FirstName']")).sendKeys("Akanshi");
		driver.findElement(By.xpath(".//*[@id='LastName']]")).sendKeys("Srivastava");
		driver.findElement(By.xpath(".//*[@id='Email']")).sendKeys("abc123@gmail.com");
		driver.findElement(By.xpath(".//*[@name='Password']")).sendKeys("abc12345");
		driver.findElement(By.xpath(".//*[@name='ConfirmPassword']")).sendKeys("abc12345");
		
		
		
	}

	@When("User clicks in submit button at the end of the form")
	public void user_clicks_in_submit_button_at_the_end_of_the_form() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		driver.findElement(By.xpath(".//*[@type='submit']")).click();
	}

	@Then("Verifies the result of the registration")
	public void verifies_the_result_of_the_registration() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		Assert.assertTrue(driver.findElement(By.xpath(".//*[@class='account']")).equals("akanshi123@gmail.com"));
		
	}

	@Then("Prints the message")
	public void prints_the_message() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
//		String g=driver.findElement(By.xpath(".//*[@class='result']")).getText();
//		Assert.assertTrue(g.contains("Your registration completed"));
		driver.close();
	}

	@Given("Application launched by registered user")
	public void application_launched_by_registered_user() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		//driver.findElement(By.xpath(".//*[@value='Continue']")).click();
		
		driver.get("http://demowebshop.tricentis.com/");
	}

	@Then("User access the Login Link")
	public void user_access_the_Login_Link() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		//driver.findElement(By.xpath(".//*[@class='ico-logout']")).click();
		driver.findElement(By.xpath(".//*[@class='ico-login']")).click();
		
		
	}

	@Then("Provides the valid data as input")
	public void provides_the_valid_data_as_input() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		driver.findElement(By.xpath(".//*[@class='email']")).sendKeys("abc123@gmail.com");
		driver.findElement(By.xpath(".//*[@class='password']")).sendKeys("abc12345");
		driver.findElement(By.xpath(".//*[@value='Log in']")).click();
	}

	@Then("Verifies the login status")
	public void verifies_the_login_status() {
		Assert.assertTrue(driver.findElement(By.xpath(".//*[@class='account']")).equals("akanshi123@gmail.com"));
	    // Write code here that turns the phrase above into concrete actions
	   // throw new cucumber.api.PendingException();
		driver.close();
	}

}
