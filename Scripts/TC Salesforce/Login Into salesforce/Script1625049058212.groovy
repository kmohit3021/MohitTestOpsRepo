import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.model.FailureHandling.CONTINUE_ON_FAILURE
import static com.kms.katalon.core.model.FailureHandling.STOP_ON_FAILURE
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
import ch.qos.logback.core.net.SocketConnector.ExceptionHandler as ExceptionHandler
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('https://login.salesforce.com/')

WebUI.setText(findTestObject('Object Repository/OR Salesforce/input_Username_username'), 'TestMohit')

WebUI.setEncryptedText(findTestObject('Object Repository/OR Salesforce/input_Password_pw'), 'DaViKV2JRFPGMqN3onmjfg==')

WebUI.click(findTestObject('Object Repository/OR Salesforce/input_Password_Login'))

WebUI.click(findTestObject('Object Repository/OR Salesforce/a_Forgot Your Password'))

WebUI.click(findTestObject('Object Repository/OR Salesforce/a_Sandbox Login'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/OR Salesforce/a_Use Custom Domain'))

WebUI.setText(findTestObject('Object Repository/OR Salesforce/input_Custom Domain_mydomain'), 'Custom Domain')

WebUI.click(findTestObject('Object Repository/OR Salesforce/button_Back'))

WebUI.closeBrowser()

