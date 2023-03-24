package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class Homepage {
    public Homepage(){
        PageFactory.initElements(Driver.getDriver(),this);

    }


    // Homepage/Header Logo
    @FindBy (xpath = "//div[@class='top-logo']")
    public WebElement mealsCenterTopLogo;

    //Homepage/Header Cart Link
    @FindBy (xpath = "//a[@class='ssm-toggle-navx']")
    public WebElement topCartLink;

    //Homepage /Header Cart Link> Text
    @FindBy(xpath = "//h6[@class='m-0 mt-3']")
    public WebElement topCartText;

    //Homepage / Header Cart Link> 'x' Button
    @FindBy(xpath = "//button[@class='el-drawer__close-btn']")
    public WebElement topCartXButton;



    //Homepage/ Header Shopping bag Icon
    @FindBy (xpath = "//li[@class='d-inline pr-2']")
    public WebElement topShoppingBagIcon;

    //Homepage / Header Shopping Bag> Text
    @FindBy (xpath = "//h6[@class='m-0 mt-3']")
    public WebElement topShoppingBagText;

    //Homepage / Header Shopping Bag > 'x' Button
    @FindBy (xpath = "//button[@class='el-drawer__close-btn']")
    public WebElement topShoppingBagXButton;

    //Homepage /Header Sign in
    @FindBy(xpath = "//li[@class='d-none d-lg-inline line-left']")
    public WebElement topSignInLink;

    //Homepage / Header  Address textBox
    @FindBy(xpath = "(//input[@class='form-control form-control-text'])[1]")
    public WebElement addressTextBox;

    //Homepage / Header Address text box result
    @FindBy(xpath = "//div[@class='search-geocomplete-results']")
    public WebElement addressTextBoxResult;

    //Homepage / Body Dunya Mutfagi Secenekleri tum elementleri
    @FindBy(xpath = "//div[@class='row no-gutters list-inline']")
    public WebElement allWorldCuisineCategories;

    //Homepage / Body Dunya mutfagi MoreDDM
    @FindBy(xpath = "//a[@id='dropdownCuisine']")
    public WebElement moreDropDownMenu;

    //Homepage / Body 'Popular nearby Seattle'
    @FindBy(xpath = "(//div[@class='mt-5 mb-5'])[1]")
    public  WebElement popularSeattle;

    //Homepage / Body 'Popular nearby Seattle' ustundeki geri tusu
    @FindBy(xpath = "(//a[@class='owl-carousel-nav prev mr-4'])[1]")
    public WebElement seattleBackArrow;

    //Homepage / Body 'Popular nearby Seattle' ustundeki ileri tusu
    @FindBy(xpath = "(//a[@class='owl-carousel-nav next'])[1]")
    public WebElement seattleNextArrow;

    //Homepage /Body / 'Popular nearby Seattle'/ ilk merchant ismi
    @FindBy(xpath = "(//*[text()='McDonalds'])[1]")
    public WebElement firstNameInSeattle;



    ////////////////////////////////////////////////////////////////
    @FindBy(xpath ="//a[@href='/account/login']")
    public WebElement homePageSigninButonu;








}
