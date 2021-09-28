package com.cybertek.day03_locate_by_tag_class_getatt;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class FindELementsByClassName {

    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("http://practice.cybertekschool.com/");

        //<span class="h1y">Test Automation Practice</span>

        WebElement elm1 = driver.findElement(By.className("h1y"));
        System.out.println("elm1.getText() = " + elm1.getText());

        // identify <li class="list-group-item"> ..... </a></li>
        WebElement firstLiIteam = driver.findElement(By.className("list-group-item"));
        System.out.println("firstLiIteam.getText() = " + firstLiIteam.getText());

        List<WebElement> allliTagsElements = driver.findElements(By.className("list-group-item"));
        System.out.println("allliTagsElements.size() = " + allliTagsElements.size());
        for (WebElement eachElement : allliTagsElements) {
            System.out.println("eachElement.getText() = " + eachElement.getText());
        }

        driver.quit();
    }
}
