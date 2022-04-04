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
import com.kms.katalon.keyword.excel.ExcelKeywords as ExcelKeywords

def strLoginMsg = null

try {
    strLoginMsg = WebUI.getText(findTestObject('OR Web Application/CURA Healthcare Service/Login Page/Login failed Please ensure the username'))
}
catch (Exception e) {
    WebUI.getText(findTestObject('OR Web Application/CURA Healthcare Service/Appointment Page/Make Appointment'))

    strLoginMsg = 'Login Successful'
} 

println(strLoginMsg)

int datafileRows = findTestData('Data Files/Excel Data file').getRowNumbers()

println(datafileRows)

String excelFilePath = 'MyTestFile/DDT2.xlsx'

String sheetName = 'Sheet1'

rowIdx = GlobalVariable.rowIndex

workbook01 = ExcelKeywords.getWorkbook(excelFilePath)

sheet01 = ExcelKeywords.getExcelSheet(workbook01, sheetName)

ExcelKeywords.setValueToCellByIndex(sheet01, rowIdx, 2, strLoginMsg)

ExcelKeywords.saveWorkbook(excelFilePath, workbook01)

GlobalVariable.rowIndex = (rowIdx + 1)

println('Value:- ' + GlobalVariable.rowIndex)

WebUI.closeBrowser()

