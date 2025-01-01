package Runnerpktestcase;

import org.junit.runner.RunWith;



import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;



@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/java/folder/test.feature",glue = "Stepdef",tags = "@testcase9")
public class Runnerclasstestcase {


}  