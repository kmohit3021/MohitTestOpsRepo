import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import org.openqa.selenium.By
import org.openqa.selenium.WebDriver
import org.openqa.selenium.WebElement

import com.kms.katalon.core.webui.driver.DriverFactory
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

WebUI.openBrowser('')

WebUI.navigateToUrl('https://accounts.google.com/signin/v2/identifier?service=cl&passive=1209600&osid=1&continue=https%3A%2F%2Fcalendar.google.com%2Fcalendar%2Fr&followup=https%3A%2F%2Fcalendar.google.com%2Fcalendar%2Fr&flowName=GlifWebSignIn&flowEntry=ServiceLogin')

WebUI.setText(findTestObject('Object Repository/OR Google Calendar/input_to continue to Google Calendar_identifier'), 'mohit.kumar@katalon.com')

WebUI.enhancedClick(findTestObject('Object Repository/OR Google Calendar/div_Learn more_VfPpkd-RLmnJb'))

WebUI.delay(2)

WebUI.setEncryptedText(findTestObject('Object Repository/OR Google Calendar/input_Too many failed attempts_password'), 'HWHXedaqLCc2pdv37RWlVg==')
WebUI.delay(2)
WebUI.enhancedClick(findTestObject('Object Repository/OR Google Calendar/span_Next'))
WebUI.delay(4)
WebUI.click(findTestObject('Object Repository/OR Google Calendar/div_16', ['strcalender':'20220301', 'strdate':'16']))
WebUI.delay(4)
WebDriver driver = DriverFactory.getWebDriver()

int items = driver.findElements(By.xpath("//*[@data-opens-details='true']")).size()

println(items)

for (int i = 2; i < items; i++) {
	WebElement calendarevent = driver.findElement(By.xpath(("//*[@data-opens-details='true']["+i+"]")))
	String strText = calendarevent.text
	if((strText.contains("Katalon demo for GOSI"))==true) {
		println(strText)
		break
	}
}

not_run: WebUI.click(findTestObject('Object Repository/OR Google Calendar/span_httpscredit-suisse.zoom.usj93572116916_9eb7a1'))

not_run: WebUI.click(findTestObject('Object Repository/OR Google Calendar/span_No'))

