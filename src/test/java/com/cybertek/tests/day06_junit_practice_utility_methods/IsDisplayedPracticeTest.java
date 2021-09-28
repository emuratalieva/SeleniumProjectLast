package com.cybertek.tests.day06_junit_practice_utility_methods;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import static org.junit.jupiter.api.Assertions.*;

public class IsDisplayedPracticeTest {
    WebDriver driver ;

    @BeforeEach
    public void setupWebDriver(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @AfterEach
    public void closeBrowser(){
        driver.quit();
    }

    // navigate to the form page
    // identfy the error message exists but not displayed
    // enter text "a" and check the error message displayed
    @Test
    public void testErrorMessage(){
        driver.get("http://practice.cybertekschool.com/registration_form");
        String xpathForErrorMsg = "//small[.='first name must be more than 2 and less than 64 characters long']" ;
        WebElement strLenghtErrorElement = driver.findElement(By.xpath(xpathForErrorMsg));
        System.out.println("strLenghtErrorElement.isDisplayed() = " + strLenghtErrorElement.isDisplayed());

        assertTrue(! strLenghtErrorElement.isDisplayed());
        assertFalse( strLenghtErrorElement.isDisplayed() );

        WebElement firstNameField = driver.findElement(By.name("firstname"));
        firstNameField.sendKeys("a");

        System.out.println("strLenghtErrorElement.isDisplayed() = " + strLenghtErrorElement.isDisplayed());

        assertTrue(strLenghtErrorElement.isDisplayed());
    }






}
