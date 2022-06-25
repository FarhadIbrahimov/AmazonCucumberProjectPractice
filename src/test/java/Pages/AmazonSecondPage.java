package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utils.BasePage;

import java.util.List;

public class AmazonSecondPage extends BasePage {

    @FindBy(xpath = "//span[@class='a-size-medium a-color-base a-text-normal']")
    public List<WebElement> items;

    @FindBy(xpath = "//span[@id='submit.add-to-cart']")
    public WebElement addToCart;


    @FindBy(xpath = "//input[@id='add-to-cart-button']")
    public WebElement proceedToCheckout;

    @FindBy(xpath = "//button[@class=' a-button-close a-declarative']")
    public WebElement closeButton;

    @FindBy(xpath = "//span[@id='attachSiNoCoverage']//input[@type='submit']")
    public WebElement NoThanksButton;
}



