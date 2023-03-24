package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class UserLogin {

    public UserLogin() {
        PageFactory.initElements(Driver.getDriver(), this);
    }


    //userLogin sayfasi username textbox butonu
    @FindBy(xpath = "(//*[@class='form-control form-control-text'])[1]")
    public WebElement usernameTextbox;

    @FindBy(xpath = "(//*[@class='form-control form-control-text'])[2]")
    public WebElement userpasswordTextbox;

    @FindBy(xpath = "//button[@class='btn btn-green w-100']")
    public WebElement userLoginSigninButonu;

    @FindBy(xpath = "//div[@class='alert alert-warning']")
    public WebElement userGirisBasarisizYazisi;
}
