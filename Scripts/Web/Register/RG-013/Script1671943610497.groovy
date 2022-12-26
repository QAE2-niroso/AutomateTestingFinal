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

Mobile.callTestCase(findTestCase('Web/Register/RG-003 - Go to Register Page (Website)'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Page_Buat akun dan dapatkan akses di Coding.ID/input_Nama_name'), 'hsuheguihruhgru')

WebUI.click(findTestObject('Page_Buat akun dan dapatkan akses di Coding.ID/input_Tanggal lahir_birth_date'))

WebUI.selectOptionByValue(findTestObject('Page_Buat akun dan dapatkan akses di Coding.ID/select_year'), '2002', true)

WebUI.selectOptionByValue(findTestObject('Page_Buat akun dan dapatkan akses di Coding.ID/select_month'), '5', true)

WebUI.setText(findTestObject('Page_Buat akun dan dapatkan akses di Coding.ID/input_E-Mail_email'), 'restiow@ier.vo')

WebUI.setText(findTestObject('Page_Buat akun dan dapatkan akses di Coding.ID/input_Whatsapp_whatsapp'), '083982782')

WebUI.setEncryptedText(findTestObject('Object Repository/Web/Register/Buat Akun Baru/Page_Buat akun dan dapatkan akses di Coding.ID/input_password'), 
    'Zs3cpxjUb944RPR5hRQmKg==')

WebUI.setEncryptedText(findTestObject('Object Repository/Web/Register/Buat Akun Baru/Page_Buat akun dan dapatkan akses di Coding.ID/input_password_confirmation'), 
    'piGUuFRi8xcKnEWGiZSfyA==')

WebUI.click(findTestObject('Object Repository/Web/Register/Buat Akun Baru/Page_Buat akun dan dapatkan akses di Coding.ID/input_syaratK'))

WebUI.click(findTestObject('Object Repository/Web/Register/Buat Akun Baru/Page_Buat akun dan dapatkan akses di Coding.ID/button_Daftar'))

