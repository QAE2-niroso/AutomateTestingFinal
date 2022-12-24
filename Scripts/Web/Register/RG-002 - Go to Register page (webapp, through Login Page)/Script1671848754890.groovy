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

WebUI.navigateToUrl(GlobalVariable.URL_demo)

WebUI.takeScreenshot('Screenshots/Web/Register/rg02/rg-1.png')

WebUI.setViewPortSize(990, 1000)

WebUI.takeScreenshot('Screenshots/Web/Register/rg02/rg-2.png')

WebUI.click(findTestObject('Object Repository/Web/Register/Page_Be a Profressional Talent with Coding.ID/button_Toggle navigation'))

WebUI.takeScreenshot('Screenshots/Web/Register/rg02/rg-3.png')

WebUI.doubleClick(findTestObject('Object Repository/Web/Register/Page_Be a Profressional Talent with Coding.ID/body_Toggle navigationB'))

WebUI.takeScreenshot('Screenshots/Web/Register/rg02/rg-4.png')

WebUI.click(findTestObject('Object Repository/Web/Register/Page_Be a Profressional Talent with Coding.ID/a_Login'))

WebUI.takeScreenshot('Screenshots/Web/Register/rg02/rg-5.png')

WebUI.click(findTestObject('Object Repository/Web/Register/Page_Masuk untuk dapatkan akses di Coding.ID/span_Masuk'))

WebUI.takeScreenshot('Screenshots/Web/Register/rg02/rg-6.png')

WebUI.click(findTestObject('Object Repository/Web/Register/Page_Masuk untuk dapatkan akses di Coding.ID/a_Buat akun'))

WebUI.takeScreenshot('Screenshots/Web/Register/rg02/rg-7.png')

