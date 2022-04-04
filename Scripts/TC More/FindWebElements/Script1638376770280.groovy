import java.awt.List as List
import org.openqa.selenium.By as By
import org.openqa.selenium.WebDriver as WebDriver
import org.openqa.selenium.Web
import org.openqa.selenium.chrome.ChromeDriver as ChromeDriver
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory
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

WebUI.openBrowser('https://www.w3schools.com/html/html_tables.asp')

WebUI.delay(2)

WebDriver driver = DriverFactory.getWebDriver()


int items = driver.findElements(By.xpath('//table[@id=\'customers\']/tbody/tr[2]/td')).size()

println(items)

for (int i = 1; i <= items; i++) {
    WebElement rows_table = driver.findElement(By.xpath(('//table[@id=\'customers\']/tbody/tr[2]/td[' + i) + ']'))

    println(rows_table.text)

    CustomKeywords.'webKeywords.WriteExcel.setCellDataExcel'(i, 1, rows_table.text)

}

//System.setProperty("webdriver.chrome.driver", DriverFactory.getChromeDriverPath())
//WebDriver driver = new ChromeDriver()
//driver.get("https://www.w3schools.com/html/html_tables.asp")
//List<WebElement> foundElements = driver.findElements(By.xpath("//table[@id='customers']/tbody/tr[2]/td"))
WebUI.delay(2)

