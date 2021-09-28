package com.cybertek.day03_locate_by_tag_class_getatt;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class FindElementByTagName {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("http://practice.cybertekschool.com/");

        // identify 1 element with tag name a

        WebElement firstLnk = driver.findElement(By.tagName("a"));
        System.out.println("firstLnk.getText() = " + firstLnk.getText());

        List<WebElement> allATagElements = driver.findElements(By.tagName("a"));
        System.out.println("allATagElements.size() = " + allATagElements.size());

        // allATagElements.iter and hit enter, give a name to each element
        for (WebElement eachElement : allATagElements) {
            System.out.println("eachElement.getText() = " + eachElement.getText());
            System.out.println("eachElement.getAttribute(\"href\") = " + eachElement.getAttribute("href"));
        }


        // get first element with <h1> tag and get the text out of it
        WebElement firstH1TagElm = driver.findElement(By.tagName("h1"));
        System.out.println("firstH1TagElm.getText() = " + firstH1TagElm.getText());


        driver.quit();
    }
}
