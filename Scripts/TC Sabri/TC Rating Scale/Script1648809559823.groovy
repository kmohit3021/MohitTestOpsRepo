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

WebUI.navigateToUrl('https://automation.sandbox-engagedly.com/sign_in?referrer_url=%2F%2Fautomation.sandbox-engagedly.com%2F&session_expired=')

WebUI.maximizeWindow()

WebUI.setText(findTestObject('Object Repository/OR Sabri/input_Email_useruser_name'), 'engagedly_admin@teamyogi.com')

WebUI.setEncryptedText(findTestObject('Object Repository/OR Sabri/input_Password_userpassword'), '8ONjX3ggx5RmoBbvnoZOyw==')

WebUI.click(findTestObject('Object Repository/OR Sabri/span_Sign in'))

WebUI.click(findTestObject('Object Repository/OR Sabri/div_Home__eng-sidebarIcon-left bubble-icon-Bank'))

WebUI.click(findTestObject('Object Repository/OR Sabri/a_Performance'))

WebUI.click(findTestObject('Object Repository/OR Sabri/a_Cycles'))

WebUI.delay(2)

WebUI.enhancedClick(findTestObject('Object Repository/OR Sabri/span_Create'))

WebUI.setText(findTestObject('Object Repository/OR Sabri/input__title'), 'Test Cycle 2')

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/OR Sabri/button_Next'))

WebUI.setText(findTestObject('Object Repository/OR Sabri/textarea_Description_notes'), 'This is a test cycle no 2')

not_run: WebUI.click(findTestObject('OR Sabri/input__cycle_start_date'))

WebUI.sendKeys(findTestObject('OR Sabri/input__cycle_start_date'), Keys.chord('Apr 13, 2022', Keys.ENTER))

WebUI.delay(2)

WebUI.sendKeys(findTestObject('OR Sabri/input__cycle_end_date'), Keys.chord('May 23, 2022', Keys.ENTER))

WebUI.delay(2)

WebUI.sendKeys(findTestObject('OR Sabri/input__performace_review_period'), Keys.chord('Apr 15, 2022 - May 18, 2022'))

not_run: WebUI.click(findTestObject('OR Sabri/input__performace_review_period'))

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/OR Sabri/button_Apply'))
WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/OR Sabri/a_Rating Scale'))

WebUI.verifyElementClickable(findTestObject('Object Repository/OR Sabri/span_Yes_switch'))

WebUI.verifyElementText(findTestObject('Object Repository/OR Sabri/span_Yes'), 'YES')

WebUI.click(findTestObject('Object Repository/OR Sabri/a_Edit'))

WebUI.click(findTestObject('Object Repository/OR Sabri/i_Note_bubble-icon-Trash deleteRow h2 point_d96dc6'))

WebUI.click(findTestObject('Object Repository/OR Sabri/i_Note_bubble-icon-Trash deleteRow h2 point_d96dc6'))

WebUI.click(findTestObject('Object Repository/OR Sabri/i_Note_bubble-icon-Trash deleteRow h2 point_d96dc6'))

WebUI.click(findTestObject('Object Repository/OR Sabri/i_Note_bubble-icon-Trash deleteRow h2 point_d96dc6'))

int datafileRows = findTestData('Data Files/Excel Data file').getRowNumbers()

rowIdx = GlobalVariable.rowIndex

WebUI.setText(findTestObject('Object Repository/OR Sabri/input_Note_rating_scalesscale', [('index') : rowIdx]), rating)

WebUI.setText(findTestObject('Object Repository/OR Sabri/input_Note_rating_scalesshort_code', [('index') : rowIdx]), shortCode)

WebUI.setText(findTestObject('Object Repository/OR Sabri/input_Note_rating_scalesdescription', [('index') : rowIdx]), description)

WebUI.setText(findTestObject('Object Repository/OR Sabri/input_Note_rating_scalesnotes', [('index') : rowIdx]), note)

GlobalVariable.rowIndex = (rowIdx + 1)

while (GlobalVariable.rowIndex < datafileRows) {
	WebUI.click(findTestObject('Object Repository/OR Sabri/span_Add'))

	break
}


