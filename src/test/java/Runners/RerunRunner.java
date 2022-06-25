package Runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(

        features = "@target/rerun.txt", //package for futures that we have scenarios in
        glue = "StepDefinitions/com/amazon", // provide location of Step Definitions
        //        tags = {}
        dryRun = false // Dry run means, it will check if scenario is ready to run
)
public class RerunRunner {

}