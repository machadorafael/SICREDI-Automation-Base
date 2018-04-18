package br.com.sicredi.automation_web.tests;

import org.junit.ClassRule;
import org.junit.runner.RunWith;

import br.com.sicredi.automation_web.util.TestRule;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "classpath:features", 
		tags = "@login, @logout, @esqueciMinhaSenha",	 
		glue = "", 
		monochrome = false, 
		dryRun = false
)

public class RunTest {

	@ClassRule
	public static TestRule testRule = new TestRule();

}