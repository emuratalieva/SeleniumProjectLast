package com.cybertek.pages;

import com.cybertek.utility.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class GoogleResultPage {

    @FindBy(id="result-stats")
    private WebElement searchResultCount;

    @FindBy(xpath = "//h3[@class='LC20lb DKV0Md']")
    private List<WebElement> resultLinks;

    public GoogleResultPage(){

        PageFactory.initElements(Driver.getDriver(),this);
    }

    public String getResultCountText(){

        return searchResultCount.getText();
    }


    public void printAllSearchResultLinks(){
        System.out.println("resultLinks.size() = " + resultLinks.size());

        for (WebElement eachLinkElement : resultLinks) {
            System.out.println("eachLinkElement.getText() = " + eachLinkElement.getText());
        }

    }

}



