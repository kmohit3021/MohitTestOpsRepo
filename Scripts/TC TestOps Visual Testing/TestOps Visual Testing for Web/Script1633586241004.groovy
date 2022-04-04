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

WebUI.openBrowser(GlobalVariable.URL)

WebUI.maximizeWindow()

strTitle = WebUI.getWindowTitle()

WebUI.verifyMatch(strTitle, 'CURA Healthcare Service', false)

WebUI.takeFullPageScreenshotAsCheckpoint('Main page')

WebUI.click(findTestObject('OR Web Application/CURA Healthcare Service/Home Page/menu-toggle'))

WebUI.click(findTestObject('OR Web Application/CURA Healthcare Service/Home Page/Login link'))

WebUI.verifyElementText(findTestObject('OR Web Application/CURA Healthcare Service/Login Page/Please login to make appointment'), 
    'Please login to make appointment.')

WebUI.takeFullPageScreenshotAsCheckpoint('Login page')

WebUI.sendKeys(findTestObject('OR Web Application/CURA Healthcare Service/Login Page/input_Username'), GlobalVariable.username)

WebUI.takeFullPageScreenshotAsCheckpoint('Username')

WebUI.sendKeys(findTestObject('OR Web Application/CURA Healthcare Service/Login Page/input_Password'), GlobalVariable.password)

WebUI.takeFullPageScreenshotAsCheckpoint('Password')

WebUI.click(findTestObject('OR Web Application/CURA Healthcare Service/Login Page/button_Login'))

WebUI.selectOptionByValue(findTestObject('OR Web Application/CURA Healthcare Service/Appointment Page/facility'), 'Seoul CURA Healthcare Center', 
    false)

WebUI.click(findTestObject('OR Web Application/CURA Healthcare Service/Appointment Page/Apply for hospital readmission_hospital_readmission'))

WebUI.sendKeys(findTestObject('OR Web Application/CURA Healthcare Service/Appointment Page/Visit Date (Required)'), '21/09/2021')

WebUI.sendKeys(findTestObject('OR Web Application/CURA Healthcare Service/Appointment Page/Comment_comment'), 'Test Demo')

WebUI.takeFullPageScreenshotAsCheckpoint('Book Appointment')

WebUI.click(findTestObject('OR Web Application/CURA Healthcare Service/Appointment Page/Book Appointment'))

WebUI.takeFullPageScreenshotAsCheckpoint('ppointment Confirmation')

WebUI.verifyElementVisible(findTestObject('OR Web Application/CURA Healthcare Service/Confirmation Page/Appointment Confirmation'))

WebUI.click(findTestObject('OR Web Application/CURA Healthcare Service/Home Page/menu-toggle'))

WebUI.click(findTestObject('OR Web Application/CURA Healthcare Service/Home Page/Logout'))

WebUI.takeFullPageScreenshotAsCheckpoint('close browser')

WebUI.closeBrowser()

WebUI.acceptAlert()

