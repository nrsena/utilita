package com.utilita.pages;

import com.utilita.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HelpPage {

    public HelpPage() {

        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//a[.='Help']")
    public WebElement helpButton;

    @FindBy(xpath = "//a[contains(text(),'Reference')]")
    public WebElement custRefNum;

    @FindBy(xpath = "//a[.='Find']")
    public WebElement findButton;

    @FindBy(xpath = "//div[contains(text(),'provide')]")
    public WebElement errorMessage;
}
