package com.cybertek.office_hours.Practice_09_29_2021;

import com.cybertek.utility.Driver;
import com.cybertek.utility.TestBase;
import org.junit.jupiter.api.Test;

public class techCrunch extends TestBase {

    @Test
    public void testCrunch(){
        Driver.getDriver().get("https://techcrunch.com/");
    }



}
