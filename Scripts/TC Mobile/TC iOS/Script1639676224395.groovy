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

Mobile.startApplication('/Users/katalon/Documents/APK/TestApp-iphonesimulator.app', true)

Mobile.setText(findTestObject('OR Mobile/OR Mobile iOS/XCUIElementTypeTextField - IntegerA'), '30', 0)

Mobile.setText(findTestObject('OR Mobile/OR Mobile iOS/XCUIElementTypeTextField - IntegerB'), '20', 0)

Mobile.tapAndHold(findTestObject('OR Mobile/OR Mobile iOS/XCUIElementTypeButton - ComputeSumButton'), 0, 0)

Mobile.getText(findTestObject('OR Mobile/OR Mobile iOS/XCUIElementTypeStaticText - Answer'), 0)

Mobile.tapAndHold(findTestObject('OR Mobile/OR Mobile iOS/XCUIElementTypeButton - show alert'), 0, 0)

Mobile.tapAndHold(findTestObject('OR Mobile/OR Mobile iOS/XCUIElementTypeButton - OK'), 0, 0)

Mobile.clearText(findTestObject('OR Mobile/OR Mobile iOS/XCUIElementTypeTextField - IntegerA'), 0)

Mobile.clearText(findTestObject('OR Mobile/OR Mobile iOS/XCUIElementTypeTextField - IntegerB'), 0)

Mobile.switchToLandscape()

Mobile.switchToPortrait()

Mobile.closeApplication()

