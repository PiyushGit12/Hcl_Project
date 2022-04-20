package Runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


@CucumberOptions(
        features = "src/test/resources/webElementTest.feature",
        glue = "StepsDefinitions",
        monochrome = true,
        plugin = {"pretty","html:target/MyReports/report.html",
                "json:target/MyReports/report.json"}

)
public class Home_page_run extends AbstractTestNGCucumberTests {
}
