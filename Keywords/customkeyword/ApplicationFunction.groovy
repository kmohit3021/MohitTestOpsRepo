package customkeyword
import org.openqa.selenium.WebElement

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.testobject.ConditionType
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.util.KeywordUtil
import com.kms.katalon.core.webui.common.WebUiCommonHelper
import com.sun.org.apache.bcel.internal.generic.RETURN

import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords

class ApplicationFunction {

	@Keyword
	def click_HighRadius(String objValue) {
		TestObject to = new TestObject()
		WebUiBuiltInKeywords.clickOffset(to.addProperty("xpath", ConditionType.EQUALS, ".//*[@id='"+objValue+"']"), 0, 0)
	}
	
	@Keyword
	def setText_HighRadius(String objValue, String txtValue) {
		TestObject to = new TestObject()
		WebUiBuiltInKeywords.setText(to.addProperty("xpath", ConditionType.EQUALS, ".//*[@id='"+objValue+"']"), txtValue)
	}

	def static TestObject giveHigtRadiusObject(String value) {
		TestObject to = new TestObject()
		to.addProperty("xpath", ConditionType.EQUALS, ".//*[@id="+value+"]")
		return to
	}

	@Keyword
	public String getRandomEmail(String suffix,String prefix){
		int randomNo = (int)(Math.random() * 100000);
		return suffix + randomNo + "@" + prefix;
	}
}
