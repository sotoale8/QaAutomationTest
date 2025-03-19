package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class HomePage {

    WebDriver driver;
    WebDriverWait wait;

       By riskButtonLocator = By.xpath("/html[1]/body[1]/app-root[1]/div[1]/div[1]/app-sidebar[1]/div[1]/ul[1]/li[5]/div[1]");
       By createNewRiskButtonLocator = By.xpath("//button[@class='']");
       By riskNameLocator = By.xpath("//input[@id='name']");

       By riskImpactSelectLocator= By.xpath("//div[@id='mat-select-value-5']");
       By riskImpactInsi= By.xpath("//span[normalize-space()='Insignificante']");

       By riskFrecuencySelectLocator= By.xpath("//div[@id='mat-select-value-7']");
       By riskFrecuencyImpro= By.xpath("//span[normalize-space()='Improbable']");

       By createRiskButtonLocator = By.xpath("//p[normalize-space()='Crear']");

     //Constructor
    public HomePage(WebDriver driver){
        this.driver=driver;
        this.wait= new WebDriverWait(driver, Duration.ofSeconds(10));
    }

   private WebElement waitElement(By locator){
        return wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
   }
    public void clickRisk(){
        WebElement riskButtonElement= waitElement(riskButtonLocator);
        riskButtonElement.click();
    }
    public void clickCreateNewRisk(){
        WebElement createNewRiskButtonElement= waitElement(createNewRiskButtonLocator);
        createNewRiskButtonElement.click();
    }



    public void enterRiskName(String username) {
        WebElement usernameElement = waitElement(riskNameLocator);  // Espera hasta que el campo de usuario sea visible
        usernameElement.sendKeys(username);
    }

    public void selectRiskImpact(){
        WebElement riskImpactElement= waitElement(riskImpactSelectLocator);
        riskImpactElement.click();
    }
    public void selectRiskImpactOpcion1(){
        WebElement riskImpactOpcion1= waitElement(riskImpactInsi);
        riskImpactOpcion1.click();
    }

    public void selectRiskFrecuency(){
        WebElement riskFrecuencyElement= waitElement(riskFrecuencySelectLocator);
        riskFrecuencyElement.click();
    }
    public void selectRiskFrecuencyOpcion1(){
        WebElement riskFrecuencyOpcion1= waitElement(riskFrecuencyImpro);
        riskFrecuencyOpcion1.click();
    }



    public void clickCreateRisk() {
        WebElement createButton = waitElement(createRiskButtonLocator);  // Espera hasta que el botón de login sea visible y clickeable
        createButton.click();
    }
}
