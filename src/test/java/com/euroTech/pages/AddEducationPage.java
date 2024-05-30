package com.euroTech.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class AddEducationPage extends BasePage{

     @FindBy (xpath = "//label[@for='school']")
    public WebElement schoolLabel;
    @FindBy(xpath = "//div[@id='education-add']//label[not(@for='current')]")
    public List<WebElement> formLabels;
}
