import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.configuration.RunConfiguration
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

def file = RunConfiguration.getProjectDir() + '/Data Files/demo.apk'
Mobile.startApplication(file, false)

Mobile.waitForElementPresent(findTestObject('Mobile/Beranda/navBeranda'), 0)

Mobile.tap(findTestObject('Mobile/Beranda/navBeranda'), 1)

Mobile.tap(findTestObject('Mobile/Login/Login Here'), 1)
Mobile.takeScreenshotAsCheckpoint('1. Menuju halaman login')

Mobile.setText(findTestObject('Mobile/Login/inputEmail'), 'yoshuadwi@gmail.com', 1)
Mobile.takeScreenshotAsCheckpoint('2. isi field email')

Mobile.setText(findTestObject('Mobile/Login/inputPassword'), 'yoshuadwi06', 1)
Mobile.takeScreenshotAsCheckpoint('3. isi field password')

Mobile.tap(findTestObject('Mobile/Login/VGBtnLogin'), 1)
Mobile.takeScreenshotAsCheckpoint('4. tap button login')


Mobile.waitForElementPresent(findTestObject('Mobile/Beranda/navProfile'), 2)
Mobile.tap(findTestObject('Mobile/Beranda/navProfile'), 1)
email = Mobile.getText(findTestObject('Mobile/Detail_Information/Email_DetailInformation'), 1)
Mobile.verifyEqual(email, 'yoshuadwi@gmail.com')

Mobile.takeScreenshotAsCheckpoint('5. tutup aplikasi')
Mobile.closeApplication()

Mobile.startExistingApplication('com.codingid.codingidhive.betastaging', FailureHandling.STOP_ON_FAILURE)
Mobile.takeScreenshotAsCheckpoint('6. Membuka kembali aplikasi')

Mobile.waitForElementPresent(findTestObject('Mobile/Beranda/navProfile'), 1)
Mobile.takeScreenshotAsCheckpoint('7. buka fragmen profile')

email = Mobile.getText(findTestObject('Mobile/Detail_Information/Email_DetailInformation'), 1)

Mobile.verifyEqual(email, 'yoshuadwi@gmail.com')
Mobile.takeScreenshotAsCheckpoint('8. validasi kredensial')
