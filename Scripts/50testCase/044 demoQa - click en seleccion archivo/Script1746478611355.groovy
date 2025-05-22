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

WebUI.scrollToPosition(0, 120)

WebUI.click(findTestObject('Object Repository/Page_DEMOQA/Page_DEMOQA/div_Elements'))

WebUI.scrollToPosition(0, 300)

WebUI.click(findTestObject('Object Repository/Page_DEMOQA/Page_DEMOQA/li_Upload and Download'))

WebUI.scrollToPosition(0, 250)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_DEMOQA/Page_DEMOQA/input_Select a file_uploadFile'), 0)

WebUI.closeBrowser()

