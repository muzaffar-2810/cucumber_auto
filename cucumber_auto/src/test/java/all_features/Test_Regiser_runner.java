package all_features;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		monochrome = true,
		features = {"src/test/resources/all_feature_files"},
				glue = {"all_features"},
				plugin = {"pretty",
						"html:target/cucumber-htmlreport1.html",
						"json:target/cucumber-report1.json",})
public class Test_Regiser_runner {

}
