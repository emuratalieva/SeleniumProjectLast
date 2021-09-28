package com.cybertek.day04_CheckBox_Radio_Dropdown;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElementByCssSelector {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://search.yahoo.com/");

        // Identify search box using css selector
        // try with diffrent ways; by id,by name,
        //<input type="text" class="sbq" id="yschsp" name="p" value="" autocomplete="off" autofocus=""
        // tabindex="1" role="combobox" aria-autocomplete="both">

    //  WebElement searchbox = driver.findElement(By.cssSelector("#yschsp")); //1st option
     // WebElement searchbox = driver.findElement(By.cssSelector("input[name='p']")); //2nd option
     // WebElement searchbox = driver.findElement(By.cssSelector("input[id='yschsp']")); //3rd option
       WebElement searchbox = driver.findElement(By.cssSelector("input[name='p'][type='text']")); //by giving couple options
        searchbox.sendKeys("CSS SELECTOR");
      //  <button id="sbq-clear" type="button" class="sbq-x sa-hidden"><span class="sprite"></span></button>
        //<span class="sprite"></span>
        WebElement clearIcon = driver.findElement(By.cssSelector("button#sbq-clear>span"));
        clearIcon.click();

        searchbox.sendKeys("XPATH");

// identify the search icon using css selector : span[title='Search']
        WebElement searchIcon = driver.findElement(By.cssSelector("span[title='Search']"));
        searchIcon.click();


     driver.quit();




    }
}
