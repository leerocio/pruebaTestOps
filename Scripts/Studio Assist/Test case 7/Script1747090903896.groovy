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

/*
1. open browser to the url GlobaVariable.urlDemoQa
 2. scroll to the element with id 'Page_DEMOQA/div_Interactions'
* 3. click in div interactions with the id 'Page_DEMOQA/Page_DEMOQA/div_Elements'
* 4. click in texbox with id 'Page_DEMOQA/Page_DEMOQA/li_Text Box'
* 5. verify element text is present, with id 'Page_DEMOQA/Page_DEMOQA/h1_Text Box' with Expected Text 'texBox'
* 6. Close the browser*/
// Open the browser to the specified URL
WebUI.openBrowser(GlobalVariable.urlDemoQa)

// Scroll to the element with the specified ID
WebUI.scrollToElement(findTestObject('Page_DEMOQA/div_Interactions'), 10)

// Click on the div interactions with the specified ID
WebUI.click(findTestObject('Page_DEMOQA/Page_DEMOQA/div_Elements'))

// Click on the textbox with the specified ID
WebUI.click(findTestObject('Page_DEMOQA/Page_DEMOQA/li_Text Box'))

// Verify that the element text is present with the specified ID and expected text
WebUI.verifyElementText(findTestObject('Page_DEMOQA/Page_DEMOQA/h1_Text Box'), 'Text Box')

// Close the browser
WebUI.closeBrowser()

