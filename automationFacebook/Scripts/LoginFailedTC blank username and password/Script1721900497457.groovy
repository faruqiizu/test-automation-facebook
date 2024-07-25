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

WebUI.openBrowser('')

WebUI.navigateToUrl('https://www.facebook.com/')

WebUI.click(findTestObject('Object Repository/Login/LoginFailed/Page_Facebook  log in or sign up/button_Log in'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Login/LoginFailed/Page_Log in to Facebook/img_Log in to Facebook__97vu img'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Login/LoginFailed/Page_Log in to Facebook/input_Log in to Facebook_email'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Login/LoginFailed/Page_Log in to Facebook/img_Log in to Facebook__9ay6 img'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Login/LoginFailed/Page_Log in to Facebook/div_The email address or mobile number you _93c7eb'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.closeBrowser()

