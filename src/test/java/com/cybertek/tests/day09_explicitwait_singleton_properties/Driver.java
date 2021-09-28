package com.cybertek.tests.day09_explicitwait_singleton_properties;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Create a Singleton class called Driver
 *
 * 1. create private no arg constructor
 *
 * 2. create private static field with name obj
 *      Data type of variable should be WebDriver
 *
 * 3. create public static method
 *      name : getDriver()
 *      return type :WebDriver
 *      param : none
 *
 *      check if obj is null or not
 *          if yes - create ChromeDriver with all set up
 *         if no  -- return same obj
 */
public class Driver {

    private Driver(){
    }

    private static WebDriver obj;

    public static WebDriver getDriver(){
        if(obj==null){
            WebDriverManager.chromedriver().setup();
            obj = new ChromeDriver();
            System.out.println("Object has not been created yet, creating one now");
            return obj;
        }else{
            System.out.println("You already have object, use that exisitng one");
            return obj;
        }
    }

}
