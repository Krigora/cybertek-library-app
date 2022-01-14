package com.cybertec.library.pages;

import com.cybertec.library.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class UsersPage {

    public UsersPage(){

        PageFactory.initElements(Driver.getDriver(), this);

    }
    @FindBy(name = "tbl_users_length")
    public WebElement showRecordsDropdown;


    //@FindBy(xpath = "//th") // => same @FindBy(tagName = "th")
    @FindBy(tagName = "th")
    public List<WebElement> tableHeaders;

}
