package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features",
        glue = "stepDefinitions",
        tags = "@gp1", // iki tag'ı aynı anda çalıştırmak isterseniz "@gp1 or @gp2"
        dryRun = false

)
public class Runner {


}
