package stepdefination;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class TestSteps {
	WebDriver driver;
	@Given("open the url of ninja application")
	public void open_the_url_of_ninja_application() throws InterruptedException {
	 System.out.println("Step1:open the url of ninja application");
	 ChromeOptions option = new ChromeOptions();
		option.addArguments("--remote-allow-origins=*");
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver(option);
		driver.manage().window().maximize();
		driver.get("https://tutorialsninja.com/demo/index.php?route=account/login");
		Thread.sleep(2000);
	}	
	 
	@When("user enters username and password")
	public void user_enters_username_and_password() {
	System.out.println("Step2:user enters username and password");
	driver.findElement(By.id("input-email")).sendKeys("sainaidukanakala@gmail.com");
	driver.findElement(By.id("input-password")).sendKeys("Sainaidu@888");
	}

	@When("click on login button")
	public void click_on_login_button() {
		System.out.println("Step3:click on login button");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
	    
	}
	@Then("click on logout")
	public void click_on_logout() throws InterruptedException {
	    System.out.println("Step4:click on logout");
	    driver.findElement(By.xpath("//span[@class='caret']")).click();
	    Thread.sleep(3000);
	    driver.findElement(By.xpath("//ul[@class='dropdown-menu dropdown-menu-right']//a[normalize-space()='Logout']")).click();
	}

	
	
	
	
	

}
