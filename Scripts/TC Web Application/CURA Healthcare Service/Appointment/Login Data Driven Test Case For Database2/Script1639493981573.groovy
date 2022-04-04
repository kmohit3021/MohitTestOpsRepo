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

not_run: WebUI.callTestCase(findTestCase('TC Web Application/CURA Healthcare Service/Appointment/Open Browser'), [:], FailureHandling.STOP_ON_FAILURE)

not_run: WebUI.callTestCase(findTestCase('TC Web Application/CURA Healthcare Service/Appointment/Click on Login Link'), 
    [:], FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('OR Web Application/CURA Healthcare Service/Login Page/input_Username'), username)

WebUI.setText(findTestObject('OR Web Application/CURA Healthcare Service/Login Page/input_Password'), password)

WebUI.verifyCheckpoint(findCheckpoint('null'), true)

WebUI.click(findTestObject('OR Web Application/CURA Healthcare Service/Login Page/button_Login'))

CustomKeywords.'webKeywords.ApplicationFunction.validateLoginMessage'(findTestObject('OR Web Application/CURA Healthcare Service/Login Page/Login failed Please ensure the username'))

