package stepDefinitions;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.PerformsTouchActions;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.offset.PointOption;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import utilities.Driver;
import utilities.ReusableMethods;
import static org.junit.Assert.assertTrue;
import static utilities.ReusableMethods.*;

public class cpSteps {
    @And("{int} sn beklenir.")
public void waitSecond(int seconds) {
    try {
        Thread.sleep(seconds * 1000L);

    } catch (InterruptedException e) {
        e.printStackTrace();
        }
    }

     @Given("kullanıcı emailini girer.")
  public void kullanıcıEmailiniGirer() throws InterruptedException {

         WebElement element = Driver.getDriver().findElement(By.xpath("//android.widget.EditText[@resource-id=\"username\"]"));
         element.sendKeys("gozsoy@protel.com.tr");
  }

    @And("kullanıcı şifresini girer.")
    public void kullanıcıŞifresiniGirer() {
        WebElement element = Driver.getDriver().findElement(By.xpath("//android.widget.EditText[@resource-id=\"password\"]"));
        element.sendKeys("Simpra34*");
    }

    @And("Sign in butonu tıklanır.")
    public void signInButonuTıklanır() {
         WebElement element = Driver.getDriver().findElement(By.xpath("//android.widget.Button[@resource-id=\"kc-login\"]"));
         element.click();
    }
    @Then("Aşağı kaydırılır")
    public void scrollDown() throws InterruptedException {
        scroll(Driver.getDriver(),2);
    }


    @And("CP tıklanır.")
    public void cpTıklanır() {

        WebElement element = Driver.getDriver().findElement(By.xpath("//android.view.View[@content-desc=\"test.checkandplace\"]"));
        //android.view.View[@content-desc="test.checkandplace"]
         element.click();
    }

    @And("Protel'e tıklanır.")
    public void protelETıklanır() {
        WebElement element = Driver.getDriver().findElement(By.xpath("//android.view.View[@text=\"Protelİş\"]"));
         element.click();
    }

    @And("{int} tıklanır.")
    public void tıklanır(int arg0) {
        WebElement element = Driver.getDriver().findElement(By.xpath("//android.view.View[@text=\"3700İstanbul\"]"));
         element.click();
    }

    @And("Bir daha gösterme tıklanır.")
    public void birDahaGöstermeTıklanır() {
        WebElement element = Driver.getDriver().findElement(By.xpath("//android.widget.Button[@text=\"Bir Daha Gösterme\"]"));
         element.click();
    }

    @And("Artı butonu tıklanır.")
    public void artıButonuTıklanır() {
         WebElement element = Driver.getDriver().findElement(By.xpath("//android.view.View[@resource-id=\"app\"]/android.view.View[3]/android.view.View[2]/android.view.View[2]/android.view.View/android.view.View[1]/android.widget.Button\n"));
         element.click();
    }

    @And("Rezervasyona tıklanır.")
    public void rezervasyonaTıklanır() {
        WebElement element = Driver.getDriver().findElement(By.xpath("//android.widget.Button[@text=\"Rezervasyon\"]"));
         element.click();
    }

    @Then("Müşteri isim yazma yerine tıklanır.")
    public void müşteriIsimYazmaYerineTıklanır() {
        WebElement element = Driver.getDriver().findElement(By.xpath("//android.view.View[@text=\"Müşteri Ad, Soyad, Telefon No Ara\"]"));
        element.click();
    }

    @Then("İsim yazılır.")
    public void i̇simYazılır() {
        //android.widget.EditText[@resource-id="customer-search-input"]
        WebElement element = Driver.getDriver().findElement(By.xpath("//android.widget.EditText[@resource-id=\"customer-search-input\"]"));
        element.sendKeys("Melisa Muslu");
        //android.view.View[@text="Melisa Muslu+90 (534) 848 04 80standard"]
    }

    @Then("Müşteriye tıklanır.")
    public void müşteriyeTıklanır() {
        WebElement element = Driver.getDriver().findElement(By.xpath("//android.view.View[@text=\"Melisa Muslu+90 (534) 848 04 80standard\"]"));
        element.click();
    }

    //android.widget.Button[@text="Saat Seçin"]
    //android.view.View[@text="17:15820/82"]
    //android.widget.Button[@text="Saat Seç ve Devam Et"]
    //android.view.View[@resource-id="app"]/android.view.View[4]/android.view.View/android.view.View/android.view.View[2]/android.view.View/android.view.View/android.view.View[7]
    // veya //android.widget.Button[@text="Rezervasyon Oluştur"]

}
