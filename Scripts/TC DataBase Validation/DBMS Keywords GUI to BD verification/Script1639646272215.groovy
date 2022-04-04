import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import java.sql.Connection as Connection
import java.sql.ResultSet as ResultSet
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.util.KeywordUtil as KeywordUtil
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import groovy.util.logging.Log as Log
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

Connection globalConnection

ResultSet rs

WebUI.openBrowser('')

WebUI.navigateToUrl('https://www.w3schools.com/html/html_tables.asp')

WebUI.maximizeWindow()

//WebUI.click(findTestObject('OR W3school/div_CustomerID'))
globalConnection = CustomKeywords.'com.katalon.plugin.keyword.connection.DatabaseKeywords.getGlobalConnection'()

rs = CustomKeywords.'com.katalon.plugin.keyword.connection.DatabaseKeywords.executeQuery'(globalConnection, 'select * from testtable')

System.out.println('Result Set----->>' + rs)

int rowno = CustomKeywords.'com.katalon.plugin.keyword.connection.ResultSetKeywords.getRowCount'(rs)

System.out.println('Row count----->>' + rowno)

int colno = CustomKeywords.'com.katalon.plugin.keyword.connection.ResultSetKeywords.getColumnCount'(rs)

System.out.println('Column count----->>' + colno)

String rowValue = CustomKeywords.'com.katalon.plugin.keyword.connection.ResultSetKeywords.getSingleRowValue'(rs, 2)

System.out.println('Row value----->>' + rowValue)

for (int i = 1; i <= rowno; i++) {
    for (int j = 1; j <= rowno; j++) {
        String valGUI = WebUI.getText(CustomKeywords.'webKeywords.ApplicationFunction.GetTableValue'(i + 1, j))

        String valDB = CustomKeywords.'com.katalon.plugin.keyword.connection.ResultSetKeywords.getSingleCellValue'(rs, i, 
            j)

        KeywordUtil.logInfo((('GUI Value is:- ' + valGUI) + ', DB Value is:- ') + valDB)

        try {
            WebUI.verifyEqual(valGUI, valDB)
        }
        catch (Exception e) {
        } 
    }
}

WebUI.closeBrowser()

