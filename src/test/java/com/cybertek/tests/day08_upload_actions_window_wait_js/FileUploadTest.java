package com.cybertek.tests.day08_upload_actions_window_wait_js;

import com.cybertek.utility.BrowserUtil;
import com.cybertek.utility.TestBase;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class FileUploadTest extends TestBase {

    @Test
    public void testUpload()  {

        driver.get("http://practice.cybertekschool.com/upload");

       WebElement fileInputField = driver.findElement(By.id("file-upload"));
       // find the full path of your file
        //"C:\Users\Talant\Desktop\vision board 2020-2021\960x0.jpg"
        // find the full path of your file in your computer and send key into above input filed
        // you can copy the full path of file by
        // right clicking and holddown to option key and select -- copy "yourfilename" as path
        // it will copy the full path of your file

        String filePath = "C:\\Users\\Talant\\Desktop\\vision board 2020-2021\\960x0.jpg";
        fileInputField.sendKeys(filePath);

        driver.findElement(By.id("file-submit")).click();
      //  Thread.sleep(2000);
        BrowserUtil.waitFor(2);

        //success message page : //h3[.='File Uploaded!']
        WebElement successMsg = driver.findElement(By.xpath("//h3[.='File Uploaded!']"));
        assertTrue(successMsg.isDisplayed());


    }


}
