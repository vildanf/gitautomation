package stepDefinations;

import java.util.List;

import org.junit.Assert;
import org.junit.runner.RunWith;

import Cucumber.Base;
import cucumber.api.DataTable;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.api.junit.Cucumber;
import pageObjects.CheckOutPage;
//import java.io.cucumber.java.en.Given;

@RunWith(Cucumber.class)
public class stepDefination extends Base {
	CheckOutPage cp;
	
	 @Given("^User is on NetBanking landing page$")
	    public void user_is_on_netbanking_landing_page() throws Throwable {
	      //code to navigat to login url
		 System.out.println("Navigated to login url");
	    }
	 @When("^User searched for (.+) Vegetables$")
	  public void user_searched_for_vegetables(String name) throws Throwable {
	      throw new PendingException();
	  }
	 
	  @Then("^verify selected (.+) items are displayed in Check out page$")
	  public void verify_selected_items_are_displayed_in_check_out_page(String name) throws Throwable {
		  cp=new CheckOutPage(driver);
		  	Assert.assertTrue( cp.getProductName().getText().contains(name));
	  }

	  @Given("^validate the browser$")
	  public void validate_the_browser() throws Throwable {
		  System.out.println("deciding the browser to open");
		  	Assert.assertTrue( cp.getProductName().getText().contains("fsdf"));
		  
	  }
	 


	    @When("^Browser is rtiggerd$")
	    public void browser_is_rtiggerd() throws Throwable {
	       System.out.println("triggerd");
	    }

	    @Then("^check if browser is started$")
	    public void check_if_browser_is_started() throws Throwable {
	       System.out.println("started");
	    }
	    @When("^User login int application with username and password$")
	    public void user_login_int_application_with_username_and_password() throws Throwable {
	        //code to login
	    	  System.out.println("Logged in success");
	    }

	    @Then("^Home page is populate$")
	    public void home_page_is_populate() throws Throwable {
	     //  home page validation
	   
	  System.out.println("Validate home page");
	    }
	    
	    @When("^User login int application with \"([^\"]*)\" and password \"([^\"]*)\"$")
	    public void user_login_int_application_with_something_and_password_something(String strArg1, String strArg2) throws Throwable {
	     System.out.println(strArg1);
	     System.out.println(strArg2);
	    
	    }

	    @Then("^Cards displayed are \"([^\"]*)\"$")
	    public void cards_displayed_are(String arg1) throws Throwable {
	        // Write code here that turns the phrase above into concrete actions
	       System.out.println(arg1);
	    }
	    
	    @When("^User sign up with following details$")
	    public void user_sign_up_with_following_details(DataTable data) throws Throwable {
	     List<List<String>> obj=data.raw();
	  System.out.println (obj.get(0).get(0));
	  System.out.println (obj.get(0).get(1));
	  System.out.println (obj.get(0).get(2));
	  System.out.println (obj.get(0).get(3));
	  System.out.println (obj.get(0).get(4));
	    		 }

	   	
	    @When("^User login in to application with (.+) and password (.+)$")
	    public void user_login_in_to_application_with_and_password(String Username, String password) throws Throwable {
	        System.err.println(Username);
	        System.out.println(password);
	    }

}
