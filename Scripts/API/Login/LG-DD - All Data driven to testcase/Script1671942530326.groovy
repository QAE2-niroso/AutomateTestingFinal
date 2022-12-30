import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import static org.assertj.core.api.Assertions.*
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.ResponseObject as ResponseObject
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import groovy.json.JsonSlurper as JsonSlurper
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

//WS.sendRequest(findTestObject('API/All-LG-0', [('email') : '', ('password') : '']))
//def string_body = "{"+"\"email\":"+ email +","+"\"password\":"+password+"}"
// println string_body
//ResponseObject response =  WS.sendRequest(findTestObject('API/LG-DD(001-010)', [('req_body') : string_body]))
//WS.verifyResponseStatusCode(response, 200)
//assertThat(response.getStatusCode()).isEqualTo(401)
for (int i = 1; i <= 10; i++) {
    ResponseObject response = WS.sendRequest(findTestObject('API/LG-DD(001-010)', [('email') : findTestData('Raw Data/API/Login/LogData').getValue(
                    1, i), ('password') : findTestData('Raw Data/API/Login/LogData').getValue(2, i)]))

    assertThat(response.getStatusCode()).isEqualTo(401)
}

