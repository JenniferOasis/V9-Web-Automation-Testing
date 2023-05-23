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

WebUI.maximizeWindow()

WebUI.navigateToUrl('https://v9bet-member.v9sb.com/en-gb')

WebUI.setText(findTestObject('Object Repository/Page_V9BET - Discover The Ultimate Gaming E_9e709f/input__UserIdentifier'), 
    'jentest4')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_V9BET - Discover The Ultimate Gaming E_9e709f/input__Password'), 
    'etnztmOpJdtfo2nvlgKCfg==')

WebUI.waitForPageLoad(10)

WebUI.click(findTestObject('Object Repository/Page_V9BET - Discover The Ultimate Gaming E_9e709f/button_Login'))

'"Account will not be able to log in to the website\nMessage ""Inactive account, please contact customer service"" will be displayed."\r\n\r\n\r\r\n'
WebUI.verifyElementText(findTestObject('Page_V9BET - Discover The Ultimate Gaming E_9e709f/ID_invalid_alert_message'), 'Inactive account, please contact customer service')

WebUI.waitForPageLoad(10)

WebUI.closeBrowser()

