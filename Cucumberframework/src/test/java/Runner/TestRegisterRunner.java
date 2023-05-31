package Runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="C:\\Users\\Hp\\eclipse-workspace\\Cucumberframework\\src\\main\\java\\Features\\Register.feature",glue= {"stepdefination"},

plugin ={"pretty","html:target/login1.html"})
public class TestRegisterRunner {
	

}
