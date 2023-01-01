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

WebUI.waitForElementPresent(findTestObject('Web/EditProfile/input_Phone_whatsapp'), 3)


WebUI.setText(findTestObject('Web/EditProfile/input_Phone_whatsapp'), phone)
WebUI.takeScreenshotAsCheckpoint('1. ganti phone number dengan value {phone}')


WebUI.click(findTestObject('Web/EditProfile/button_Save Changes'))
WebUI.takeScreenshotAsCheckpoint('2. tap button "Save Changes"')

WebUI.verifyTextPresent('Berhasil', false)
WebUI.takeScreenshotAsCheckpoint('Screenshots/Web/ChangeProfile/CP-016/4.png')

WebUI.click(findTestObject('Web/Dashboard-MyProfile/button_OK'))
WebUI.takeScreenshotAsCheckpoint('3. Tap tombol "oke" di modal Sukses Edit')


def text = WebUI.getText(findTestObject('Web/Dashboard-MyProfile/p_phoneNumber'))
WebUI.verifyEqual(text, phone)
WebUI.takeScreenshotAsCheckpoint('4. verifikasi perubahan nomor telepon di halaman My Profile')

WebUI.closeBrowser()

