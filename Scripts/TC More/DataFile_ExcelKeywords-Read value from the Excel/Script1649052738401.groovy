import com.kms.katalon.keyword.excel.ExcelKeywords as ExcelKeywords
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
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

String excelFilePath = 'MyTestFile/DDT2.xlsx'

String sheetName = 'Sheet1'

//workbook01 = CustomKeywords.'com.kms.katalon.keyword.excel.ExcelKeywords.getWorkbook'(excelFilePath)

//sheet01 = CustomKeywords.'com.kms.katalon.keyword.excel.ExcelKeywords.getExcelSheet'(workbook01, sheetName)

//strValue = CustomKeywords.'com.kms.katalon.keyword.excel.ExcelKeywords.getCellValueByIndex'(sheet01, 2, 2)

//println('Value:- ' + strValue)

int datafileRows = findTestData('Data Files/Excel Data file').getRowNumbers()

for(int i=1;i<=datafileRows;i++) {

println('Value:- ' + datafileRows)

String value2 = findTestData('Data Files/Excel Data file').getValue('result', i)

println('Value:- ' + value2)

}



