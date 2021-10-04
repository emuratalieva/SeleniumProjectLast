package com.cybertek.pages;

import com.cybertek.tests.day09_explicitwait_singleton_properties.Driver;
import com.cybertek.utility.BrowserUtil;
import com.cybertek.utility.ConfigReader;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GoogleHomePage {

    @FindBy(name="q")
    private WebElement searchbox ;

    @FindBy(name="btnK")
    private WebElement searchBtn;


    public GoogleHomePage(){

        PageFactory.initElements(Driver.getDriver(), this);

    }


    public void goTo(){

        Driver.getDriver().get(ConfigReader.read("google.url"));

    }

    public void searchKeyWord(String keyword){
        BrowserUtil.waitFor(3);
        searchbox.sendKeys(keyword);
        BrowserUtil.waitFor(3);
        searchBtn.click();

    }


    public boolean isAt(){
       return Driver.getDriver().getTitle().equals("Google");
    }


}
