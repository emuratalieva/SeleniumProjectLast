package com.cybertek.day04_CheckBox_Radio_Dropdown;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindELementByXPath_Intro {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("http://practice.cybertekschool.com");


        //    /html/body/div/div[2]/div/div/div/h1/span - full xpath aka absolute xpath
        // starting fom root element till your element you are looking for
        WebElement headerSpan = driver.findElement(By.xpath("/html/body/div/div[2]/div/div/div/h1/span"));
        System.out.println("headerSpan.getText() = " + headerSpan.getText());

        //     //h1/span this is known as relative xpath, it starts with double forward splash //
        // relative path  start looking element with h1 whoever parents or graandparents are
        // find direct child with span tag
        WebElement headerSpan2 = driver.findElement(By.xpath("//h1/span"));
        System.out.println("headerSpan2.getText() = " + headerSpan2.getText());

        //providing attributes in xpath
        // elementTag[@attributeName='attribute value']
        // if you have more than one then use --> and
        // elementTag[@attributeName='attribute value' and @attribute2Name = 'attribute2 value' ]
        // you have option to provide index
        // someElement[indexGoesHere]
        // you can also provide use text() xpath function
        //   //elementTag[text()='some text value goes here']
        //   //*[@id="box1"]
        //input[@name='checkbox1' and @type='checkbox'  ]
        // click on checkboxes
        driver.findElement(By.xpath("//a[text()='Checkboxes']")).click();

        //identify header in 1st checkbox using xpath
        WebElement header = driver.findElement(By.xpath("//h3[ text() = 'Checkboxes']"));
        System.out.println("header.getText() = " + header.getText());

        WebElement firstCheckBox = driver.findElement(By.xpath("//input[@id='box1']"));
        System.out.println("firstCheckBox.isSelected() = " + firstCheckBox.isSelected());

        driver.quit();


    }
}
