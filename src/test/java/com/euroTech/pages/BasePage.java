package com.euroTech.pages;

import com.euroTech.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public abstract class BasePage {
    public BasePage() {
        PageFactory.initElements(Driver.get(),this);
    }
    // public abstract void verifyPageTitle();
    @FindBy(css = ".d-none.d-md-block.dropdown-toggle.ps-2")
    public WebElement userNameAtRightTop;

    public void navigateTabsAndModules(String tabName, String moduleName){
        WebElement tab = Driver.get().findElement(By.xpath("//span[text()='" + tabName + "']"));
        tab.click();

        if (!moduleName.isEmpty()) {
            WebElement module = Driver.get().findElement(By.xpath("//*[text()='" + moduleName + "']"));
            module.click();
        }

    }

}
