import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="Include/features/operations/AgentList.feature", glue="", plugin= ["pretty","html:ReportsFolder"],
dryRun =false, monochrome = false)
public class TestRunner {
}






