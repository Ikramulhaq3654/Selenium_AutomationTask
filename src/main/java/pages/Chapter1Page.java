package pages;

import base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Chapter1Page extends BaseClass
{
    @FindBy(id = "divontheleft")
    WebElement pageText;

    @FindBy(linkText = "Chapter1")
    WebElement chapter1;

    public Chapter1Page()
    {
        PageFactory.initElements(driver, this);
    }

    public String verifyTextOnChapter1LinkPage()
    {
        chapter1.click();
        String text = pageText.getText();
        return text;
    }
}
