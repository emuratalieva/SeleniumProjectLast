package com.cybertek.tests.day09_explicitwait_singleton_properties;

import java.security.Signature;

/**
 * We want this to only create one object
 * We want to block creation of more than one object
 *
 */
public class Singleton {

  // static String word ="my only value";
   // this is variable obj
   private static Singleton obj;


   private Singleton(){

   }

   public static Singleton getObj(){

      if(obj == null){
         System.out.println("Object has not been created yet,creating one now");
         obj = new Singleton();
         return obj;
      }else{
         System.out.println("You already have object, use that existing object");
         return obj;
      }


      }




}
