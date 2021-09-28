package com.cybertek.day04_CheckBox_Radio_Dropdown;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class LocatingRadioButtons {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("http://practice.cybertekschool.com/radio_buttons");

        WebElement blueRadio = driver.findElement(By.id("blue"));
        System.out.println("blueRadio.isSelected() = " + blueRadio.isSelected());
        blueRadio.click();// nothing will happen its already selected diffrent from checkbox example

        WebElement redRadio = driver.findElement(By.id("red"));
        System.out.println("Before clicking redRadio.isSelected() = " + redRadio.isSelected());
        redRadio.click();
        System.out.println("After clicking redRadio.isSelected() = " + redRadio.isSelected());
        // check blue radio button
        System.out.println("After red is clicked checking if blueRadio.isSelected() = " + blueRadio.isSelected());

        WebElement greenRadio = driver.findElement(By.id("green"));
        System.out.println("greenRadio.isSelected() = " + greenRadio.isSelected());
        // any element can use isEnabled() method to check whether element is disabled or not
        // one cannot take any action on disabled element

        System.out.println("greenRadio.isEnabled() = " + greenRadio.isEnabled());

        // a radio group is grouped by its name attribute

        List<WebElement> allColorRadios = driver.findElements(By.name("color"));

        System.out.println("allColorRadios.size() = " + allColorRadios.size());
        
        allColorRadios.get(2).click();
        System.out.println("=================================");
        for (WebElement eachColorRadio : allColorRadios) {
            System.out.println("eachColorRadio.getAttribute(\"id\") = "
                    + eachColorRadio.getAttribute("id"));
            System.out.println("eachColorRadio.isSelected() = "
                    + eachColorRadio.isSelected());
            System.out.println("eachColorRadio.isEnabled() = "
                    + eachColorRadio.isEnabled());
            System.out.println("=================================");

        }


        driver.quit();
    }

}
