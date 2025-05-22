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
 * 
 * 1 . Open browser to the url GlobaVariable.urlCura
 * 2. Click en button with id 'Page_CURA Healthcare Service/a_Make Appointment'
 * 3. Fill in the user name 'Page_CURA Healthcare Service/input_Username_username' with the value 'John Doe'
 * 4 . Fill in the password 'Page_CURA Healthcare Service/input_Password_password' with the value encrypted 'ThisIsNotAPassword'
 * 5. Click in login button with the id 'Page_CURA Healthcare Service/button_Login'*/
// Open the browser to the specified URL
WebUI.openBrowser(GlobalVariable.urlCura)

// Click on the button to make an appointment
WebUI.click(findTestObject('Page_CURA Healthcare Service/a_Make Appointment'))

// Fill in the username field with the value 'John Doe'
WebUI.setText(findTestObject('Page_CURA Healthcare Service/input_Username_username'), 'John Doe')

// Fill in the password field with the encrypted value
WebUI.setText(findTestObject('Page_CURA Healthcare Service/input_Password_password'), 'ThisIsNotAPassword')

// Click on the login button
WebUI.click(findTestObject('Page_CURA Healthcare Service/button_Login'))

 
 
