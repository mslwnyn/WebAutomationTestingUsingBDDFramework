package za.co.tshimx.runner;

import org.junit.runner.RunWith;

@RunWith(io.cucumber.junit.Cucumber.class)
@io.cucumber.junit.CucumberOptions(
        features = "./src/test/java/za/co/tshimx/features",
        glue={"za.co.tshimx.stepdefs"},
        tags = "@web",
        plugin = {"json:target/cucumber.json","html:target/site/cucumber-pretty"}


)
public class TestRunner {


}
