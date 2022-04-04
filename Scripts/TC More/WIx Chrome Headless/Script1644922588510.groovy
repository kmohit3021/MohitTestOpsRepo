import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import org.apache.commons.io.FileUtils as FileUtils
import org.openqa.selenium.WebDriver as WebDriver
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory
import com.kms.katalon.core.webui.driver.WebUIDriverType as WebUIDriverType
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.webui.keyword.internal.WebUIAbstractKeyword as WebUIAbstractKeyword
import ch.qos.logback.core.util.FileUtil as FileUtil
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import internal.GlobalVariable as GlobalVariable

WebUI.openBrowser('')

WebUI.maximizeWindow()

WebUI.navigateToUrl('https://www.wix.com/')

WebUI.click(findTestObject('Object Repository/OR Wix/span_Get Started'))

WebUI.delay(5)

WebUI.click(findTestObject('OR Wix/span_Continue with Google'))

WebDriver driver = DriverFactory.getWebDriver()

FileUtils.write(new File('/Users/katalon/Documents/ContinuewithGoogle.html'), driver.getPageSource())

WebUI.delay(10, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.switchToWindowIndex(1, FailureHandling.CONTINUE_ON_FAILURE)

FileUtils.write(new File('/Users/katalon/Documents/source.html'), driver.getPageSource())

if (DriverFactory.getExecutedBrowser() == WebUIDriverType.CHROME_DRIVER) {
    println('IN IF..............????????')

    WebUI.setText(findTestObject('Object Repository/OR Wix/input_Wix_identifier'), 'mohit.kumar@katalon.com')

    WebUI.enhancedClick(findTestObject('Object Repository/OR Wix/div_Terms of Service_VfPpkd-RLmnJb'))

    WebUI.waitForElementVisible(findTestObject('OR Wix/input_Too many failed attempts_password'), 30)

    WebUI.setEncryptedText(findTestObject('Object Repository/OR Wix/input_Too many failed attempts_password'), 'HWHXedaqLCc2pdv37RWlVg==')

    WebUI.enhancedClick(findTestObject('Object Repository/OR Wix/span_Next'))
} else {
    println('IN ELSE..............????????')

    WebUI.setText(findTestObject('OR Wix/input_Wix_identifier - HLC'), 'mohit.kumar@katalon.com')

    FileUtils.write(new File('/Users/katalon/Documents/next1.html'), driver.getPageSource())

    WebUI.enhancedClick(findTestObject('OR Wix/div_Terms of Service_VfPpkd-RLmnJb - HLC'))

    FileUtils.write(new File('/Users/katalon/Documents/password.html'), driver.getPageSource())

    WebUI.waitForElementVisible(findTestObject('OR Wix/input_Too many failed attempts_password - HLC'), 30)

    FileUtils.write(new File('/Users/katalon/Documents/next2.html'), driver.getPageSource())

    WebUI.setEncryptedText(findTestObject('OR Wix/input_Too many failed attempts_password - HLC'), 'HWHXedaqLCc2pdv37RWlVg==')

    WebUI.enhancedClick(findTestObject('OR Wix/span_Next - HLC'))
}

WebUI.delay(30)

WebUI.closeBrowser()

