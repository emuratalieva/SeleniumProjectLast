package com.cybertek.office_hours.Practice_09_22_2021;

import com.cybertek.utility.TestBase;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class P3_FileUpload extends TestBase {

    /**
     * to upload file/picture first need to get Path
     * for windows hold Shift then right click => copy as path
     */

    @Test
    public void fileUpload(){

        driver.get("https://testpages.herokuapp.com/styled/file-upload-test.html");
        String path = "C:\\Users\\Talant\\Desktop\\vision board 2020-2021\\34-14-Effective-Home-Remedies-For-Clear-And-Spotless-Skin_310507010.jpg";
        WebElement chooseFile = driver.findElement(By.cssSelector("#fileinput"));

        chooseFile.sendKeys(path);

        WebElement uploadBtn = driver.findElement(By.cssSelector("input[type='submit']"));
        uploadBtn.click();

        String expectedResult = "You uploaded a file. This is the result.";
        String actualResult = driver.findElement(By.cssSelector(".explanation")).getText();

        assertEquals(expectedResult,actualResult);


    }


}
