package stepDefinitions;

import io.appium.java_client.gecko.GeckoDriver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import utilities.Driver;

import java.util.List;

import static utilities.Driver.*;
import static utilities.ReusableMethods.scroll;

public class PaymentSteps {
     @Given("Online payment sitesine gidilir.")
    public void onlinePaymentSitesineGidilir() {
         WebElement element = getDriver().findElement(By.xpath("//android.widget.TextView[@content-desc=\"Chrome\"]"));
         element.click();
         WebElement element2 = getDriver().findElement(By.xpath("//android.widget.EditText[@resource-id=\"com.android.chrome:id/search_box_text\"]"));
         element2.sendKeys("https://tech.test.simpralink.com/");
         Actions action = new Actions(getDriver());
         action.sendKeys(Keys.ENTER).perform();
    }

    @And("Kullanıcı emailini girer.")
    public void kullanıcıEmailiniGirer() {
         WebElement element2 = getDriver().findElement(By.xpath("//android.widget.EditText[@resource-id=\"profile-email-input\"]"));
         element2.sendKeys("testdeneme@a.com");
         WebElement element3 = getDriver().findElement(By.xpath("//android.widget.EditText[@resource-id=\"profile-name-input\"]"));
         element3.sendKeys("testdeneme");
         WebElement element4 = getDriver().findElement(By.xpath("//android.widget.EditText[@resource-id=\"profile-surname-input\"]"));
         element4.sendKeys("denemetest");
    }

    @And("Kullanıcı ödeyeceği miktarı girdi.")
    public void kullanıcıÖdeyeceğiMiktarıGirdi() {
        WebElement element2 = getDriver().findElement(By.xpath("//android.widget.EditText[@resource-id=\"amount-input\"]"));
         element2.sendKeys("20");
    }

    @And("Kullanıcı kart bilgilerini girer.")
    public void kullanıcıKartBilgileriniGirer() {
        WebElement element2 = getDriver().findElement(By.xpath("//android.view.View[@resource-id=\"app\"]/android.view.View/android.view.View[1]/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View[2]/android.view.View/android.view.View[2]/android.widget.EditText"));
         element2.sendKeys("testdeneme");
         WebElement element3 = getDriver().findElement(By.xpath("//android.view.View[@resource-id=\"app\"]/android.view.View/android.view.View[1]/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View[3]/android.view.View/android.view.View[2]/android.widget.EditText"));
         element3.sendKeys("5163103002982563");
         WebElement element4 = getDriver().findElement(By.xpath("//android.view.View[@resource-id=\"app\"]/android.view.View/android.view.View[1]/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View[4]/android.view.View/android.view.View[2]/android.widget.EditText"));
         element4.sendKeys("12/26");
         WebElement element5 = getDriver().findElement(By.xpath("//android.view.View[@resource-id=\"app\"]/android.view.View/android.view.View[1]/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View[5]/android.view.View/android.view.View[2]/android.widget.EditText"));
         element5.sendKeys("000");
    }

    @When("Kullanıcı aydınlanma metnini onaylar.")
    public void kullanıcıAydınlanmaMetniniOnaylar() {
        List<WebElement> listName = getDriver().findElements(By.className("android.widget.CheckBox"));
        listName.get(2).click();
    }

    @Then("Kullanıcı ödeme yap butonuna tıklar.")
    public void kullanıcıÖdemeYapButonunaTıklar() {
        WebElement element2 = getDriver().findElement(By.xpath("//android.widget.Button[@text=\"PAY\"]"));
         element2.click();
        WebElement element3 = getDriver().findElement(By.xpath("//android.widget.Button[@resource-id=\"yes\"]"));
         element3.click();
    }

    @And("Aşağı az kaydırılır")
    public void aşağıAzKaydırılır() throws InterruptedException {
         scroll(Driver.getDriver(),0.2);
    }

    @And("Aşağı orta kaydırılır")
    public void aşağıOrtaKaydırılır() throws InterruptedException {
         scroll(Driver.getDriver(),5);
    }
    //getDriver().findElement(By.xpath("//android.widget.TextView[@text=\"Teşekkürler, Ödemeniz alınmıştır.\"]"));
    //android.widget.EditText[@resource-id="com.android.chrome:id/url_bar"]
    //android.widget.EditText[@resource-id="profile-email-input"]
    //android.widget.EditText[@resource-id="amount-input"]
    //extra
    //android.widget.EditText[@resource-id="profile-phone-input"]
    //android.widget.EditText[@resource-id="profile-name-input"]
    //android.widget.EditText[@resource-id="profile-surname-input"]
    //android.widget.EditText[@resource-id="note-input"]
    //extra
    //android.view.View[@resource-id="app"]/android.view.View/android.view.View[1]/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View[2]/android.view.View/android.view.View[2]/android.widget.EditText
    //android.view.View[@resource-id="app"]/android.view.View/android.view.View[1]/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View[3]/android.view.View/android.view.View[2]/android.widget.EditText
    //android.view.View[@resource-id="app"]/android.view.View/android.view.View[1]/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View[4]/android.view.View/android.view.View[2]/android.widget.EditText
    //android.view.View[@resource-id="app"]/android.view.View/android.view.View[1]/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View[5]/android.view.View/android.view.View[2]/android.widget.EditText
    //android.view.View[@resource-id="app"]/android.view.View/android.view.View[1]/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View[9]/android.view.View/android.view.View
    //android.widget.Button[@text="ÖDEME YAP"]
    //android.widget.Button[@resource-id="yes"]
    //android.widget.TextView[@text="Teşekkürler, Ödemeniz alınmıştır."]
}
