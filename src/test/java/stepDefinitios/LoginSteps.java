package stepDefinitios;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.hc.core5.util.Asserts;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pageObjects.LoginPage;

public class LoginSteps {

    WebDriver driver;
    LoginPage loginPage;


    @Given("The user is in the login page")
    public void the_user_is_in_the_login_page(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://appweb.pirani.co/"); // Cambia la URL a tu página de login real
        loginPage = new LoginPage(driver);
    }


    @When("User enters valid credential and click on login button")
    public void userEntersValidCredentialAndClickOnLoginButton() {
        loginPage.enterUsername("sotoale8@gmail.com");
        loginPage.enterPassword("Contraseña.123");
        loginPage.submitLogin();
    }

    @Then("User should see the home page and welcome message")
    public void userShouldSeeTheHomePageAndWelcomeMessage() {

       Assertions.assertEquals("Hola, Alejandro",loginPage.getMessage());
       Assertions.assertEquals("https://appweb.pirani.co/dashboard/#/risk/home",driver.getCurrentUrl());

        driver.quit();

    }

}
