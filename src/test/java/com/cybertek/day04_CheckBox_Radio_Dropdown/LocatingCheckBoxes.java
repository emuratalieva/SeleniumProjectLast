package com.cybertek.day04_CheckBox_Radio_Dropdown;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatingCheckBoxes {
    public static void main(String[] args) {

        // checkboxes can be checked nd unchecked
        // Thats the only attribute special about the element
        // we can use additional method clled isSelected() to determine if its checked

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("http://practice.cybertekschool.com/checkboxes");

        // identify first checkbox

        WebElement checkbox1 = driver.findElement(By.id("box1"));
        System.out.println("checkbox1.isSelected() = " + checkbox1.isSelected());
        // get the value of checked attribute
        System.out.println("checkbox1.getAttribute(\"checked\") = " + checkbox1.getAttribute("checked"));

        WebElement checkbox2 = driver.findElement(By.id("box2"));
        System.out.println("checkbox2.isSelected() = " + checkbox2.isSelected());
        System.out.println("checkbox2.getAttribute(\"checked\") = " + checkbox2.getAttribute("checked"));

        checkbox1.click();// currently its unchecked so by clicking it will be checked
        checkbox2.click();// currently its checked so by clicking it will be unchecked

        if(! checkbox1.isSelected() ){
            checkbox1.click();
        }else {
            System.out.println("Already checked");
        }

        if(! checkbox2.isSelected()){
            checkbox2.click();
        }else {
            System.out.println("Already checked");
        }



        driver.quit();


    }
}
