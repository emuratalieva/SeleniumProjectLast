package com.cybertek.office_hours.Practice_09_08_2021;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MoneyGaming {
    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://moneygaming.qa.gameaccount.com/");

//        1. Navigate to: https://moneygaming.qa.gameaccount.com/
//
//        2. Click the JOIN NOW button to open the registration page
//
//        3. Select a title value from the dropdown
//
//        4. Enter your first name and surname in the form
//
//        5. Check the htickbox with text 'I accept the Terms and Conditions and certify that I am over the age of 18.'
//
//        6. Submit the form by clicking the JOIN NOW button
//
//        7. Validate that a validation message with text ‘ This field is required’ appears under the date of birth box
//                */

        //a[@class='newUser green']

        Thread.sleep(10000);
        WebElement joinNow = driver.findElement(By.xpath("//a[@class='newUser green']"));
       // WebElement joinNow = driver.findElement(By.cssSelector(".newUser green"));
        joinNow.click();

        WebElement titleDropDown = driver.findElement(By.id("title"));
        Select dropdown = new Select(titleDropDown);
        dropdown.selectByVisibleText("Mr");
        //dropdown.deselectByVisibleText("Mr"); // ??? what we cannot to do with Select?
        //you my only selsct 1 options


        ////input[@name='map(firstName)']
        WebElement firstName = driver.findElement(By.cssSelector("input[@name='map(firstName)']"));
        firstName.sendKeys("Mike");

        WebElement lastName = driver.findElement(By.cssSelector("input[name='map(lastName)']"));
        lastName.sendKeys("Smith");

        ////input[@name='map(terms)']
        WebElement termBox = driver.findElement(By.xpath("//input[@name='map(terms)']"));
        termBox.click();

        Thread.sleep(3000);
        WebElement submitBtn = driver.findElement(By.cssSelector(".promoReg.green"));
        submitBtn.click();

        WebElement element = driver.findElement(By.xpath("//label[@for='dob']"));


    }
}
