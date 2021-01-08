package pages;


import base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends BaseClass
{
    @FindBy(linkText = "Chapter1")
    WebElement chapter1;

    @FindBy(linkText = "Home Page")
    WebElement homePagelink;

    @FindBy(className = "mainheading")
    WebElement HomePageHeading;


    public HomePage()
    {
        PageFactory.initElements(driver, this);
    }

    public String clickOnChapter1Link()
    {
        homePagelink.click();
        String HomePageTitle = HomePageHeading.getText();
        return HomePageTitle;
    }
}
