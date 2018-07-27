import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;


@CucumberOptions(
        features = {"src/test/features"},
        glue = {"stepdefinition"},
        plugin = { "pretty","json:target/cucumber.json"},
        tags={"@a"})
public class CucumberRunner extends AbstractTestNGCucumberTests {
    @BeforeMethod(alwaysRun = true)
    public void setUp(){

    }


    @AfterMethod(alwaysRun = true)
    public void tearDown() {
        System.out.println("After Method");

    }
}

