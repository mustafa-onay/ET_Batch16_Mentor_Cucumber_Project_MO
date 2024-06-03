package com.euroTech.runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {
                "json:target/cucumber.json",  //burdaki rapor SADECE verify ile olusur (daha Detayli Rapor)
                "html:target/default-html-reports.html",// bu hem verify ile olusur hemde Run methoduyla
                "pretty", //bütün girilen bilgileri konsolda gösteriyor (süslü rapor)
                "rerun:target/rerun.txt" // basarisiz olan testlerimizi yerlerini gösteriyor rerun.txt dosyasi olusturarak
        },
        features = "src/test/resources/features",
        glue = "com/euroTech/step_definitions",
        dryRun = false,
        tags = "@wip"
)
public class CukesRunner {

}
