package stepDefinitions;

import javax.print.DocFlavor.STRING;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;


public class LoginStepDefinition {
	WebDriver driver;
	
	@Given("^User is already on Login Page$")
	public void user_already_on_login_page() {
		System.setProperty("webdriver.chrome.driver", "C:\\seleniumdrivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://stg.new.edgesolutions.de");
			}
	@When("^title of login page is Koerber Digital$")
	public void title_of_login_page_is_Koerber_Digital() {
		String title = driver.getTitle();
		System.out.println(title);
		Assert.assertEquals("Koerber Digital", title);
	}
	
	@Then("^user enters username and password$")
	public void user_enters_username_and_password() {
		driver.findElement(By.name("username")).sendKeys("subashs@gmail.com");
		driver.findElement(By.name("password")).sendKeys("Berlin@432");
	}
	@Then("^user click on Login button$")
	public void user_click_on_Login_button() {
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/form/div[3]/button/span/span[2]")).click();
	}
	
	@Then("^user see login failure$")
	public void user_see_login_failure() {
		String actual_error= driver.findElement(By.xpath("//*[@id="root"]/div/form/div[4]")).actual_error;
		String expected_error= "Could not login\r\n" + "Please check if password and username are correct.";
		Assert.assertEquals(actual_error, expected_error);
		
		
	}


}
