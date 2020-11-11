package com.test_task;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.util.Random;

import static org.openqa.selenium.support.ui.ExpectedConditions.presenceOfElementLocated;
//import java.time.Duration;

class AccountCreationForm{

    final String NOTHING_SELECTED = "-";

    //Required fields
    WebElement _firstName;
    void set_firstName(String firstName){
        _firstName.clear();
        _firstName.sendKeys(firstName);
    }

    WebElement _lastName;
    void set_lastName(String lastName){
        _lastName.clear();
        _lastName.sendKeys(lastName);
    }
    WebElement _email;
    void set_email(String email){
        _email.clear();
        _email.sendKeys(email);
    }
    WebElement _password;
    void set_password(String password){
        _password.clear();
        _password.sendKeys(password);
    }
    WebElement _address;
    void set_address(String address){
        _address.clear();
        _address.sendKeys(address);
    }
    WebElement _city;
    void set_city(String city){
        _city.clear();
        _city.sendKeys(city);
    }
    WebElement _state;
    void set_state(String state){
        //_state.clear();
        _state.sendKeys(state);
    }
    WebElement _country;
    void set_country(String country){
        //_country.clear();
        _country.sendKeys(country);
    }
    WebElement _postalCode;
    void set_postalCode(String postalCode){
        _postalCode.clear();
        _postalCode.sendKeys(postalCode);
    }
    WebElement _mobilePhone;
    void set_mobilePhone(String mobilePhone){
        _mobilePhone.clear();
        _mobilePhone.sendKeys(mobilePhone);
    }
    WebElement _addressAlias;
    void set_addressAlias(String addressAlias){
        _addressAlias.clear();
        _addressAlias.sendKeys(addressAlias);
    }

    //Unrequired fields;
    WebElement _male;
    void set_male(){
        _male.click();
    }

    WebElement _female;
    void set_female(){
        _female.click();
    }

    WebElement _dayBirth;
    void set_dayBirth(String number){
        _dayBirth.sendKeys(number);
    }

    WebElement _monthBirth;
    void set_monthBirth(String month){
        _monthBirth.sendKeys(month);
    }

    WebElement _yearBirth;
    void set_yearBirth(String number){
        _yearBirth.sendKeys(number);
    }

    WebElement _checkboxSignUp;
    void set_checkboxSignUp(boolean isCheck){
        _checkboxSignUp.sendKeys(isCheck ? "true" : "false");
    }

    WebElement _checkboxReceive;
    void set_checkboxReceive(boolean isCheck){
        _checkboxReceive.sendKeys(isCheck ? "true" : "false");
    }

    WebElement _company;
    void set_company(String company){
        _company.clear();
        _company.sendKeys(company);
    }

    WebElement _address2;
    void set_address2(String address2){
        _address2.clear();
        _address2.sendKeys(address2);
    }

    WebElement _additionalInfo;
    void set_additionalInfo(String additionalInfo){
        _additionalInfo.clear();
        _additionalInfo.sendKeys(additionalInfo);
    }

    WebElement _homePhone;
    void set_homePhone(String homePhone){
        _homePhone.clear();
        _homePhone.sendKeys(homePhone);
    }

    void clear(){
        _firstName.clear();
        _lastName.clear();
        _homePhone.clear();
        _additionalInfo.clear();
        _company.clear();
        set_checkboxReceive(false);
        set_checkboxSignUp(false);
        _addressAlias.clear();
        _mobilePhone.clear();
        _postalCode.clear();
        _city.clear();
        _password.clear();
        _email.clear();
        _address2.clear();
        set_yearBirth(NOTHING_SELECTED);
        set_dayBirth(NOTHING_SELECTED);
        set_monthBirth(NOTHING_SELECTED);
        set_country(NOTHING_SELECTED);
        set_state(NOTHING_SELECTED);
        _male.sendKeys("false");
        _female.sendKeys("false");
    }
}

public class AppTest {

    private  AccountCreationForm openAccountCreationForm(WebDriver driver){

        driver.get("http://automationpractice.com");
        WebElement signIn = driver.findElement(By.cssSelector("a.login"));
        signIn.click();


        WebElement emailInput = new WebDriverWait(driver, 5)
                .until(d -> d.findElement(By.cssSelector("input#email_create")));
        emailInput.sendKeys("12345@emailemail.com");

        WebElement btnCreateAccount = driver.findElement(By.cssSelector(("button#SubmitCreate")));
        btnCreateAccount.click();

        AccountCreationForm form = new AccountCreationForm();
        form._firstName = new WebDriverWait(driver, 5)
                .until(d -> d.findElement(By.cssSelector("input#customer_firstname")));
        form._lastName = new WebDriverWait(driver, 5)
                .until(d -> d.findElement(By.cssSelector("input#customer_lastname")));
        form._email = new WebDriverWait(driver, 5)
                .until(d -> d.findElement(By.cssSelector("input#email")));
        form._password = new WebDriverWait(driver, 5)
                .until(d -> d.findElement(By.cssSelector("input#passwd")));
        form._address = new WebDriverWait(driver, 5)
                .until(d -> d.findElement(By.cssSelector("input#address1")));
        form._city = new WebDriverWait(driver, 5)
                .until(d -> d.findElement(By.cssSelector("input#city")));
        form._country = new WebDriverWait(driver, 5)
                .until(d -> d.findElement(By.cssSelector("select#id_country")));
        form._state = new WebDriverWait(driver, 5)
                .until(d -> d.findElement(By.cssSelector("select#id_state")));
        form._postalCode = new WebDriverWait(driver, 5)
                .until(d -> d.findElement(By.cssSelector("input#postcode")));
        form._mobilePhone = new WebDriverWait(driver, 5)
                .until(d -> d.findElement(By.cssSelector("input#phone_mobile")));
        form._addressAlias = new WebDriverWait(driver, 5)
                .until(d -> d.findElement(By.cssSelector("input#alias")));
        form._male = new WebDriverWait(driver, 5)
                .until(d -> d.findElement(By.cssSelector("input#id_gender1")));
        form._female = new WebDriverWait(driver, 5)
                .until(d -> d.findElement(By.cssSelector("input#id_gender2")));
        form._dayBirth = new WebDriverWait(driver, 5)
                .until(d -> d.findElement(By.cssSelector("select#days")));
        form._monthBirth = new WebDriverWait(driver, 5)
                .until(d -> d.findElement(By.cssSelector("select#months")));
        form._yearBirth = new WebDriverWait(driver, 5)
                .until(d -> d.findElement(By.cssSelector("select#years")));
        form._checkboxSignUp = new WebDriverWait(driver, 5)
                .until(d -> d.findElement(By.cssSelector("input#newsletter")));
        form._checkboxReceive = new WebDriverWait(driver, 5)
                .until(d -> d.findElement(By.cssSelector("input#optin")));
        form._company = new WebDriverWait(driver, 5)
                .until(d -> d.findElement(By.cssSelector("input#company")));
        form._addressAlias = new WebDriverWait(driver, 5)
                .until(d -> d.findElement(By.cssSelector("input#alias")));
        form._address2 = new WebDriverWait(driver, 5)
                .until(d -> d.findElement(By.cssSelector("input#address2")));
        form._additionalInfo = new WebDriverWait(driver, 5)
                .until(d -> d.findElement(By.cssSelector("textarea#other")));
        form._homePhone = new WebDriverWait(driver, 5)
                .until(d -> d.findElement(By.cssSelector("input#phone")));

        return form;
    }

    private String generateRandomEmail(){
        String SALTCHARS = "ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890";
        StringBuilder salt = new StringBuilder();
        Random rnd = new Random();
        while (salt.length() < 10) { // length of the random string.
            int index = (int) (rnd.nextFloat() * SALTCHARS.length());
            salt.append(SALTCHARS.charAt(index));
        }
        String saltStr = salt.toString();
        return saltStr + "@someemail.com";    }

    @Test
    public void allFieldsAreValidAndFilled(){
        WebDriver driver = new ChromeDriver();
        AccountCreationForm form =  openAccountCreationForm(driver);

        //Fill form
        form.set_firstName("Johny");
        form.set_lastName("Depp");
        form.set_email(generateRandomEmail());
        form.set_password("12345");
        form.set_address("Baker st.");
        form.set_city("Washington");
        form.set_country("United States");
        form.set_state("Washington");
        form.set_postalCode("12345");
        form.set_mobilePhone("89371234567");
        form.set_addressAlias("johnydepp");
        form.set_male();
        form.set_dayBirth("24");
        form.set_monthBirth("May");
        form.set_yearBirth("1997");
        form.set_checkboxSignUp(true);
        form.set_checkboxReceive(true);
        form.set_company("Universal studio");
        form.set_address2("221b");
        form.set_additionalInfo("Famous artist");
        form.set_homePhone("88005553535");

        //Submit form
        driver.findElement(By.cssSelector("button#submitAccount")).click();

        //Compare result with expected
        boolean errorMessageNotFounded;
        try {
            errorMessageNotFounded = new WebDriverWait(driver, 5)
                    .until(d -> d.findElement(By.cssSelector("div.alert.alert-danger"))) == null;
        }catch (Exception exc){
            errorMessageNotFounded = true;
        }

        Assert.assertTrue("Test allFieldsAreValidAndFilled is " + errorMessageNotFounded,errorMessageNotFounded);
        driver.close();
    }

    @Test
    public void allFieldsAreEmpty(){
        WebDriver driver = new ChromeDriver();
        AccountCreationForm form =  openAccountCreationForm(driver);
        form.clear();
        //Submit form
        String formUrl = driver.getCurrentUrl();
        driver.findElement(By.cssSelector("button#submitAccount")).click();

        //Compare result with expected
        boolean errorMessageFounded;
        try {
            errorMessageFounded = driver.findElement(By.cssSelector("div.alert.alert-danger")) != null;
        } catch (Exception ex){
            errorMessageFounded = false;
        }
        Assert.assertTrue("Test allFieldsAreEmpty is " + errorMessageFounded, errorMessageFounded);
        driver.close();
    }

}
