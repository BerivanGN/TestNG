package Locate;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class B1 {

public B1(){

    PageFactory.initElements(Driver.getDriver(),this);
}

 /*
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
  */

   /*
    // Admin Login >> dashboard >> Total Sales

    @FindBy(xpath = "//h5[text()='Total Sales']")
    public WebElement totalSalesYazisi;

    // Admin Login >> dashboard >> Total Sales + fiyat
    @FindBy(xpath = "(//div[@class='report-inner'])[1]")
    public WebElement totalSalesVeFiyat;

    // Admin Login >> dashboard >> Total Merchant
    @FindBy(xpath = "//h5[text()='Total Merchant']")
    public WebElement totalMerchantYazisi;

    // Admin Login >> dashboard >> Total Merchant + fiyat
    @FindBy(xpath = "(//div[@class='report-inner'])[2]")
    public WebElement totalMarchantVeFiyat;

    // Admin Login >> dashboard >> Total Commission
    @FindBy(xpath = "//h5[text()='Total Commission']")
    public WebElement totalCommissionYazisi;

    // Admin Login >> dashboard >> Total Commission + fiyat
    @FindBy(xpath = "(//div[@class='report-inner'])[3]")
    public WebElement totalCommissionVeFiyat;

    // Admin Login >> dashboard >> Total Subscriptions
    @FindBy(xpath = "//h5[text()='Total Subscriptions']")
    public WebElement totalSubscriptionsYazisi;

    // Admin Login >> dashboard >> Commission this week
    @FindBy(xpath = "//h6[text()='Commission this week']")
    public WebElement CommissionThisWeekYazisi;

    // Admin Login >> dashboard >> Commission this month
    @FindBy(xpath = "//h6[text()='Commission this month']")
    public WebElement CommissionThisMonthYazisi;

    // Admin Login >> dashboard >> Subscriptions this month
    @FindBy(xpath = "//h6[text()='Subscriptions this month']")
    public WebElement subscriptionsThisMonthYazisi;
    */







}
