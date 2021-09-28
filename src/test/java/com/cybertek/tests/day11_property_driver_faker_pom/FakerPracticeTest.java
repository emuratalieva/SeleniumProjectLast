package com.cybertek.tests.day11_property_driver_faker_pom;

import com.github.javafaker.Faker;
import org.junit.jupiter.api.Test;

public class FakerPracticeTest {

   @Test
    public void testPrintFakeData(){

       Faker faker = new Faker();

       System.out.println("faker.phoneNumber().cellPhone() = "
               + faker.phoneNumber().cellPhone());

       System.out.println("faker.address().buildingNumber() = "
               + faker.address().buildingNumber());

       System.out.println("faker.numerify(\"###-###-####\") = "
               + faker.numerify("###-###-####"));

       System.out.println("faker.finance().creditCard() = "
               + faker.finance().creditCard());
   }


}
