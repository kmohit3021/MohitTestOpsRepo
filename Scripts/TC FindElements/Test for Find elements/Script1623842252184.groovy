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
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.apache.poi.hssf.record.PageBreakRecord.Break as Break
import org.openqa.selenium.*

WebUI.openBrowser('http://demo.guru99.com/test/ajax.html')

WebUI.click(findTestObject('OR FindElements/Page_Ajax Test/input_Yes_name'))

WebUI.maximizeWindow()

WebDriver driver = DriverFactory.getWebDriver()

List<WebElement> webelmt = driver.findElements(By.xpath('.//*[@id=\'navbar-brand-centered\']/ul/li'))

for (WebElement e : webelmt) {
    println(e.getText())

    if (e.getText().equalsIgnoreCase('Telecom Project')) {
        e.click()

        break
    }
}


WebUI.delay(5)

WebUI.click(findTestObject('OR FindElements/Page_Guru99 Telecom/a_Add Customer'))

WebUI.click(findTestObject('OR FindElements/Page_Guru99 Telecom Add Customer/label_Done'))

WebUI.setText(findTestObject('OR FindElements/Page_Guru99 Telecom Add Customer/input_Billing address_fname'), 'Mohit')

WebUI.setText(findTestObject('OR FindElements/Page_Guru99 Telecom Add Customer/input_Customer name must not be blank_emailid'), 
    'abc@123.com')

WebUI.setText(findTestObject('OR FindElements/Page_Guru99 Telecom Add Customer/textarea_Email-ID must not be blank_addr'), 
    'INDIA')

WebUI.setText(findTestObject('OR FindElements/Page_Guru99 Telecom Add Customer/input_Address Field must not be blank_telephoneno'), 
    '12345')

WebUI.click(findTestObject('OR FindElements/Page_Guru99 Telecom Add Customer/input_Mobile no must not be blank_submit'))

WebUI.closeBrowser()


