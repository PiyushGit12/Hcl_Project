package com.hcl.webElemets;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class home_page_Elements{

    WebDriver d1;
    ActionDriver actdrv=new ActionDriver();

    String s = "ABC$&78G";
    String str1 = s.replaceAll("[^a-zA-Z]", "");
    String NewStr = s.replaceAll("[0-9A-Z]+", "");



         @FindBy(xpath = "//input[@name='username']") WebElement UserName;
         @FindBy(xpath = "//input[@name='password']") WebElement Password;
         @FindBy(xpath = "//input[@value='cbselenium']") WebElement Selenium_checkbox;
         @FindBy(xpath = "//input[@value='cbqtp']") WebElement Qtp_checkbox;
         @FindBy(xpath = "//input[@value='cbloadrunner']") WebElement LoadRunner_checkbox;
         @FindBy(xpath = "//input[@value='cbloadrunner']") WebElement LoadRunner_UNCheckbox;
         @FindBy(xpath = "//input[@value='radioqtp']") WebElement Radio_Button;
         @FindBy(xpath = "//select[@name='multipleselect[]']") WebElement Select_Drop_Down;
         @FindBy(xpath = "//table[@class='spTable']//tr[4]//td[1]//input") WebElement Table_Select;
         @FindBy(xpath = "//input[@name='spbutton']") WebElement Submit_Button;




    public void Text_Field(){
                UserName.sendKeys(str1);

         }
         public void Password_field(){
             Password.sendKeys(NewStr);
         }
         public void Selenium_checkbox(){
             actdrv.JS_click(d1,Selenium_checkbox);
         }
         public void Qtp_checkbox(){
             actdrv.JS_click(d1,Qtp_checkbox);
         }
         public void LoadRunner_checkbox(){
             actdrv.JS_click(d1,LoadRunner_checkbox);
         }
         public void loadRunner_UNCheckbox(){
             actdrv.JS_click(d1,LoadRunner_UNCheckbox);
         }
         public void Radio_Button(){
             actdrv.JS_click(d1,Radio_Button);
         }
         public void Select_Drop_Down(){

//             Select se=new Select(Select_Drop_Down);
//             se.selectByValue("msperformance");
//             se.selectByValue("msselenium");
         }
         public void Table_Select(){
             actdrv.JS_click(d1,Table_Select);
         }
         public void Submit_Button(){
             actdrv.JS_click(d1,Submit_Button);
         }




}

//    public static WebElement textField(WebDriver d1) throws Exception {
//
//        Thread.sleep(3000);
//        return d1.findElement(By.xpath("//input[@name='username']"));
//    }
//
//    public static WebElement PsswdField(WebDriver d1) {
//
//        return d1.findElement(By.xpath("//input[@name='password']"));
//    }
//
//
//    static By checkbox1 = By.xpath("//input[@value='cbselenium']");
//    static By checkbox2 = By.xpath("//input[@value='cbqtp']");
//    static By checkbox3 = By.xpath("//input[@value='cbloadrunner']");
//    static By uncheckbox = By.xpath("//input[@value='cbloadrunner']");
//
//    static By radio = By.xpath("//input[@value='radioqtp']");
//    static By select = By.xpath("//select[@name='multipleselect[]']");
//    static By table = By.xpath("//table[@class='spTable']//tr[4]//td[1]//input");
//
//
//
//    public  WebElement Checkbox1(WebDriver d1) {
//
//        WebElement chkbox1 = d1.findElement(checkbox1);
//        return JS_click(d1,chkbox1);
//
////        JavascriptExecutor js1 = (JavascriptExecutor)d1;
////        return (WebElement) js1.executeScript("arguments[0].click();", chkbox1);
//
//    }
//
//    public  WebElement Checkbox2(WebDriver d1) {
//
//        WebElement chckbox2 = d1.findElement(checkbox2);
//        return JS_click(d1,chckbox2);
//
//
////        JavascriptExecutor js2 = (JavascriptExecutor)d1;
////        return (WebElement) js2.executeScript("arguments[0].click();", chckbox2);
//
//    }
//
//    public  WebElement Checkbox3(WebDriver d1) {
//
//        WebElement chckbox3 = d1.findElement(checkbox3);
//        return JS_click(d1,chckbox3);
//    }
//
//
//    public static WebElement DeselectselectCheckbox(WebDriver d1)
//    {
//        WebElement unchkbtn = d1.findElement(uncheckbox);
//        JavascriptExecutor js4 = (JavascriptExecutor)d1;
//        return (WebElement) js4.executeScript("arguments[0].click();", unchkbtn);
//
//    }
//
//    public static WebElement Radio(WebDriver d1) throws Exception {
//
//
//        Thread.sleep(3000);
//        WebElement radiocheck = d1.findElement(radio);
//        JavascriptExecutor js = (JavascriptExecutor)d1;
//        return (WebElement) js.executeScript("arguments[0].click();", radiocheck);
//    }
//
//    public static WebElement Multiselect(WebDriver d1) {
//
//        return  d1.findElement(select);
//
//    }
//
//    public static WebElement tableselect(WebDriver d1) {
//
//
//        WebElement tablecheck = d1.findElement(table);
//        JavascriptExecutor js = (JavascriptExecutor)d1;
//        return (WebElement) js.executeScript("arguments[0].click();", tablecheck);
//
//
//    }
//
//    public static WebElement clickButton(WebDriver d1) {
//
//        WebElement checkbtn = d1.findElement(By.xpath("//input[@name='spbutton']"));
//        JavascriptExecutor js = (JavascriptExecutor)d1;
//        return (WebElement) js.executeScript("arguments[0].click();", checkbtn);







