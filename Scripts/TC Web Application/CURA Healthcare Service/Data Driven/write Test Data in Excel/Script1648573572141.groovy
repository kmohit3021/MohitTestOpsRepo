import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.keyword.excel.ExcelKeywords as ExcelKeywords
import internal.GlobalVariable as GlobalVariable
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint

WebUI.setText(findTestObject('OR Web Application/CURA Healthcare Service/Login Page/input_Username'), username)

WebUI.takeScreenshot()

WebUI.setText(findTestObject('OR Web Application/CURA Healthcare Service/Login Page/input_Password'), password)

WebUI.takeScreenshot()

WebUI.click(findTestObject('OR Web Application/CURA Healthcare Service/Login Page/button_Login'))

WebUI.takeScreenshot()

def strLoginMsg = null

try {
    strLoginMsg = WebUI.getText(findTestObject('null'))
}
catch (Exception e) {
    WebUI.getText(findTestObject('null'))

    strLoginMsg = 'Login Successful'

    WebUI.click(findTestObject('OR Web Application/CURA Healthcare Service/Home Page/menu-toggle'))

    WebUI.click(findTestObject('OR Web Application/CURA Healthcare Service/Home Page/Logout'))

    WebUI.callTestCase(findTestCase('TC Web Application/CURA Healthcare Service/Appointment/Click on Login Link'), [:], 
        FailureHandling.STOP_ON_FAILURE)
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

