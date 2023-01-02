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

for (int i = 1; i <= 50; i++) {
    //WebUI.click(findTestObject('Web/Register/Input_register/Page_Buat akun dan dapatkan akses di Coding.ID/input_Nama_name'))
    WebUI.setText(findTestObject('Web/Register/Input_register/Page_Buat akun dan dapatkan akses di Coding.ID/input_Nama_name'), 
        findTestData('Raw Data/Web/Register/RegData').getValue(1, i))

    //WebUI.click(findTestObject('Object Repository/Web/Register/Input_register/Page_Buat akun dan dapatkan akses di Coding.ID/input_birth_date'))
    WebUI.setText(findTestObject('Object Repository/Web/Register/Input_register/Page_Buat akun dan dapatkan akses di Coding.ID/input_birth_date'), 
        (((findTestData('Raw Data/Web/Register/RegData').getValue(4, i) + '-') + findTestData('Raw Data/Web/Register/RegData').getValue(
            3, i)) + '-') + findTestData('Raw Data/Web/Register/RegData').getValue(2, i))

    //WebUI.selectOptionByValue(findTestObject('Web/Register/Input_register/Page_Buat akun dan dapatkan akses di Coding.ID/select_month'), '7', false)
    //WebUI.selectOptionByValue(findTestObject('Web/Register/Input_register/Page_Buat akun dan dapatkan akses di Coding.ID/select_year'), '2000', true)
    //WebUI.click(findTestObject('Web/Register/Input_register/Page_Buat akun dan dapatkan akses di Coding.ID/td'))
    WebUI.setText(findTestObject('Object Repository/Web/Register/Input_register/Page_Buat akun dan dapatkan akses di Coding.ID/input_E-Mail_email'), 
        findTestData('Raw Data/Web/Register/RegData').getValue(5, i))

    WebUI.setText(findTestObject('Object Repository/Web/Register/Input_register/Page_Buat akun dan dapatkan akses di Coding.ID/input_Whatsapp_whatsapp'), 
        findTestData('Raw Data/Web/Register/RegData').getValue(6, i))

    WebUI.setText(findTestObject('Object Repository/Web/Register/Input_register/Page_Buat akun dan dapatkan akses di Coding.ID/input_Kata-Sandi_password'), 
        findTestData('Raw Data/Web/Register/RegData').getValue(7, i))

    WebUI.setText(findTestObject('Object Repository/Web/Register/Input_register/Page_Buat akun dan dapatkan akses di Coding.ID/input_confirmation'), 
        findTestData('Raw Data/Web/Register/RegData').getValue(8, i))

    if (findTestData('Raw Data/Web/Register/RegData').getValue(9, i) == 'true') {
        WebUI.check(findTestObject('Object Repository/Web/Register/Input_register/Page_Buat akun dan dapatkan akses di Coding.ID/syarat_ketentuan'))
    }
    
    WebUI.takeFullPageScreenshotAsCheckpoint(('Screenshots/Web/Register/rg13/rg-13+' + String.valueOf(i - 1)) + '-00.png')

    WebUI.click(findTestObject('Object Repository/Web/Register/Input_register/Page_Buat akun dan dapatkan akses di Coding.ID/button_Daftar'))

    WebUI.takeFullPageScreenshotAsCheckpoint(('Screenshots/Web/Register/rg13/rg-13+' + String.valueOf(i - 1)) + '-01.png')

    WebUI.openBrowser(GlobalVariable.URL_demo_regist)
}

