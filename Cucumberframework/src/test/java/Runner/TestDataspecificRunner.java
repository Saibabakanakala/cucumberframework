package Runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="C:\\Users\\Hp\\eclipse-workspace\\Cucumberframework\\src\\main\\java\\Features\\TestDataSpecificScenario.feature",glue= {"stepdefination"},

plugin ={"pretty","html:target/login2.html"})
public class TestDataspecificRunner {

}
