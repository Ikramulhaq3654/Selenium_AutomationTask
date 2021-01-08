package test;

import base.BaseClass;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pages.Chapter1Page;
import pages.HomePage;

public class Chapter1PageTest extends BaseClass
{

    Chapter1Page chapter1Page;
    HomePage homePage;

    public Chapter1PageTest(){}

    @BeforeTest
    public void setUp()
    {
        OpenBrowser();
        chapter1Page = new Chapter1Page();
        homePage = new HomePage();

    }

    @Test
    public void verifyTextOnChapter1LinkPageTest()
    {

        String actualText = chapter1Page.verifyTextOnChapter1LinkPage();
        String expectedText = "Assert that this text is on the page";
        Assert.assertEquals(actualText, expectedText, "Actual Text is not matching with Expected Text");
        System.out.println("Passed > actualText is matching with Expected Text.");

        String actualHomePageTitle = homePage.clickOnChapter1Link();
        String expectedHomePageTitle = "Selenium: Beginners Guide";
        Assert.assertEquals(actualHomePageTitle, expectedHomePageTitle, "User is not redirected to Home Page");
        System.out.println("Passed > User is redirected to Home Page on clicking Home Page Link.");
    }

    @AfterTest
    public void tearDown()
    {
        driver.close();
        driver.quit();
    }
}
