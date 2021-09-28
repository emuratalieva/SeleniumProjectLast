package com.cybertek.office_hours.Practice_09_22_2021;

import com.cybertek.utility.TestBase;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class P1_WebTables extends TestBase {

    @Test
    public void dateTable(){


    driver.get("http://practice.cybertekschool.com/tables");

        String firstname = "Jason";
    ////table[@id='table1']//td[.='Jason']/../td[3]
        String path = "//table[@id='table1']//td[.='"+firstname+"']/../td[3]";

        WebElement email = driver.findElement(By.xpath(path));


    }
}
