import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.configuration.RunConfiguration as RunConfiguration
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

def file = RunConfiguration.getProjectDir() + '/Data Files/cowo.png'

WebUI.callTestCase(findTestCase('Web/Change Profile/CP-001 ToProfile'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.uploadFile(findTestObject('Web/EditProfile/input_changePhoto'), file)
WebUI.takeScreenshotAsCheckpoint('1. tap icon kamera untuk melakukan upload file \n 2. pilih file yang ingin diupload')

WebUI.click(findTestObject('Web/EditProfile/button_Save Changes'))
WebUI.takeScreenshotAsCheckpoint('3. tap button "Save Changes"')

WebUI.verifyTextPresent('telah di edit', false)
WebUI.verifyTextPresent('Berhasil', false)
WebUI.takeScreenshotAsCheckpoint('4. verifikasi pesan perubahan di halaman My Profile')

WebUI.click(findTestObject('Web/Dashboard-MyProfile/button_OK'))
WebUI.takeScreenshotAsCheckpoint('5. Tap tombol "oke" di modal Sukses Edit')



