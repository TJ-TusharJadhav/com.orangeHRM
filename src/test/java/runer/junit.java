package runer;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(

				features =  {"feature\\login_FT.feature"},
//		tags="@Login1",
        glue={"Stepdefination"}	,
//      
        plugin= {"pretty", "html:target/cucumber-reports","html:target/cucumber-html-report"}
		
		
		
        
         )

public class junit  {

}
