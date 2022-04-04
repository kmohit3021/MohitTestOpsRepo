package mobileKeywords
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testcase.TestCaseFactory
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testdata.TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords

import internal.GlobalVariable

import org.openqa.selenium.WebElement
import org.openqa.selenium.WebDriver
import org.openqa.selenium.By

import com.kms.katalon.core.mobile.keyword.internal.MobileDriverFactory
import com.kms.katalon.core.webui.driver.DriverFactory

import com.kms.katalon.core.testobject.RequestObject
import com.kms.katalon.core.testobject.ResponseObject
import com.kms.katalon.core.testobject.ConditionType
import com.kms.katalon.core.testobject.TestObjectProperty

import com.kms.katalon.core.mobile.helper.MobileElementCommonHelper
import com.kms.katalon.core.util.KeywordUtil

import com.kms.katalon.core.webui.exception.WebElementNotFoundException


class ApplicationFunction {

	@Keyword
	def isElementPresent_inMoble(TestObject to){
		try {
			boolean element = MobileElementCommonHelper.findElement(to, 2).isDisplayed()
			if (element==true ) {
				println("inside loop")
				MobileElementCommonHelper.findElement(findTestObject('Object Repository/OR API Demos/android.widget.Button - OK'), 1).click()
				MobileElementCommonHelper.findElement(findTestObject('Object Repository/OR API Demos/android.widget.TextView - OK'), 1).click()
			}
		} catch (Exception e) {
		}
	}

	@Keyword
	def setText_inMoble(TestObject to, String percentValue){
		MobileElementCommonHelper.findElement(to, 5).sendKeys(String.valueOf(percentValue))
	}


	@Keyword
	def isElementPresent_olderVersion(TestObject to){
		try {
			boolean element = MobileElementCommonHelper.findElement(to, 2).isDisplayed()
			if (element==true ) {
				MobileElementCommonHelper.findElement(findTestObject('OR Mobile/OR Mobile Android/android.widget.Button - OK for older version'), 1).click()
			}
		} catch (Exception e) {
		}
	}

	@Keyword
	def isElementPresent_changeLog(TestObject to){
		try {
			boolean element = MobileElementCommonHelper.findElement(to, 1).isDisplayed()
			if (element==true ) {
				MobileElementCommonHelper.findElement(findTestObject('OR Mobile/OR Mobile Android/android.widget.TextView - OK Change Log'), 1).click()
			}
		} catch (Exception e) {
		}
	}

	@Keyword
	def isElementPresent_Continue_Choose_what_to_allow(TestObject to){
		try {
			boolean element = MobileElementCommonHelper.findElement(to, 2).isDisplayed()
			if (element==true ) {
				MobileElementCommonHelper.findElement(findTestObject('OR Mobile/OR Mobile Android/android.widget.Button - Continue-Choose what to allow'), 1).click()
			}
		} catch (Exception e) {
		}
	}
}