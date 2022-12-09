package Runner;

import org.junit.runner.RunWith;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;


@RunWith(Cucumber.class)
@CucumberOptions(
        
        features = ".\\Features\\AddCity.feature",
        glue="Step_Defination",
        dryRun=false,
        monochrome=true
        
        )

public class AddCity_Runner {

}
