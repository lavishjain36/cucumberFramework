package com.demo.stepdefinitions;

import java.time.Duration;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginStepDefinitions {
	
	private WebDriver driver;

	@Given("User is on the login page")
	public void user_is_on_the_login_page() {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();//launching driver
		//implicit wait 
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.demoblaze.com/");
		//maximize window
		driver.manage().window().maximize();
		//delete cookies
		driver.manage().deleteAllCookies();
	}
	
	@When("User enters username and password")
	public void user_enters_username_and_password() throws InterruptedException {
		driver.findElement(By.id("login2")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("loginusername")).sendKeys("arpita678");
		driver.findElement(By.id("loginpassword")).sendKeys("admin123");
		driver.findElement(By.xpath("//button[.='Log in']")).click();


	}
	@Then("User click the login button")
	public void user_click_the_login_button() {
		String wmsg="Welcome arpita678";
		Assert.assertEquals("Welcome arpita678", wmsg);
		driver.close();
	}
}
