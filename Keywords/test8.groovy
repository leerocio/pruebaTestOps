import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows

import internal.GlobalVariable

public class test8 {
	@Keyword
	def test08() {
		WebUI.navigateToUrl(GlobalVariable.urlDemoQa)

		WebUI.maximizeWindow()

		WebUI.scrollToPosition(0, 120)

		WebUI.click(findTestObject('Object Repository/Reto_1/Page_DEMOQA/div_Elements_card-up'))

		WebUI.click(findTestObject('Object Repository/Reto_1/Page_DEMOQA/li_Check Box'))

		WebUI.click(findTestObject('Object Repository/Reto_1/Page_DEMOQA/svg_Book Store API_rct-icon rct-icon-uncheck'))

		WebUI.scrollToPosition(0, 240)

		WebUI.click(findTestObject('Object Repository/Reto_1/Page_DEMOQA/li_Radio Button'))

		WebUI.click(findTestObject('Object Repository/Reto_1/Page_DEMOQA/label_Yes'))

		WebUI.click(findTestObject('Object Repository/Reto_1/Page_DEMOQA/label_Impressive'))

		WebUI.click(findTestObject('Object Repository/Reto_1/Page_DEMOQA/label_Yes'))

		WebUI.click(findTestObject('Object Repository/Reto_1/Page_DEMOQA/div_Radio Button'))

		WebUI.verifyElementText(findTestObject('Reto_1/Page_DEMOQA/div_Radio Button'), 'Radio Button')
	}
}
