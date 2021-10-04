package com.cybertek.tests.day12_pom_practice_review;
import static org.junit.jupiter.api.Assertions.*;
import com.cybertek.pages.GoogleHomePage;
import com.cybertek.pages.GoogleResultPage;
import com.cybertek.utility.BrowserUtil;
import com.cybertek.utility.ConfigReader;
import com.cybertek.utility.Driver;
import com.cybertek.utility.TestBase;
import org.junit.jupiter.api.Test;

public class GoogleResearchTest extends TestBase {


    @Test
    public void testGoogleSearch(){

        GoogleHomePage homePage = new GoogleHomePage();
       driver.get(ConfigReader.read("google.url"));

        // assert you are at the homepage
       assertTrue(   homePage.isAt()     );

        homePage.searchKeyWord("SDET JOB");
        BrowserUtil.waitFor(4);
        System.out.println("driver.getTitle() = " + driver.getTitle());

        // assert the title starts with SDET JOB
        System.out.println("driver.getTitle() = " +Driver.getDriver().getTitle());
        assertTrue(Driver.getDriver().getTitle().startsWith("SDET JOB")    ) ;
//        assertTrue( Driver.getDriver().getTitle().startsWith("SDET JOB")    ) ;

        GoogleResultPage resultPage = new GoogleResultPage();

        String resultText = resultPage.getResultCountText();
        System.out.println("resultText = " + resultText);


        resultPage.printAllSearchResultLinks();


        BrowserUtil.waitFor(4);

    }






}
