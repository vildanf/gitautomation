package stepDefinations;


import Cucumber.Base;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks extends Base {

	
	@Before("@MobileTest")
	public void beforevalidation() {
		System.out.println("before Mobile hook");
	}
	
	
	@After("@MobileTest")
	public void aftervalidation() {
		System.out.println("Mobile after hook");
	}
	@After("@SeleniumTest")
	public void afterSeleniumTest() {
		driver.close();
	}
	@After("@RegressionTest")
	public void regressionTest() {
		driver.close();
	}
	
	
	@Before("@WebTest")
	public void beforeWebvalidation() {
		System.out.println("before web hook");
	}
	
	
	@After("@WebTest")
	public void afterWebvalidation() {
		System.out.println("web after hook");
	}
}
