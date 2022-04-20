package com.hcl.webElemets;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class ActionDriver{

    public WebDriver d1;


    public void click(WebDriver d1, WebElement locatorName){

        Actions act=new Actions(d1);
        act.moveToElement(locatorName).click().build().perform();

    }

    public WebElement JS_click(WebDriver d1, WebElement ele){

            JavascriptExecutor executor = (JavascriptExecutor)d1;
            executor.executeScript("arguments[0].click();", ele);

        return ele;
    }

    public WebElement send_values(WebElement ele, String TextName){

        ele.clear();
        ele.sendKeys(TextName);
        return ele;
    }


}


