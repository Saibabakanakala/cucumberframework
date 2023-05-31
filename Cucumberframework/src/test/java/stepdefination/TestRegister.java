package stepdefination;



import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeStep;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TestRegister {
	//WebDriver driver;

	@Before
	public void open() {
		System.out.println("open browser");
		
	}
	@After
	public void close() {
		System.out.println("close the browser");
	}
	@BeforeStep
	public void data() {
		System.out.println("open the data");
		
	}
	@AfterStep
	public void step() {
		System.out.println("open the step");
		
	}
	
	
	@Given("user navigate the Register Account page")
	public void user_navigate_the_register_account_page() {
		System.out.println("Step1:user navigate the Register Account page");
//		ChromeOptions option = new ChromeOptions();
//		option.addArguments("--remote-allow-origins=*");
//		WebDriverManager.chromedriver().setup();
//		driver = new ChromeDriver(option);
//		driver.manage().window().maximize();
//		driver.get("https://tutorialsninja.com/demo/index.php?route=account/register");

	}

	@When("user enters{string}Firstname field")
	public void user_enters_Firstname_field(String fname) {
		System.out.println("Step2:user enters Firstname field:"+fname);
	
	}

	@When("user enters {string}Lastname field")
	public void user_enters_kanakala_Lastname_field(String lname) {
		System.out.println("Step3:user enters Lastname field:"+lname);
		
	}

	@When("user enters {string}Email field")
	public void user_enters_sainaidukanakala_gmail_com_email_field(String Email) {
		System.out.println("Step4:user enters Email field:"+Email);
		
	}

	@When("user enters {string}Telephone field")
	public void user_enters_telephone_field(String int1) {
		System.out.println("Step5:user enters Telephone field"+int1);
		
	}

	@When("user enters {string}password field")
	public void user_enters_sainaidu_password_field(String pwd) {
		System.out.println("Step:6user enters password field"+pwd);
		
	}

	@When("user enters {string}confirm password field")
	public void user_enters_sainaidu_confirm_password_field(String cpwd) {
		System.out.println("Step7:user enters confirm password field"+cpwd);
		
	}

	@Then("click on continue button")
	public void click_on_continue_button() {
		System.out.println("Step8:click on continue button");
		
	}
}
