package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class UserSignUp {

    public UserSignUp(){
        PageFactory.initElements(Driver.getDriver(),this);}


    @FindBy(xpath = "//a[@href='/account/signup?redirect=']")
    public WebElement userSignUpButonu;

    @FindBy(xpath = "(//input[@class='form-control form-control-text'])[1]")
    public WebElement userFirstnameTextBox;

    @FindBy(xpath = "(//input[@class='form-control form-control-text'])[2]")
    public WebElement userLastnameTextBox;

    @FindBy(xpath = "(//input[@class='form-control form-control-text'])[3]")
    public WebElement userEmailTextBox;

    @FindBy(xpath = "//*[@class='dropdown-item d-flex align-items-center']")
    public WebElement userAlanKoduTextBox;

    @FindBy(xpath = "//input[@data-mask='###################']")
    public WebElement userTelefonNoTextBox;

    @FindBy(xpath = "(//input[@class='form-control form-control-text'])[4]")
    public WebElement userPasswordTextBox;

    @FindBy(xpath = "(//input[@class='form-control form-control-text'])[5]")
    public WebElement userConfirmPasswordTextBox;

    @FindBy(xpath = "//button[@class='btn btn-green w-100']")
    public WebElement registerPageSignupButonu;






}
