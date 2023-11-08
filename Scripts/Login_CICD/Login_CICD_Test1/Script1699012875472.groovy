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
import net.sf.jasperreports.web.util.WebUtil as WebUtil
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.maximizeWindow()

WebUI.navigateToUrl('https://demowebshop.tricentis.com/')

WebUI.click(findTestObject('Login_CICD/Page_Demo Web Shop/a_Log in'))

WebUI.setText(findTestObject('Object Repository/Login_CICD/Page_Demo Web Shop. Login/input_Email_Email'), 'suraj1234@gmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Login_CICD/Page_Demo Web Shop. Login/input_Password_Password'), 
    'cvW8qx4B2o1WegCEDy41Xg==')

WebUI.click(findTestObject('Object Repository/Login_CICD/Page_Demo Web Shop. Login/input_Forgot password_button-1 login-button'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Login_CICD/Page_Demo Web Shop/a_suraj1234gmail.com'), 0)

WebUI.click(findTestObject('Object Repository/Login_CICD/Page_Demo Web Shop/a_Log out'))

WebUI.closeBrowser()

