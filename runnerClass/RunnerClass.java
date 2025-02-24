package runnerClass;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


@CucumberOptions(features="src/main/java/features/DeleteLead.feature",glue="steps",publish=true,monochrome=true)
public class RunnerClass extends AbstractTestNGCucumberTests{

}