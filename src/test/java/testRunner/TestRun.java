package testRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;



//main source file all execution start from here
//all step definition feature file all run from here

//if you want all feature file just pass folder name
//if you have some more feature file put , and give name
//glue keyword used for step definition file
//rerun use to run the failure test cases

@RunWith(Cucumber.class)
@CucumberOptions(
		features= {".//FeatureFiles"},
		glue="stepDefinitions",
		plugin= {"pretty",  //console output
				"html:reports/myreportCucumber.html", //name of report
				"rerun:target/rerun.txt", //run fail scenarios only
				"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:" //for generating report there is no listener it is used to generate report
				},
		//tags="@sanity",
		
		//actual execution not done if dry run is true
		dryRun=false,//to check every methods in feature file is implemented in  step definition
		monochrome = true,//remove junk characters from console output
		publish=true//share report to team gives url of report on console
		
	//	tags="@sanity"//this will execute scenarios tagged with sanity in feature files

		)
public class TestRun{
	

}

