import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import org.openqa.selenium.remote.DesiredCapabilities

import com.kms.katalon.core.mobile.helper.MobileCommonHelper
import com.kms.katalon.core.mobile.helper.MobileDeviceCommonHelper
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile

import io.appium.java_client.remote.MobileCapabilityType


Mobile.startApplication(app, false)

CustomKeywords.'mobileKeywords.ApplicationFunction.isElementPresent_olderVersion'(findTestObject('OR Mobile/OR Mobile Android/android.widget.Button - OK'))

CustomKeywords.'mobileKeywords.ApplicationFunction.isElementPresent_changeLog'(findTestObject('OR Mobile/OR Mobile Android/android.widget.TextView - OK'))

Mobile.tap(findTestObject('OR Mobile/OR Mobile Android/android.widget.TextView - API Demos'), 1)

Mobile.tap(findTestObject('OR Mobile/OR Mobile Android/android.widget.TextView - Security'), 1)

Mobile.tap(findTestObject('OR Mobile/OR Mobile Android/android.widget.TextView - KeyStore'), 1)

Mobile.setText(findTestObject('OR Mobile/OR Mobile Android/android.widget.EditText'), 'Plain Text 123', 1)

Mobile.setText(findTestObject('OR Mobile/OR Mobile Android/android.widget.EditText (1)'), 'Cipher text 123', 1)

Mobile.pressBack()

Mobile.pressBack()

Mobile.pressBack()

Mobile.pressBack()

Mobile.closeApplication()

