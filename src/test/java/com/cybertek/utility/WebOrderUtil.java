package com.cybertek.utility;

import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import static org.openqa.selenium.support.ui.ExpectedConditions.*;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class WebOrderUtil {

    /**
     * A method for logging into Web Order practice site from login page
     * <p>
     * <p>
     * // create a method to openWebOrderApp
     * <p>
     * /**
     * Simply navigate to WebOrderApp
     */

    public static void openWebOrderApp() {

        Driver.getDriver().get
                ("http://secure.smartbearsoftware.com/samples/TestComplete11/WebOrders/Login.aspx");

    }


    //* A method for logging into Web Order practice site from login page

    public static void login() {

        // enter username
        Driver.getDriver().findElement(By.id("ctl00_MainContent_username")).sendKeys("Tester");
        // enter password
        Driver.getDriver().findElement(By.id("ctl00_MainContent_password")).sendKeys("test");
        // click login
        Driver.getDriver().findElement(By.id("ctl00_MainContent_login_button")).click();

    }

    public static void logout() {

        // logout link has id of ctl00_logout
        Driver.getDriver().findElement(By.id("ctl00_logout")).click();

    }

    /**
     * A method for logging into Web Order practice site from login page
     *
     * @param username username for weborder app
     * @param password password for weborder app
     */
    public static void login(String username, String password) {
        // enter username
        Driver.getDriver().findElement(By.id("ctl00_MainContent_username")).sendKeys(username);
        // enter password
        Driver.getDriver().findElement(By.id("ctl00_MainContent_password")).sendKeys(password);
        // click login
        Driver.getDriver().findElement(By.id("ctl00_MainContent_login_button")).click();

    }

    /**
     * Check for login error message is visible or not , by calling the BrowserUtil method we created
     *
     * @return true if error message displayed , false if not
     */

    public static boolean loginErrorMsgVisible() {

        boolean elementFound =
                BrowserUtil.checkVisibilityOfElement(By.xpath("//span[. ='Invalid Login or Password.']"), 2);
        return elementFound;

    }

    public static boolean isAtAllOrderPage() {

        boolean result = false;
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 2);

        try {
            wait.until(visibilityOfElementLocated(By.xpath("//h2[normalize-space(.)='List of All Orders']")));
            result = true;
            System.out.println("At the right page");
        } catch (TimeoutException e) {
            System.out.println("Not at Order Page" + e.getMessage());
        }

        return result;

    }

    public static boolean verifyUsername(String username){
        WebElement loginInfoArea = Driver.getDriver().findElement(By.cssSelector("div.login_info"));
        System.out.println("loginInfoArea.getText() = " + loginInfoArea.getText());
        return loginInfoArea.getText().contains(username);
    }

    public static String getUsernameFromWelcomeMsg(String username) {

        WebElement loginInfoArea = Driver.getDriver().findElement(By.cssSelector("div.login_info"));
        String welcomeMsg = loginInfoArea.getText();

        // return welcomeMsg.replace("Welcome, ","").replace();
        return "";


    }

    public static void selectSideBarTab(String tabName){

         Driver.getDriver().findElement(By.linkText(tabName)).click();
    }

    public static boolean checkAll(){

        Driver.getDriver().findElement(By.linkText("Check All")).click();
        List<WebElement> allCheckBoxes = 
                Driver.getDriver().findElements(By.cssSelector("input[id$='OrderSelector'][type='checkbox']"));
        

     //   boolean result = true;
        for (WebElement eachCheckBox : allCheckBoxes) {
            if(! eachCheckBox.isSelected()){
                return false;
            }
        }

        return true;
    }

}