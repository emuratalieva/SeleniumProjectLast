package com.cybertek.day04_CheckBox_Radio_Dropdown;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SelectingFromFakeDropDown {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("http://practice.cybertekschool.com/dropdown");

       // the only way thta Select class we learned work is, if the element tag is select

        // identify the fake dropdown , its actually a link
        WebElement fakeDropdownElm = driver.findElement(By.id("dropdownMenuLink"));
        fakeDropdownElm.click();

        // and "select" the options its actually another link
        // identify option Google and click on it
        driver.findElement(By.linkText("Google")).click();

        driver.quit();


    }
}
