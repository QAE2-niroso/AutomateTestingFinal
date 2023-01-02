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

WebUI.setText(findTestObject('Web/EditProfile/input_Fullname_name'), 'uvuvwevwevwe onyetenyevwe ugwemuhwem osas')
WebUI.takeScreenshotAsCheckpoint('1. isi field fullname dengan value {fullname}')

WebUI.setText(findTestObject('Web/EditProfile/input_Phone_whatsapp'), '085296374185296')
WebUI.takeScreenshotAsCheckpoint('2. isi field phone dengan value {phone} ')


WebUI.click(findTestObject('Web/EditProfile/button_Save Changes'))
WebUI.takeScreenshotAsCheckpoint('3. tap button Save Changes ')

WebUI.takeScreenshotAsCheckpoint('Screenshots/Web/ChangeProfile/CP-024/3.png')

WebUI.verifyTextPresent('The name may not be greater than 30 characters.', false)
WebUI.takeScreenshotAsCheckpoint('4. validate pesan error')


def attr = WebUI.getAttribute(findTestObject('Web/EditProfile/input_Fullname_name'), 'class')

print(attr)

WebUI.verifyEqual(attr.contains('is-invalid'), true)

WebUI.comment('')

WebUI.verifyTextPresent('The whatsapp must be between 10 and 12 digits.', false)

WebUI.takeScreenshotAsCheckpoint('Screenshots/Web/ChangeProfile/CP-024/5.png')

attr = WebUI.getAttribute(findTestObject('Web/EditProfile/input_Phone_whatsapp'), 'class')

print(attr)

WebUI.verifyEqual(attr.contains('is-invalid'), true)

WebUI.closeBrowser()

