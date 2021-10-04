package com.cybertek.pages;

import com.cybertek.utility.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DashboardPage {

    // add 3 elements that hold number
    // add FIndBy
    @FindBy (id="user_count")
    private WebElement userCount;

    @FindBy (id="book_count")
    private WebElement bookCount;

    @FindBy (id="borrowed_books")
    private WebElement borrowedBooks;
    // add constructor
    public DashboardPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    // add method for getting the text
    public String getUserCountText(){
       return userCount.getText();
    }

    public String getBookCountText(){
        return  bookCount.getText();
    }

    public String getBorrowedBookCountText(){
         return  borrowedBooks.getText();
    }



}
