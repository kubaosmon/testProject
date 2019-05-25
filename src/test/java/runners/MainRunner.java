package runners;


import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(
        plugin = {"pretty",
                "html:target/cucumber-report",
                "json:target/cucumber.json"
        },
        tags = "@testAPI, @testUI",
        features= {"src/test/resources/features/"},
        glue="step_definitions/",
        dryRun=false
)


    public class MainRunner extends AbstractTestNGCucumberTests {
}
