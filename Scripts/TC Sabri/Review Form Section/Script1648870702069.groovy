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

WebUI.click(findTestObject('Object Repository/OR Sabri/Review Form Section/a_Review Form Sections'))

WebUI.verifyElementText(findTestObject('Object Repository/OR Sabri/Review Form Section/span_Review Form Sections'), 'Review Form Sections')

WebUI.verifyElementText(findTestObject('Object Repository/OR Sabri/Review Form Section/label_Manager Recommendations'), 
    'Manager Recommendations')

WebUI.click(findTestObject('Object Repository/OR Sabri/Review Form Section/button_Add'))

if (Type == 'Text') {
    WebUI.setText(findTestObject('Object Repository/OR Sabri/Review Form Section/textarea__question'), Question)

    WebUI.click(findTestObject('Object Repository/OR Sabri/Review Form Section/button_Select'))

    WebUI.click(findTestObject('Object Repository/OR Sabri/Review Form Section/div_General'))

    WebUI.click(findTestObject('Object Repository/OR Sabri/Review Form Section/span_Select Question Type'))

    WebUI.click(findTestObject('Object Repository/OR Sabri/Review Form Section/div_Text'))

    WebUI.click(findTestObject('Object Repository/OR Sabri/Review Form Section/button_Save'))

    not_run: WebUI.scrollToElement(findTestObject('Object Repository/OR Sabri/Review Form Section/label_Q1'), 5)

    WebUI.verifyElementText(findTestObject('Object Repository/OR Sabri/Review Form Section/label_Q1'), Question)

    WebUI.click(findTestObject('Object Repository/OR Sabri/Review Form Section/i_General_bubble-icon-More-2 pointer text-dark'))

    WebUI.click(findTestObject('Object Repository/OR Sabri/Review Form Section/span_Delete'))
}

if (Type == 'List') {
    String val = Options

    List list = val.split(',')

    println(list.size())

    WebUI.setText(findTestObject('Object Repository/OR Sabri/Review Form Section/textarea__question'), Question)

    WebUI.click(findTestObject('Object Repository/OR Sabri/Review Form Section/button_Select'))

    WebUI.click(findTestObject('Object Repository/OR Sabri/Review Form Section/div_General'))

    WebUI.click(findTestObject('Object Repository/OR Sabri/Review Form Section/span_Select Question Type'))

    WebUI.click(findTestObject('Object Repository/OR Sabri/Review Form Section/div_List'))

    WebUI.click(findTestObject('Object Repository/OR Sabri/Review Form Section/i_Options_bubble-icon-Trash pointer remove-_0beebe'))

    WebUI.click(findTestObject('Object Repository/OR Sabri/Review Form Section/i_Options_bubble-icon-Trash pointer remove-_0beebe'))

    for (int i = 0; i < list.size(); i++) {
        WebUI.click(findTestObject('Object Repository/OR Sabri/Review Form Section/span_Add'))

        WebUI.setText(findTestObject('Object Repository/OR Sabri/Review Form Section/input_Options_options', [('index') : i + 
                    1]), list.get(i))
    }
    
    WebUI.click(findTestObject('Object Repository/OR Sabri/Review Form Section/button_Save'))
	
	not_run: WebUI.scrollToElement(findTestObject('Object Repository/OR Sabri/Review Form Section/label_Q1'), 5)

    WebUI.verifyElementText(findTestObject('Object Repository/OR Sabri/Review Form Section/label_Q1'), Question)

    WebUI.click(findTestObject('Object Repository/OR Sabri/Review Form Section/i_General_bubble-icon-More-2 pointer text-dark'))

    WebUI.click(findTestObject('Object Repository/OR Sabri/Review Form Section/span_Delete'))
}

if (Type == 'Single Selection') {
    String val = Options

    List list = val.split(',')

    println(list.size())

    WebUI.setText(findTestObject('Object Repository/OR Sabri/Review Form Section/textarea__question'), Question)

    WebUI.click(findTestObject('Object Repository/OR Sabri/Review Form Section/button_Select'))

    WebUI.click(findTestObject('Object Repository/OR Sabri/Review Form Section/div_General'))

    WebUI.click(findTestObject('Object Repository/OR Sabri/Review Form Section/span_Select Question Type'))

    WebUI.click(findTestObject('Object Repository/OR Sabri/Review Form Section/div_Single Selection'))

    WebUI.click(findTestObject('Object Repository/OR Sabri/Review Form Section/i_Options_bubble-icon-Trash pointer remove-_0beebe'))

    WebUI.click(findTestObject('Object Repository/OR Sabri/Review Form Section/i_Options_bubble-icon-Trash pointer remove-_0beebe'))

    for (int i = 0; i < list.size(); i++) {
        WebUI.click(findTestObject('Object Repository/OR Sabri/Review Form Section/span_Add'))

        WebUI.setText(findTestObject('Object Repository/OR Sabri/Review Form Section/input_Options_options', [('index') : i + 
                    1]), list.get(i))
    }
    
    WebUI.click(findTestObject('Object Repository/OR Sabri/Review Form Section/button_Save'))
	
	not_run: WebUI.scrollToElement(findTestObject('Object Repository/OR Sabri/Review Form Section/label_Q1'), 5)

    WebUI.verifyElementText(findTestObject('Object Repository/OR Sabri/Review Form Section/label_Q1'), Question)

    WebUI.click(findTestObject('Object Repository/OR Sabri/Review Form Section/i_General_bubble-icon-More-2 pointer text-dark'))

    WebUI.click(findTestObject('Object Repository/OR Sabri/Review Form Section/span_Delete'))
}

