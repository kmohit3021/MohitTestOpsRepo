package healthCareApp
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testcase.TestCaseFactory
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testdata.TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import internal.GlobalVariable

import org.openqa.selenium.WebElement
import org.openqa.selenium.WebDriver
import org.openqa.selenium.By

import com.kms.katalon.core.mobile.keyword.internal.MobileDriverFactory
import com.kms.katalon.core.webui.driver.DriverFactory

import com.kms.katalon.core.testobject.RequestObject
import com.kms.katalon.core.testobject.ResponseObject
import com.kms.katalon.core.testobject.ConditionType
import com.kms.katalon.core.testobject.TestObjectProperty

import com.kms.katalon.core.mobile.helper.MobileElementCommonHelper
import com.kms.katalon.core.util.KeywordUtil

import com.kms.katalon.core.webui.exception.WebElementNotFoundException
import cucumber.api.PendingException
import cucumber.api.java.en.And
import cucumber.api.java.en.Given
import cucumber.api.java.en.Then
import cucumber.api.java.en.When



class LoginSteps {
	@Given("Open Test application on the browser")
	public void open_Test_application_on_the_browser() {
		WebUI.openBrowser('https://katalon-demo-cura.herokuapp.com/')
		WebUI.maximizeWindow()
	}


	@Then("Test steps for demo")
	public void test_steps_for_demo() {
		// Write code here that turns the phrase above into concrete actions
		throw new PendingException();
	}

	@When("User click in make appointment")
	public void user_clcik_in_make_appointment() {
		WebUI.click(findTestObject('Object Repository/OR Web Application/CURA Healthcare Service/Home Page/a_Make Appointment'))
		}

	@When("User enter the username")
	public void user_enter_the_username() {
		WebUI.setText(findTestObject('Object Repository/OR Web Application/CURA Healthcare Service/Login Page/input_Username'),
				'John Doe')
	}

	@When("User enter the invalid username as {string}")
	public void user_enter_the_invalid_username_as(String username) {
		WebUI.setText(findTestObject('Object Repository/OR Web Application/CURA Healthcare Service/Login Page/input_Username'),
				username)
	}

	@When("User Enter the password")
	public void user_Enter_the_password() {
		WebUI.setText(findTestObject('Object Repository/OR Web Application/CURA Healthcare Service/Login Page/input_Password'),
				'ThisIsNotAPassword')
	}

	@When("User click on login")
	public void user_click_on_login() {
		WebUI.click(findTestObject('Object Repository/OR Web Application/CURA Healthcare Service/Login Page/button_Login'))
	}

	@Then("Verify user should be login successfully")
	public void verify_user_should_be_login_successfully() {
		println("Validating login")
		WebUI.delay(1)
		WebUI.closeBrowser()
	}
}