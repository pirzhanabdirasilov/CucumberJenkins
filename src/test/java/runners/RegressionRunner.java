package runners;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"pretty",
                "html:target/default-cucumber-reports",
                "json:target/cucumber.json"
        },
        features = {" "},
        glue = {"com/imoving/step_defs"},
        tags = {"@Regression"},
        monochrome = true,
        strict = true,
        dryRun = false
)
public class RegressionRunner {

}
