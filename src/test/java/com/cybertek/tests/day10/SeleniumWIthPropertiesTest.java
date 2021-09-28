package com.cybertek.tests.day10;

import com.cybertek.utility.ConfigReader;
import com.cybertek.utility.Driver;
import com.cybertek.utility.TestBase;
import org.junit.jupiter.api.Test;

public class SeleniumWIthPropertiesTest extends TestBase {

    @Test
    public void testWebOrderLogin(){

        String url =  ConfigReader.read("weborder_url");
        String username = ConfigReader.read("weborder_username");
        String password = ConfigReader.read("weborder_password");


        System.out.println("url = " + url);
        System.out.println("username = " + username);
        System.out.println("password = " + password);


        Driver.getDriver().get(url);

    }


}
