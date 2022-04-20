package com.hcl.webElemets;


import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.Select;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class BaseClass  {

    public WebDriver d1;

    ActionDriver actdrv;


    public WebDriver launchBrowser() throws IOException, InterruptedException {

        FileInputStream st = new FileInputStream("src\\main\\resources\\Config.properties");
        Properties prop = new Properties();
        prop.load(st);

        String browser_name = prop.getProperty("browser");
        String path = prop.getProperty("browser_Driver_path");
        String Url = prop.getProperty("browser_url");
        if (browser_name.equalsIgnoreCase("chrome")) {
            System.setProperty("webdriver.chrome.driver", path);
            d1 = new ChromeDriver();
            d1.get(Url);
            d1.manage().window().maximize();
            Thread.sleep(5000);
            d1.findElement(By.id("onesignal-slidedown-cancel-button")).click();
        } else if (browser_name.equalsIgnoreCase("firefox")) {
            System.setProperty("webdriver.gecko.driver", path);
            d1 = new FirefoxDriver();
        } else {
            System.setProperty("webdriver.ie.driver", path);
            d1 = new InternetExplorerDriver();
        }
        return d1;

    }

    By UserName=By.xpath("//input[@name='username']");

    By Password=By.xpath("//input[@name='password']");

    By Selenium_checkbox=By.xpath("//input[@value='cbselenium']");

    By Qtp_checkbox=By.xpath("//input[@value='cbqtp']");

    By LoadRunner_checkbox=By.xpath("//input[@value='cbloadrunner']");

    By LoadRunner_UNCheckbox=By.xpath("//input[@value='cbloadrunner']");

    By Radio_Button=By.xpath("//input[@value='radioqtp']");

    By Select_Drop_Down =By.xpath("//select[@name='multipleselect[]']");

    By Table_Select = By.xpath("//table[@class='spTable']//tr[4]//td[1]//input");

    By Submit_Button=By.xpath("//input[@name='spbutton']");





    public WebDriver textField(String a) {

        d1.findElement(UserName).sendKeys(a);
        return d1;
    }
    public WebDriver Password(String b) {

        d1.findElement(Password).sendKeys(b);
        return d1;
    }
    public WebDriver checkbox_selenium() {

        WebElement chkboxselenium = d1.findElement(Selenium_checkbox);
        actdrv.JS_click(d1,chkboxselenium);
        return d1;
    }
    public WebDriver checkbox_qtp() {

        WebElement checkbox_qtp = d1.findElement(Qtp_checkbox);
        actdrv.JS_click(d1,checkbox_qtp);
        return d1;
    }
    public WebDriver checkbox_loadrunner() {

        WebElement checkbox_loadrunner = d1.findElement(LoadRunner_checkbox);
        actdrv.JS_click(d1,checkbox_loadrunner);
        return d1;
    }
    public WebDriver LoadRunner_UNCheckbox() {

        WebElement LoadRunnerUNCheckbox = d1.findElement(LoadRunner_UNCheckbox);
        actdrv.JS_click(d1,LoadRunnerUNCheckbox);
        return d1;
    }
    public WebDriver radiobutton_selenium() {

        WebElement radio_check = d1.findElement(Radio_Button);
        actdrv.JS_click(d1,radio_check);
        return d1;
    }
//    public WebDriver multipleselectvalues() {
//
////        Select select = new Select(d1.findElement(Select_Drop_Down));
////        select.selectByValue("msagile");
////        select.selectByValue("msselenium");
////        return d1;
//        System.out.println("Successfully Completed all the Tests ");
//    }
    public WebDriver table() {

        WebElement table_check = d1.findElement(Table_Select);
        actdrv.JS_click(d1,table_check);
        return d1;
    }
    public WebDriver button() {

        WebElement button_check = d1.findElement(Submit_Button);
        actdrv.JS_click(d1,button_check);
        return d1;
    }


}
//    public void textField(String textvalue){
//
//        d1.findElement(By.xpath("//input[@name='username']"));
//    }
//
//    public void Password_Field(String textvalue){
//
//        d1.findElement(By.xpath("//input[@name='password']"));
//    }
//
//    public void Checkbox_selenium(WebDriver d1){
//
//        d1.findElement(By.xpath("//input[@value='cbselenium']"));
//
//    }
//    public void Checkbox_Qtp(WebDriver d1){
//        d1.findElement(By.xpath("//input[@value='cbqtp']"));
//
//    }
//    public void Checkbox_loadrunner(WebDriver d1){
//        d1.findElement(By.xpath("//input[@value='cbloadrunner']"));
//
//    }
//    public void UNCheck_loadrunner(WebDriver d1){
//        d1.findElement(By.xpath("//input[@value='cbloadrunner']"));
//
//    }


