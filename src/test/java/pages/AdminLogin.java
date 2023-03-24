package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class AdminLogin {
    public AdminLogin(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    // admin Login Sayfası / administator yazısı
    @FindBy(xpath = "//title[text()='Administrator Login']")
    public WebElement administatorLoginYazisi;

    //  admin Login Sayfası / username box
    @FindBy(xpath ="//label[text()='Username ']")
    public WebElement adminUsernameTextBox;

    //  admin Login Sayfası / password box
    @FindBy(xpath = "//label[text()='Password ']")
    public WebElement adminPasswordTextBox;

    //  admin Login Sayfası / remember me radio button
    @FindBy(xpath = "//label[text()='Remember me']")
    public WebElement adminRememberMeRadioButton;

    //  admin Login Sayfası / forgot password yazısı
    @FindBy(xpath = "//a[text()='Forgot password?  ']")
    public WebElement adminForgotPasswordYazisi;

    // admin Login Sayfası / Sign in butonu
    @FindBy(xpath ="//input[@value='Sign in']")
    public WebElement adminSignInButton;

    // admin Login Sayfası / App Store bölümü
    @FindBy(xpath = "//img[@src='/backoffice/themes/classic/assets/images/app-store@2x.png']")
    public WebElement adminAppStoreImg;

    // admin Login Sayfası / Google play bölümü
    @FindBy(xpath = "//img[@src='/backoffice/themes/classic/assets/images/google-play@2x.png']")
    public  WebElement adminGooglePlayImg;

}

