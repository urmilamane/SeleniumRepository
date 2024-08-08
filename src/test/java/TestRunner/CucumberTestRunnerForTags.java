package TestRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(tags="@smoke and @regression or @perf and not @sanity", features= {"src/test/resources/FeatureWithTags"}, glue= {"StepDefinations"},
plugin= {"pretty","html:target/htmlreport.html"})
public class CucumberTestRunnerForTags extends AbstractTestNGCucumberTests{

}
