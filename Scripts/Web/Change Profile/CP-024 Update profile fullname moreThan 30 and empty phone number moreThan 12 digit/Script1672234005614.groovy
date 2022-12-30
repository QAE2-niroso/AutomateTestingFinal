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

WebUI.callTestCase(findTestCase('Web/Change Profile/CP-001 ToProfile'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Web/Dashboard-MyProfile/a_Edit Profile'))

WebUI.setText(findTestObject('Web/EditProfile/input_Fullname_name'), 'uvuvwevwevwe onyetenyevwe ugwemuhwem osas')

WebUI.setText(findTestObject('Web/EditProfile/input_Phone_whatsapp'), 'huruf')

WebUI.clearText(findTestObject('Web/EditProfile/input_BirthDay_birth_date'))

WebUI.click(findTestObject('Web/EditProfile/button_Save Changes'))

WebUI.verifyTextPresent('The name may not be greater than 30 characters.', false)

def attr = WebUI.getAttribute(findTestObject('Web/EditProfile/input_Fullname_name'), 'class')

print(attr)

WebUI.verifyEqual(attr.contains('is-invalid'), true)

WebUI.comment('')

WebUI.verifyTextPresent('The whatsapp must be between 10 and 12 digits.', false)

attr = WebUI.getAttribute(findTestObject('Web/EditProfile/input_Phone_whatsapp'), 'class')

print(attr)

WebUI.verifyEqual(attr.contains('is-invalid'), true)

WebUI.closeBrowser()

