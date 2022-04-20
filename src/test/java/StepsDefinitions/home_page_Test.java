package StepsDefinitions;


import com.hcl.webElemets.BaseClass;
import io.cucumber.java.en.*;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import java.io.IOException;

public class home_page_Test{

    public static WebDriver d1;
    BaseClass base=new BaseClass();

    String s = "ABC$&78G";
    String str1 = s.replaceAll("[^a-zA-Z]", "");
    String NewStr = s.replaceAll("[0-9A-Z]+", "");

    private static Logger log= LogManager.getLogger(home_page_Test.class.getName());



    @Given("open browser to test the Application")
    public void open_browser_to_test_the_application() throws IOException, InterruptedException {


        base.launchBrowser();
        log.info("Browser opened and Launched url in it");

//        try {
//            d1 = configReader.Config_prop();
//
//        } catch (IOException e) {
//
//            log.error(e.getMessage());
//        }
//
//        d1.get("https://www.softwaretestingmaterial.com/sample-webpage-to-automate/");
//        d1.manage().window().maximize();


    }

    @When("passing extract string to TextField")
    public void passing_extract_string_to_text_field() throws Exception {

        base.textField(str1);
        log.info("This is the Text_field:-" +str1);
        System.out.println("Text field is passed");

    }

    @And("passing extract string to PswdField")
    public void passing_extract_string_to_pswd_field() {

        base.Password(NewStr);
        System.out.println("password field is passed");
        log.info("This is the passwordField:-" +NewStr);

    }

    @And("click all checkboxes")
    public void click_all_checkboxes() throws Exception {

        base.checkbox_selenium();
        base.checkbox_qtp();
        base.checkbox_loadrunner();

        log.debug("AllCheckbox is selected on WebPage");

    }

    @And("deselect one checkbox")
    public void deselect_one_checkbox() {


        base.LoadRunner_UNCheckbox();
        log.debug("One Checkbox is Deselected ");

    }

    @And("select one radio")
    public void select_one_radio() throws Exception {


        base.radiobutton_selenium();
//        log.info("Radio_Button is  selected");

    }

    @And("Select two values from multiple select")
    public void select_two_values_from_multiple_select() {


//        base.multipleselectvalues();
		System.out.println("passed");

    }

    @But("select one row from table")
    public void select_one_row_from_table() {


        base.table();
//        log.info("One Row is selected from Table");

    }

    @And("click on Submit button")
    public void click_on_submit_button() {


        base.button();
//        log.info("Clicked on the Submit button");

    }

    @Then("Successfully completed all Tests")
    public void Successfully_completed_all_Tests() {

        System.out.println("Successfully Completed all the Tests ");
//        log.info("Successfully completed all steps ");

    }



}
