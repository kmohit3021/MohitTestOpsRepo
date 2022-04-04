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



int datafileRows = findTestData('Data Files/DF Sabri/SabriDataFile').getRowNumbers()

rowIdx = GlobalVariable.rowIndex

WebUI.setText(findTestObject('Object Repository/OR Sabri/input_Note_rating_scalesscale', [('index') : rowIdx]), rating)

WebUI.setText(findTestObject('Object Repository/OR Sabri/input_Note_rating_scalesshort_code', [('index') : rowIdx]), shortCode)

WebUI.setText(findTestObject('Object Repository/OR Sabri/input_Note_rating_scalesdescription', [('index') : rowIdx]), description)

WebUI.setText(findTestObject('Object Repository/OR Sabri/input_Note_rating_scalesnotes', [('index') : rowIdx]), note)

GlobalVariable.rowIndex = (rowIdx + 1)

println(rowIdx +":"+ datafileRows)

while (rowIdx < datafileRows) {
    WebUI.click(findTestObject('Object Repository/OR Sabri/span_Add'))
    break
}

