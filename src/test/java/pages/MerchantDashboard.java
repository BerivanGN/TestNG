package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class MerchantDashboard {

    public MerchantDashboard() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    // Merchant Login Sayfasi / MealsCenter logo elementi
    @FindBy(xpath = "//img[@class='img-200']")
    public WebElement mealsCenterLogoElementi;


    // Merchant Login Sayfasi / Merchant Dropdown Menu
    @FindBy(xpath = "//li[@class='merchant']")
    public WebElement merchantDropdownMenu;


    // Merchant Login Sayfasi / Merchant Dropdown Alt Menu Information
    @FindBy(xpath = "//li[@class='position-relative merchant_edit']")
    public WebElement merchantDropdownInformation;


    // Merchant Login Sayfasi / Merchant Forgot Password Text
    @FindBy(xpath = "//a[@class='dim underline']")
    public WebElement forgotPasswordText;


    // Merchant Login Sayfasi / Forgot Password Sayfasi Dogrulama Yazisi
    @FindBy(xpath = "//p[@class='dim']")
    public WebElement forgotPasswordSayfasiDogrulama;


    // Merchant Login Sayfasi / Promo Dropdown Menu
    @FindBy(xpath = "//li[@class='promo']")
    public WebElement promoDropdownMenu;


    // Merchant Login Sayfasi / Promo Dropdown Alt Menu Coupon
    @FindBy(xpath = "//li[@class='position-relative merchant_coupon']")
    public WebElement promoDropdownCoupon;


    // Merchant Login Sayfasi / Promo Dropdown Alt Menu Coupon Ekleme
    @FindBy(xpath = "//i[@class='zmdi zmdi-plus']")
    public WebElement couponAddNewIconu;


    // Merchant Login Sayfasi / Promo Dropdown Alt Menu Coupon Ekleme Ilk Text Box
    @FindBy(xpath = "//input[@id='AR_voucher_voucher_name']")
    public WebElement couponEklemeCouponNameTextBox;


    // Merchant Login Sayfasi / Promo Dropdown Alt Menu Coupon Ekleme Tarih Text Box
    @FindBy(xpath = "//input[@id='AR_voucher_expiration']")
    public WebElement couponEklemeTarihTextBox;

}
