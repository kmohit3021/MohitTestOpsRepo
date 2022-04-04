import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.callTestCase(findTestCase('TC Web Application/CURA Healthcare Service/Appointment/Open Browser'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('TC Web Application/CURA Healthcare Service/Appointment/Click on Login Link'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('TC Web Application/CURA Healthcare Service/Appointment/Login Application'), [('varMakeAppointment') : 'Make Appointment'
        , ('username') : '', ('password') : ''], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('TC Web Application/CURA Healthcare Service/Appointment/Make Appointment'), [:])

WebUI.callTestCase(findTestCase('TC Web Application/CURA Healthcare Service/Appointment/Logout Application'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('TC Mobile/Mobile Testing Native app Web Mobile Combo'), [('app') : GlobalVariable.Android_App], 
    FailureHandling.STOP_ON_FAILURE)

