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

WebUI.callTestCase(findTestCase('Web/Register/RG-003 - Go to Register Page (Website)'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Web/Register/Input_register/Page_Buat akun dan dapatkan akses di Coding.ID/input_Nama_name'), 
    'M. Hasan Zainudin')

WebUI.setText(findTestObject('Object Repository/Web/Register/Input_register/Page_Buat akun dan dapatkan akses di Coding.ID/input_birth_date'), 
    '12-Mar-1999')

WebUI.setText(findTestObject('Object Repository/Web/Register/Input_register/Page_Buat akun dan dapatkan akses di Coding.ID/input_E-Mail_email'), 
    'm.hasanz@gmail.com')

WebUI.setText(findTestObject('Object Repository/Web/Register/Input_register/Page_Buat akun dan dapatkan akses di Coding.ID/input_Whatsapp_whatsapp'), 
    '081222334850')

WebUI.setText(findTestObject('Object Repository/Web/Register/Input_register/Page_Buat akun dan dapatkan akses di Coding.ID/input_Kata-Sandi_password'), 
    '8hg.qh4983hg')

WebUI.setText(findTestObject('Object Repository/Web/Register/Input_register/Page_Buat akun dan dapatkan akses di Coding.ID/input_confirmation'), 
    '8hg.qh4983hg')

WebUI.check(findTestObject('Object Repository/Web/Register/Input_register/Page_Buat akun dan dapatkan akses di Coding.ID/syarat_ketentuan'))

WebUI.takeScreenshot('Screenshots/Web/Register/rg63/01.png')

WebUI.click(findTestObject('Object Repository/Web/Register/Input_register/Page_Buat akun dan dapatkan akses di Coding.ID/button_Daftar'))

WebUI.takeScreenshot('Screenshots/Web/Register/rg63/02.png')

