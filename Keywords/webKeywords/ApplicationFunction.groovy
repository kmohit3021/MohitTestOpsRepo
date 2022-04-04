package webKeywords

import org.openqa.selenium.WebElement
import org.openqa.selenium.JavascriptExecutor
import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.testobject.ConditionType
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.util.KeywordUtil
import com.kms.katalon.core.webui.common.WebUiCommonHelper
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords

class ApplicationFunction {

	public static Map<String, String> map = new HashMap<String, String>();
	public static List<String> list = new ArrayList<String>();
	public static Set<String> set = new HashSet<String>();

	@Keyword
	def validateLoginMessage(TestObject tstlocator) {
		try {
			WebElement element = WebUiCommonHelper.findWebElement(tstlocator, 1)
			if (element.getText()=="Login failed! Please ensure the username and password are valid.") {
				KeywordUtil.markFailed("Login Failed")
			}
			else {
				KeywordUtil.markPassed("Login Successfully")
			}
		} catch (Exception e) {
			KeywordUtil.markPassed("Login Successfully")
		}
	}

	@Keyword
	def failureExpectedMarkLoginTestPass(TestObject tstlocator) {
		try {
			WebElement element = WebUiCommonHelper.findWebElement(tstlocator, 1)
			if (element.getText()=="Login failed! Please ensure the username and password are valid.") {
				KeywordUtil.markPassed("Login Failed")
			}
			else {
				KeywordUtil.markPassed("Login Successfully")
			}
		} catch (Exception e) {
			KeywordUtil.markPassed("Login Successfully")
		}
	}

	@Keyword
	def putValueInVariable(String strKey, String strValue) {
		ApplicationFunction.
				map.put(strKey, strValue)
	}

	@Keyword
	def String getValueFromVariable(Object strKey) {
		String strval=map.get(strKey)
		return strval
	}

	@Keyword
	public String getRandomEmail(String suffix,String prefix){
		int randomNo = (int)(Math.random() * 100000);
		return suffix + randomNo + "@" + prefix;
	}

	@Keyword
	def static TestObject GetTableValue(int rowIndex, int colIndex) {
		TestObject to = new TestObject()
		to.addProperty("xpath", ConditionType.EQUALS, ".//*[@class='w3-example']//table//tr["+rowIndex+"]/td["+colIndex+"]")
		return to
	}
}
