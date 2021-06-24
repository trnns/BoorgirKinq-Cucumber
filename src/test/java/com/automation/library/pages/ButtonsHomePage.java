package com.automation.library.pages;

import com.automation.library.utilities.Driver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ButtonsHomePage {
    public ButtonsHomePage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(tagName = )
}
