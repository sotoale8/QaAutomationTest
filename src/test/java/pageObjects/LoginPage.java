package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class LoginPage {

    WebDriver driver;
    WebDriverWait wait;

       By usernameLocator = By.xpath("//input[@id='email']");
       By passwordLocator = By.xpath("//input[@placeholder='8 + caracteres']");
       By loginButtonLocator = By.xpath("//button[@type='button']");
       By welcomeMessageLocator = By.xpath("//h5[normalize-space()='Hola, Alejandro']");


     //Constructor
    public LoginPage(WebDriver driver){
        this.driver=driver;
        this.wait= new WebDriverWait(driver, Duration.ofSeconds(10));
    }

   private WebElement waitElement(By locator){
        return wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
   }

    public void enterUsername(String username) {
        WebElement usernameElement = waitElement(usernameLocator);  // Espera hasta que el campo de usuario sea visible
        usernameElement.sendKeys(username);
    }

    public void enterPassword(String password) {
        WebElement passwordElement = waitElement(passwordLocator);  // Espera hasta que el campo de contraseña sea visible
        passwordElement.sendKeys(password);
    }

    public void submitLogin() {
        WebElement loginButtonElement = waitElement(loginButtonLocator);  // Espera hasta que el botón de login sea visible y clickeable
        loginButtonElement.click();
    }

    public String getMessage(){
        WebElement messageElement = waitElement(welcomeMessageLocator);
        return  messageElement.getText();
    }
}
