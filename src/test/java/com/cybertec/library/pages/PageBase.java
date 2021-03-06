package com.cybertec.library.pages;

import com.cybertec.library.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public abstract class PageBase {
    public PageBase(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//span[.='Users']")
public WebElement usersPageLink;

    @FindBy(linkText = "Books")
    public WebElement booksPageLink;

    @FindBy(linkText = "Dashboard")
    public WebElement dashboardPageLink;

    @FindBy(xpath = "//a[@id='navbarDropdown']/span")
    public  WebElement accountUsername;
}
