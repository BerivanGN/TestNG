package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class MerchantLogin {

    public MerchantLogin() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    // Merchant Login Sayfasi / "Merchant Login" yazisi
    @FindBy(xpath = "//h6[@class='mb-4']")
    public WebElement merchantLoginYazisi;


    // Merchant Login Sayfasi / username box
    @FindBy(xpath = "//input[@id='AR_merchant_login_username']")
    public WebElement merchantUsernameBox;


    // Merchant Login Sayfasi / password box
    @FindBy(xpath = "//input[@id='AR_merchant_login_password']")
    public WebElement merchantPasswordBox;


    // Merchant Login Sayfasi / sign in box
    @FindBy(xpath = "//input[@class='btn btn-green btn-full']")
    public WebElement merchantSignInBox;

}
