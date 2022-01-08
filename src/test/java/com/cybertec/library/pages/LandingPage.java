package com.cybertec.library.pages;

import com.cybertec.library.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LandingPage {
    public  LandingPage(){
        PageFactory.initElements(Driver.getDriver(), this);

    }
    @FindBy(id = "user_count")
    public WebElement userCont;
}
