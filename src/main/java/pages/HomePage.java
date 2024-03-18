package pages;

import org.openqa.selenium.WebElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.testng.Assert;

public class HomePage extends BasePage {

    @AndroidFindBy(xpath = "//android.widget.Button")
    private WebElement getStartedButton;
    @AndroidFindBy(xpath = "//android.widget.TextView[@text=\"By tapping “Get Started” you agree and consent to our \n" +
            "Terms of Service and Privacy Policy\"]")
    private WebElement termsConditionText;

    @AndroidFindBy(xpath = "//androidx.compose.ui.platform.ComposeView/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.view.View[2]")
    private WebElement createWalletbutton;
    @AndroidFindBy(xpath = "//android.widget.TextView[@text=\"SKIP\"]")
    private WebElement skipbutton;
    @AndroidFindBy(className = "android.widget.Button")
    private WebElement settingbutton;
    @AndroidFindBy(xpath = "//android.widget.ScrollView/android.view.View[1]")
    private WebElement changeModebutton;





    public void clickGetStarted() {
        getStartedButton.click();
    }

    public void checkTermsCondition() {
        Assert.assertTrue(termsConditionText.isDisplayed());
        Assert.assertTrue(termsConditionText.getText().contains("Terms of Service and Privacy Policy"));
    }
    public void changeMode() {
        Assert.assertTrue(settingbutton.isDisplayed());
        settingbutton.click();
        Assert.assertTrue(changeModebutton.isDisplayed());
        changeModebutton.click();
        settingbutton.click();
        
    }

    public void skipCreateWallet() {
        Assert.assertTrue(createWalletbutton.isDisplayed());
        createWalletbutton.click();
        Assert.assertTrue(skipbutton.isDisplayed());
        skipbutton.click();

    }


}
