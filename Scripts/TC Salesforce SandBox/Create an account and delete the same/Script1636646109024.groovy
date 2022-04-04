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

//import common.Utilities as Utilities
//import common.AppObjects as AppObjects
WebUI.openBrowser('https://katalon-inc--demo.my.salesforce.com/')

WebUI.maximizeWindow()

WebUI.setText(findTestObject('Object Repository/OR SalesForce SandBox/Page_Login  Salesforce/input_Username_username'), 
    'mohit.kumar@katalon.com')

WebUI.setText(findTestObject('Object Repository/OR SalesForce SandBox/Page_Login  Salesforce/input_Password_pw'), 'Katalon@2')

WebUI.click(findTestObject('Object Repository/OR SalesForce SandBox/Page_Login  Salesforce/input_Password_Login'))

not_run: WebUI.delay(15)

WebUI.enableSmartWait()

WebUI.click(findTestObject('Object Repository/OR SalesForce SandBox/Page_Home  Salesforce/span_Chatter'))

WebUI.click(findTestObject('Object Repository/OR SalesForce SandBox/Page_Home  Salesforce/svg_Accounts_btn_dropdown'))

WebUI.enhancedClick(findTestObject('Object Repository/OR SalesForce SandBox/Page_Home  Salesforce/span_New Account'))

WebUI.disableSmartWait()

WebUI.click(findTestObject('Object Repository/OR SalesForce SandBox/Page_New Account  Popup/raido_businessAccount'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/OR SalesForce SandBox/Page_New Account  Popup/btn_Next'))

//def userName = 'MohitAccount' + Utilities.randomString('hellokatalon', 5)
WebUI.setText(findTestObject('Object Repository/OR SalesForce SandBox/Page_New Account  Popup/text_AccountName'), 'MohitAccount12')

WebUI.click(findTestObject('Object Repository/OR SalesForce SandBox/Page_New Account  Popup/btn_Save'))

WebUI.delay(4)

WebUI.click(findTestObject('Object Repository/OR Salesforce SandBox/Page_New Account  Popup/button_Delete'))

WebUI.click(findTestObject('Object Repository/OR Salesforce SandBox/Page_New Account  Popup/span_Delete'))

WebUI.click(findTestObject('Object Repository/OR SalesForce SandBox/Page_Home  Salesforce/span_Accounts'))

WebUI.delay(2)

//TestObject linkuserName = AppObjects.GetObjectByTypeAndProperty('xpath', ('//a[text()=\'' + userName) + '\']')
//WebUI.verifyElementPresent(linkuserName, 5)
WebUI.click(findTestObject('Object Repository/OR SalesForce SandBox/TopPanel/btnUserProfile'))

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/OR SalesForce SandBox/TopPanel/a_Log Out'))

WebUI.delay(2)

WebUI.closeBrowser()

