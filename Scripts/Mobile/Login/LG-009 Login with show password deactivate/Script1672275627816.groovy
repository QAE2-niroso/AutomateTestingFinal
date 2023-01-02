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
Mobile.startApplication(file, true)
Mobile.waitForElementPresent(findTestObject('Mobile/Beranda/navBeranda'), 0)
Mobile.tap(findTestObject('Mobile/Beranda/navBeranda'), 1)
Mobile.tap(findTestObject('Mobile/Login/Login Here'), 1)



Mobile.setText(findTestObject('Mobile/Login/inputEmail'), 'yoshuadwi@gmail.com', 0)
Mobile.takeScreenshotAsCheckpoint('1. isi field email')

Mobile.setText(findTestObject('Mobile/Login/inputPassword'), 'yoshuadwi06', 0)
Mobile.takeScreenshotAsCheckpoint('2. isi field password')

Mobile.doubleTap(findTestObject('Mobile/Login/HidePassword'), 0)
Mobile.takeScreenshotAsCheckpoint('3. tap logo mata , 4 tap kembali  logo mata ')

Mobile.tap(findTestObject('Mobile/Login/VGBtnLogin'), 1)
Mobile.takeScreenshotAsCheckpoint('5. tap  button login')

Mobile.waitForElementPresent(findTestObject('Mobile/Beranda/navProfile'), 0)
Mobile.delay(2)
Mobile.tap(findTestObject('Mobile/Beranda/navProfile'), 3)


def email = Mobile.getText(findTestObject('Mobile/Detail_Information/Email_DetailInformation'), 0)

Mobile.verifyEqual(email, 'yoshuadwi@gmail.com')
Mobile.takeScreenshotAsCheckpoint('6. validasi kredensial')

