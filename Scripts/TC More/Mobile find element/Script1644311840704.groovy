import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.mobile.keyword.internal.MobileDriverFactory as MobileDriverFactory
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
import org.openqa.selenium.remote.DesiredCapabilities as Keys
import io.appium.java_client.AppiumDriver as AppiumDriver
import org.openqa.selenium.*
import org.openqa.selenium.By.ByXPath as ByXPath

Mobile.startApplication('/Users/katalon/Documents/APK/CRMNextNative 6.29.0-release_screenshot_enabled.apk', false)

Mobile.tap(findTestObject('Object Repository/OR CRMNEXT/android.widget.Button - SKIP'), 20)

Mobile.tap(findTestObject('Object Repository/OR CRMNEXT/android.widget.TextView - Continue'), 20)

try {
    entermPin = Mobile.getText(findTestObject('OR CRMNEXT/Object Spy Capture/android.widget.TextView - Enter M-Pin'), 20)

    if (entermPin == 'Enter M-Pin') {
        Mobile.setText(findTestObject('Object Repository/OR CRMNEXT/android.widget.EditText'), '1', 20)

        Mobile.setText(findTestObject('Object Repository/OR CRMNEXT/android.widget.EditText (1)'), '2', 20)

        Mobile.setText(findTestObject('Object Repository/OR CRMNEXT/android.widget.EditText (2)'), '3', 20)

        Mobile.setText(findTestObject('Object Repository/OR CRMNEXT/android.widget.EditText (3)'), '4', 20)

        Mobile.setText(findTestObject('Object Repository/OR CRMNEXT/android.widget.EditText (4)'), '1', 20)

        Mobile.setText(findTestObject('Object Repository/OR CRMNEXT/android.widget.EditText (5)'), '2', 20)

        Mobile.setText(findTestObject('Object Repository/OR CRMNEXT/android.widget.EditText (6)'), '3', 20)

        Mobile.setText(findTestObject('Object Repository/OR CRMNEXT/android.widget.EditText (7)'), '4', 20)
    }
}
finally { 
}

Mobile.waitForElementPresent(findTestObject('OR CRMNEXT/Object Spy Capture/android.view.View - Login to your account'), 
    20)

Mobile.setText(findTestObject('Object Repository/OR CRMNEXT/android.widget.EditText (8)'), 'Sushant', 20)

Mobile.setText(findTestObject('Object Repository/OR CRMNEXT/android.widget.EditText - Password'), 'Abc@12345', 20)

Mobile.tap(findTestObject('OR CRMNEXT/android.view.View -'), 20)

not_run: Mobile.tap(findTestObject('OR CRMNEXT/android.widget.Button - Login'), 20)

//Mobile.tap(findTestObject('OR CRMNEXT/android.widget.Button - Login'), 20)
AppiumDriver driver = MobileDriverFactory.getDriver()

driver.findElement(ByXPath.xpath('//*[@class = \'android.widget.Button\' and (@text = \'Login\' or . = \'Login\')]')).click()

Mobile.waitForElementPresent(findTestObject('OR CRMNEXT/Object Spy Capture/android.widget.ImageView_hamburger_icon'), 30)

WebUI.callTestCase(findTestCase('null'), [:], FailureHandling.STOP_ON_FAILURE)

