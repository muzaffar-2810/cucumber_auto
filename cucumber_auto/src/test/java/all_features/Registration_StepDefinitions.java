package all_features;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Registration_StepDefinitions {
public WebDriver driver;
	
	@Given("^The user has to be in register page$")
	public void the_user_has_to_be_in_register_page() throws Exception {
	    driver = new ChromeDriver();
		driver.get("http://127.0.0.1:5000/register");
		Thread.sleep(1000);
	}

	@When("the user enters a new username in username text field")
	public void the_user_enters_a_new_username_in_username_text_field() throws InterruptedException {
	    WebElement usernameTF = driver.findElement(By.xpath("//input[@name='name']"));
	    usernameTF.sendKeys("MUZZZ12w");
	    Thread.sleep(1000);
	}

	@When("the user enters a new password in password text field")
	public void the_user_enters_a_new_password_in_password_text_field() throws InterruptedException {
		WebElement usernameTF = driver.findElement(By.xpath("//input[@name='password']"));
	    usernameTF.sendKeys("MUZ3");
	    Thread.sleep(1000);
	}

	@When("^the user clicks on register button$")
	public void the_user_clicks_on_register_button() throws InterruptedException {
	    WebElement registerButton = driver.findElement(By.xpath("//button[text()='Register']"));
	    registerButton.click();
	    Thread.sleep(1000);
	}

	@Then("^the user should be navigated to the login page of ecoders website$")
	public void the_user_should_be_navigated_to_the_login_page_of_ecoders_website() throws InterruptedException {
	    String actualLoginPageTitle = driver.getTitle();
	    String expectedLoginPageTitle = "FLASK-CRUD_APP_login_page.";
	    if(actualLoginPageTitle.equals(expectedLoginPageTitle)) {
	    	System.out.println("Testcases passed: User is successfully regstered and Login page is displayed and verified upon its title");
	    }
	    else {
	    	System.out.println("Testcases failed: Title did not matched, User did not get regstered and Login page is not displayed");
		}
	    Thread.sleep(1000);
	    driver.quit();
	}
	

	@Given("^The user has to be in login page$")
	public void the_user_has_to_be_in_login_page() throws InterruptedException {
	    driver = new ChromeDriver();
		driver.get("http://127.0.0.1:5000/login");
		Thread.sleep(1000);
	}

	@When("^the user enters a valid username in username text field$")
	public void the_user_enters_a_valid_username_in_username_text_field() throws InterruptedException {
	    WebElement usernameTF = driver.findElement(By.xpath("//input[@name='name']"));
	    usernameTF.sendKeys("m");
	    Thread.sleep(1000);
	}

@When("^the user enters a valid password in password text field$")
public void the_user_enters_a_valid_password_in_password_text_field() throws InterruptedException {
	WebElement usernameTF = driver.findElement(By.xpath("//input[@name='password']"));
    usernameTF.sendKeys("123");
    Thread.sleep(1000);
}

@When("^the user clicks on sign in button$")
public void the_user_clicks_on_sign_in_button() throws InterruptedException {
    WebElement signinButton = driver.findElement(By.xpath("//button[@class='btn text-light']"));
    signinButton.click();
    Thread.sleep(1000);
}

@Then("^the user should be navigated to the Dashbord page of ecoders website$")
public void the_user_should_be_navigated_to_the_dashbord_page_of_ecoders_website() throws InterruptedException {
    String actualLoginPageTitle = driver.getTitle();
    String expectedLoginPageTitle = "FLASK-CRUD_APP_Dashboard_page.";
    if(actualLoginPageTitle.equals(expectedLoginPageTitle)) {
    	System.out.println("Testcases passed: User is successfully logged in and verified upon its title");
    }
    else {
    	System.out.println("Testcases failed: Title did not matched, Dashboard page is not displayed");
	}
    Thread.sleep(1000);
    driver.quit();
}


//@Given("^The user has to be in login page$")
//public void the_user_has_to_be_in_login_page() throws InterruptedException {
//    driver = new ChromeDriver();
//	driver.get("http://127.0.0.1:5000/login");
//	Thread.sleep(1000);
//}

@When("^the user enters a invalid username in username text field$")
public void the_user_enters_a_invalid_username_in_username_text_field() throws InterruptedException {
    WebElement usernameTF = driver.findElement(By.xpath("//input[@name='name']"));
    usernameTF.sendKeys("mmmmmmmmmmmmmmm");
    Thread.sleep(1000);
}

@When("^the user enters a invalid password in password text field$")
public void the_user_enters_a_invalid_password_in_password_text_field() throws InterruptedException {
	WebElement usernameTF = driver.findElement(By.xpath("//input[@name='password']"));
    usernameTF.sendKeys("123jgjhgkhjgkjgkjgkjhgkjhgkjh");
    Thread.sleep(1000);
}

@Then("^the user should not be navigated to the Dashbord page of ecoders website$")
public void the_user_should_not_be_navigated_to_the_dashbord_page_of_ecoders_website() throws InterruptedException {
    String actualLoginPageTitle = driver.getTitle();
    String expectedLoginPageTitle = "FLASK-CRUD_APP_login_page.";
    if(actualLoginPageTitle.equals(expectedLoginPageTitle)) {
    	System.out.println("Testcases passed: User is still in Login page and verified upon its title");
    }
    else {
    	System.out.println("Testcases failed: Title did not matched, and Login page is not displayed");
	}
    Thread.sleep(1000);
    driver.quit();
}
}
