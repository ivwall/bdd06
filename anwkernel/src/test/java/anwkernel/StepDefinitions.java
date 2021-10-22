package anwkernel;

import io.cucumber.java.After;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.junit.Assert.*;

public class StepDefinitions {

    WebDriver driver;
    String chromedriver_exe = "D://2021//1022-cuwebnapi//bdd06//anwkernel//target//dependancy//chromedriver.exe";

    @Given("^Open the Chrome and launch the application$")				
    public void open_the_Chrome_and_launch_the_application() throws Throwable {		
        System.setProperty("webdriver.chrome.driver", chromedriver_exe);					
        driver= new ChromeDriver();					
        driver.manage().window().maximize();			
        driver.get("http://demo.guru99.com/v4");
    }		

    @When("^Enter the Username and Password$")				
    public void enter_the_Username_and_Password() throws Throwable {		
        driver.findElement(By.name("uid")).sendKeys("username12");							
        driver.findElement(By.name("password")).sendKeys("password12");							
     }		

    @Then("^Reset the credential$")				
    public void reset_the_credential() throws Throwable {		
        driver.findElement(By.name("btnReset")).click();					
    }		

    // looking for the cheese
 
    @Given("^Open Chrome and set to google$")				
    public void open_Chrome_and_set_to_google() throws Throwable {		
        System.setProperty("webdriver.chrome.driver", chromedriver_exe);					
        driver= new ChromeDriver();					
        driver.manage().window().maximize();			
        driver.get("https://google.com/ncr");
    }		

    @When("^Enter cheese into search$")				
    public void enter_cheese_into_search() throws Throwable {		
        driver.findElement(By.name("q")).sendKeys("cheese");
    }		

    @Then("^Hit enter$")				
    public void hit_enter() throws Throwable {		
        driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
    }		

}
