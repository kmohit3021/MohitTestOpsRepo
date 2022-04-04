package grid
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testcase.TestCaseFactory
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testdata.TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords
import com.sun.org.apache.bcel.internal.generic.RETURN

import internal.GlobalVariable

import org.openqa.selenium.WebElement
import org.openqa.selenium.WebDriver
import org.openqa.selenium.By

import com.kms.katalon.core.mobile.keyword.internal.MobileDriverFactory
import com.kms.katalon.core.webui.common.WebUiCommonHelper
import com.kms.katalon.core.webui.driver.DriverFactory

import com.kms.katalon.core.testobject.RequestObject
import com.kms.katalon.core.testobject.ResponseObject
import com.kms.katalon.core.testobject.ConditionType
import com.kms.katalon.core.testobject.TestObjectProperty

import com.kms.katalon.core.mobile.helper.MobileElementCommonHelper
import com.kms.katalon.core.util.KeywordUtil

import com.kms.katalon.core.webui.exception.WebElementNotFoundException


public class GridHelper {


	private TestObject getTestObject(TestObject baseTestObject, String xpath) {
		String basexpath = baseTestObject.getProperties().get(0).getValue();
		String updatedxpath = basexpath + xpath;

		TestObject updatedTestobject =  new TestObject("WebTableTestObject")
		updatedTestobject.addProperty("xpath", ConditionType.EQUALS, updatedxpath)
		return updatedTestobject
	}

	@Keyword
	public String getValueFromGrid(TestObject baseTestobject, int rowi, int coli) {
		TestObject updatedNewtestobject = getTestObject(baseTestobject, "/tr["+rowi+"]/td["+coli+"]")
		return WebUiBuiltInKeywords.getText(updatedNewtestobject)
	}
}