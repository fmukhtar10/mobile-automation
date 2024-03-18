package tests;

import org.testng.annotations.Test;
import pages.HomePage;

public class SampleTest extends BaseTest {

    @Test(description = "Sample description")
    public void sampleTest() {
        HomePage homePage = new HomePage();

        homePage.checkTermsCondition();
        homePage.clickGetStarted();
        homePage.changeMode();
        homePage.skipCreateWallet();
    }

}