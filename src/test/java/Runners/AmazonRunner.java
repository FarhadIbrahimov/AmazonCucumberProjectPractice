package Runners;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"pretty", "html:target/cucumber-html-report",
                "json:target/cucumber.json", "junit:target/cucumber.xml",
                "rerun:target/rerun.txt"}, // some plugins
        features = "src/test/resources/features/com.amazon", //package for futures that we have scenarios in
        glue = "StepDefenitions/com/amazon", // provide location of Step Definitions
        tags = "@smoke", // or if you want to run two tags you can write to tag "@smoke and @search", and if you want to exclude some tag just wright "'desired tag' and not 'tag'"
        dryRun = false // Dry run means, it will check if scenario is ready to run
)

public class AmazonRunner {

}