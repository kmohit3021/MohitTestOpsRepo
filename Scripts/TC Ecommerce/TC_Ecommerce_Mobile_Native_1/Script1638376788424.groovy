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

Mobile.startApplication('/Users/katalon/Documents/APK/Meesho Online Shopping App_v11.3_apkpure.com.apk', true)

Mobile.tap(findTestObject('Object Repository/OR Mobile/OR_Mobile_Meesho/android.view.View'), 0)

Mobile.tap(findTestObject('Object Repository/OR Mobile/OR_Mobile_Meesho/android.widget.ImageView'), 0)

Mobile.tap(findTestObject('Object Repository/OR Mobile/OR_Mobile_Meesho/android.widget.TextView - Women Ethnic'), 0)

Mobile.tap(findTestObject('Object Repository/OR Mobile/OR_Mobile_Meesho/android.widget.ImageView (1)'), 0)

Mobile.tap(findTestObject('Object Repository/OR Mobile/OR_Mobile_Meesho/android.widget.ImageView (2)'), 0)

Mobile.tap(findTestObject('Object Repository/OR Mobile/OR_Mobile_Meesho/android.widget.ImageView (3)'), 0)

Mobile.tap(findTestObject('Object Repository/OR Mobile/OR_Mobile_Meesho/android.widget.TextView -  100  -  149'), 0)

Mobile.tap(findTestObject('Object Repository/OR Mobile/OR_Mobile_Meesho/android.widget.Button - Done'), 0)

Mobile.tap(findTestObject('Object Repository/OR Mobile/OR_Mobile_Meesho/android.widget.ImageView (4)'), 0)

Mobile.tap(findTestObject('Object Repository/OR Mobile/OR_Mobile_Meesho/android.widget.TextView - USE ANOTHER MOBILE NUMBER'), 
    0)

Mobile.tap(findTestObject('Object Repository/OR Mobile/OR_Mobile_Meesho/android.widget.Button - NONE OF THE ABOVE'), 0)

Mobile.setText(findTestObject('Object Repository/OR Mobile/OR_Mobile_Meesho/android.widget.EditText - Phone Number'), '123456789', 
    0)

Mobile.tap(findTestObject('Object Repository/OR Mobile/OR_Mobile_Meesho/android.widget.Button - Send OTP'), 0)

Mobile.getText(findTestObject('Object Repository/OR Mobile/OR_Mobile_Meesho/android.widget.TextView - Enter a valid mobile number'), 
    0)

Mobile.closeApplication()

