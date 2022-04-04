import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('https://katalon-inc--demo.my.salesforce.com/')

WebUI.setText(findTestObject('Object Repository/OR Salesforce SandBox/input_Username_username'), 'mohit.kumar@katalon.com')

WebUI.setText(findTestObject('Object Repository/OR Salesforce SandBox/input_Password_pw'), 'Katalon@3')

WebUI.click(findTestObject('Object Repository/OR Salesforce SandBox/input_Password_Login'))

WebUI.delay(20)

not_run: WebUI.click(findTestObject('Object Repository/OR Salesforce SandBox/input_Verification Code_save'))

not_run: WebUI.delay(5)

WebUI.click(findTestObject('OR Salesforce SandBox/Leads'))

WebUI.delay(1)

WebUI.enhancedClick(findTestObject('Object Repository/OR Salesforce SandBox/span_New Lead'))

WebUI.click(findTestObject('Object Repository/OR Salesforce SandBox/input_Salutation_salutation'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/OR Salesforce SandBox/span_Mr'), FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('OR Salesforce SandBox/Input_First Name'), 'Katalon')

WebUI.setText(findTestObject('OR Salesforce SandBox/Input_Middle Name'), 'Studio')

WebUI.setText(findTestObject('OR Salesforce SandBox/input_Last Name'), 'QA2')

WebUI.click(findTestObject('OR Salesforce SandBox/Lead status'))

WebUI.delay(1)

WebUI.enhancedClick(findTestObject('Object Repository/OR Salesforce SandBox/span_Working'))

WebUI.setText(findTestObject('Object Repository/OR Salesforce SandBox/input__Email'), 'Lead1QA1@gmail.com')

WebUI.click(findTestObject('Object Repository/OR Salesforce SandBox/button_Save'))

WebUI.verifyElementPresent(findTestObject('OR Salesforce SandBox/span_Lead was created'), 1)

WebUI.waitForElementNotVisible(findTestObject('OR Salesforce SandBox/span_Lead was created'), 10)

WebUI.delay(10)

WebUI.click(findTestObject('OR Salesforce SandBox/button_Delete'))

WebUI.delay(1)

WebUI.click(findTestObject('OR Salesforce SandBox/span_Delete'))

WebUI.delay(1)

WebUI.verifyElementPresent(findTestObject('OR Salesforce SandBox/span_Lead was deleted'), 1)

WebUI.delay(2)

WebUI.closeBrowser()

