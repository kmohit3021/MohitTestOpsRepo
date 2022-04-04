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

WebUI.navigateToUrl('https://mail.google.com/mail/u/0/#inbox')

WebUI.click(findTestObject('Object Repository/OR Sabri/Review Form Section/a_Review Form Sections'))

WebUI.verifyElementText(findTestObject('Object Repository/OR Sabri/Review Form Section/span_Review Form Sections'), 'Review Form Sections')

WebUI.verifyElementText(findTestObject('Object Repository/OR Sabri/Review Form Section/label_Manager Recommendations'), 
    'Manager Recommendations')

WebUI.click(findTestObject('Object Repository/OR Sabri/Review Form Section/button_Add'))

if (reviewtype == 'Text') {
    WebUI.setText(findTestObject('Object Repository/OR Sabri/Review Form Section/textarea__question'), 'Q1')

    WebUI.click(findTestObject('Object Repository/OR Sabri/Review Form Section/button_Select'))

    WebUI.click(findTestObject('Object Repository/OR Sabri/Review Form Section/div_General'))

    WebUI.click(findTestObject('Object Repository/OR Sabri/Review Form Section/span_Select Question Type'))

    WebUI.click(findTestObject('Object Repository/OR Sabri/Review Form Section/div_Text'))

    WebUI.click(findTestObject('Object Repository/OR Sabri/Review Form Section/button_Save'))

    WebUI.verifyElementText(findTestObject('Object Repository/OR Sabri/Review Form Section/label_Q1'), 'Q1')

    WebUI.click(findTestObject('Object Repository/OR Sabri/Review Form Section/i_General_bubble-icon-More-2 pointer text-dark'))

    WebUI.click(findTestObject('Object Repository/OR Sabri/Review Form Section/span_Delete'))
}

if (reviewtype == 'List') {
    WebUI.setText(findTestObject('Object Repository/OR Sabri/Review Form Section/textarea__question'), 'Q2')

    WebUI.click(findTestObject('Object Repository/OR Sabri/Review Form Section/button_Select'))

    WebUI.click(findTestObject('Object Repository/OR Sabri/Review Form Section/div_General'))

    WebUI.click(findTestObject('Object Repository/OR Sabri/Review Form Section/span_Select Question Type'))

    WebUI.click(findTestObject('Object Repository/OR Sabri/Review Form Section/div_List'))

    WebUI.click(findTestObject('Object Repository/OR Sabri/Review Form Section/i_Options_bubble-icon-Trash pointer remove-_0beebe'))

    WebUI.click(findTestObject('Object Repository/OR Sabri/Review Form Section/i_Options_bubble-icon-Trash pointer remove-_0beebe'))

    WebUI.click(findTestObject('Object Repository/OR Sabri/Review Form Section/span_Add'))

    WebUI.setText(findTestObject('Object Repository/OR Sabri/Review Form Section/input_Options_options'), 'Option1')

    WebUI.click(findTestObject('Object Repository/OR Sabri/Review Form Section/span_Add'))

    WebUI.setText(findTestObject('Object Repository/OR Sabri/Review Form Section/input_Options_options'), 'Option2')

    WebUI.click(findTestObject('Object Repository/OR Sabri/Review Form Section/button_Save'))

    WebUI.verifyElementText(findTestObject('Object Repository/OR Sabri/Review Form Section/label_Q1'), 'Q2')

    WebUI.click(findTestObject('Object Repository/OR Sabri/Review Form Section/i_General_bubble-icon-More-2 pointer text-dark'))

    WebUI.click(findTestObject('Object Repository/OR Sabri/Review Form Section/span_Delete'))
}

if (reviewtype == 'Single Selection') {
    WebUI.setText(findTestObject('Object Repository/OR Sabri/Review Form Section/textarea__question'), 'Q3')

    WebUI.click(findTestObject('Object Repository/OR Sabri/Review Form Section/button_Select'))

    WebUI.click(findTestObject('Object Repository/OR Sabri/Review Form Section/div_General'))

    WebUI.click(findTestObject('Object Repository/OR Sabri/Review Form Section/span_Select Question Type'))

    WebUI.click(findTestObject('Object Repository/OR Sabri/Review Form Section/div_Single Selection'))

    WebUI.click(findTestObject('Object Repository/OR Sabri/Review Form Section/i_Options_bubble-icon-Trash pointer remove-_0beebe'))

    WebUI.click(findTestObject('Object Repository/OR Sabri/Review Form Section/i_Options_bubble-icon-Trash pointer remove-_0beebe'))

    WebUI.click(findTestObject('Object Repository/OR Sabri/Review Form Section/span_Add'))

    WebUI.setText(findTestObject('Object Repository/OR Sabri/Review Form Section/input_Options_options'), 'Option3')

    WebUI.click(findTestObject('Object Repository/OR Sabri/Review Form Section/span_Add'))

    WebUI.setText(findTestObject('Object Repository/OR Sabri/Review Form Section/input_Options_options'), 'Option4')

    WebUI.click(findTestObject('Object Repository/OR Sabri/Review Form Section/button_Save'))

    WebUI.verifyElementText(findTestObject('Object Repository/OR Sabri/Review Form Section/label_Q1'), 'Q3')

    WebUI.click(findTestObject('Object Repository/OR Sabri/Review Form Section/i_General_bubble-icon-More-2 pointer text-dark'))

    WebUI.click(findTestObject('Object Repository/OR Sabri/Review Form Section/span_Delete'))
}