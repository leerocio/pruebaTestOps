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

WebUI.callTestCase(findTestCase('50testCase/007 - open demoQa'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.scrollToElement(findTestObject('Page_DEMOQA/Page_DEMOQA/div_Elements'), 0)

WebUI.click(findTestObject('Object Repository/Page_DEMOQA/Page_DEMOQA/div_Elements'))

WebUI.scrollToElement(findTestObject('Page_DEMOQA/Page_DEMOQA/li_Dynamic Properties'), 0)

WebUI.click(findTestObject('Object Repository/Page_DEMOQA/Page_DEMOQA/li_Dynamic Properties'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_DEMOQA/Page_DEMOQA/button_Will enable 5 seconds'), 0)

WebUI.verifyElementVisible(findTestObject('Object Repository/Page_DEMOQA/Page_DEMOQA/p_This text has random Id'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Page_DEMOQA/Page_DEMOQA/h1_Dynamic Properties'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Page_DEMOQA/Page_DEMOQA/button_Color Change'))

WebUI.closeBrowser()

