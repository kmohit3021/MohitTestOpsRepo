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

WebUI.navigateToUrl('https://katalon-demo-cura.herokuapp.com/')

WebUI.click(findTestObject('Object Repository/OR Web Application/CURA Healthcare Service/OR TimeCapsule/a_CURA Healthcare_menu-toggle'))

WebUI.click(findTestObject('Object Repository/OR Web Application/CURA Healthcare Service/OR TimeCapsule/a_Login'))

WebUI.doubleClick(findTestObject('Object Repository/OR Web Application/CURA Healthcare Service/OR TimeCapsule/input_Demo account_form-control'))

WebUI.click(findTestObject('Object Repository/OR Web Application/CURA Healthcare Service/OR TimeCapsule/input_Demo account_form-control'))

WebUI.setText(findTestObject('Object Repository/OR Web Application/CURA Healthcare Service/OR TimeCapsule/input_Username_username'), 
    'John Doe')

WebUI.doubleClick(findTestObject('Object Repository/OR Web Application/CURA Healthcare Service/OR TimeCapsule/input_Demo account_form-control_1'))

WebUI.setText(findTestObject('Object Repository/OR Web Application/CURA Healthcare Service/OR TimeCapsule/input_Password_password'), 
    'ThisIsNotAPassword')

WebUI.click(findTestObject('Object Repository/OR Web Application/CURA Healthcare Service/OR TimeCapsule/button_Login'))

WebUI.selectOptionByValue(findTestObject('Object Repository/OR Web Application/CURA Healthcare Service/OR TimeCapsule/select_Tokyo CURA Healthcare Center        _5b4107'), 
    'Seoul CURA Healthcare Center', true)

WebUI.click(findTestObject('Object Repository/OR Web Application/CURA Healthcare Service/OR TimeCapsule/input_Apply for hospital readmission_hospit_63901f'))

WebUI.click(findTestObject('Object Repository/OR Web Application/CURA Healthcare Service/OR TimeCapsule/input_Medicaid_programs'))

WebUI.click(findTestObject('Object Repository/OR Web Application/CURA Healthcare Service/OR TimeCapsule/input_Visit Date (Required)_visit_date'))

WebUI.click(findTestObject('Object Repository/OR Web Application/CURA Healthcare Service/OR TimeCapsule/td_25'))

WebUI.setText(findTestObject('Object Repository/OR Web Application/CURA Healthcare Service/OR TimeCapsule/textarea_Comment_comment'), 
    'Test demo')

WebUI.click(findTestObject('Object Repository/OR Web Application/CURA Healthcare Service/OR TimeCapsule/button_Book Appointment'))

WebUI.verifyElementText(findTestObject('Object Repository/OR Web Application/CURA Healthcare Service/OR TimeCapsule/p_Please be informed that your appointment _11813a'), 
    'Please be informed that your appointment has been booked as following:')

WebUI.click(findTestObject('Object Repository/OR Web Application/CURA Healthcare Service/OR TimeCapsule/a_Go to Homepage'))

WebUI.click(findTestObject('Object Repository/OR Web Application/CURA Healthcare Service/OR TimeCapsule/a_CURA Healthcare_menu-toggle'))

WebUI.click(findTestObject('Object Repository/OR Web Application/CURA Healthcare Service/OR TimeCapsule/a_Logout'))

