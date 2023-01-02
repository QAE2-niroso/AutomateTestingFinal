<?xml version="1.0" encoding="UTF-8"?>
<WebServiceRequestEntity>
   <description></description>
   <name>CPAPI-004</name>
   <tag></tag>
   <elementGuidId>b9a625d5-3f3d-4cc6-b64a-dfeeb704a624</elementGuidId>
   <selectorMethod>BASIC</selectorMethod>
   <useRalativeImagePath>false</useRalativeImagePath>
   <authorizationRequest>
      <authorizationInfo>
         <entry>
            <key>bearerToken</key>
            <value>eyJ0eXAiOiJKV1QiLCJhbGciOiJSUzI1NiJ9.eyJhdWQiOiIzIiwianRpIjoiYTNmNGUwNjM5N2ZlYzYxMzA1MzQxZGZiMzY2NTA5NDg4NTc3YmFmZGFlNTgxMzY3YWY4OTMyNWY1MDRmZTYwMmIyODUzNjA4MTBlYmNlZmYiLCJpYXQiOjE2NzIwNzA2OTMuMjYyMTYsIm5iZiI6MTY3MjA3MDY5My4yNjIxNjMsImV4cCI6MTcwMzYwNjY5My4yNjA2OTcsInN1YiI6IjEwNiIsInNjb3BlcyI6W119.c52XdNsxv2o9_w2ok491dHXVbnvRNac3d1kedpkPcUD1UxaVbPDX5b2e97pDPGG5Vf2CXNFrgqH6Q91yJXIKPDWxISBg3w8zP8PlMu-mLieRcnBLDNMAOo7k0XAGRc1YyhILkdyCfmKv_dqRAnm6g6ccsFZEIEMfjjAmLUnF4oqEUtXriTdN_kMiVV3nggPmGAiF4Hdrf2TQJpwQzQlLFXgh3B3MXe96WDhymafuVdAj7HtFyWoHzIdiaDWPBlG6pjddMI-oOmbDqr5UMSPIsBbuZ3juWPKNJ09wOUmox0Aiwgv9ChFBpH4wfCKi4Lz0rgrmKldNf1D9lVrCIUZ8NZa16rc7ySMhL25aEUxKd2DmbVPI9_tcP_g9HpMwm-dPhw3pMFOk4a63bfwOqiHl4kz9HJE38GViFkuBgNnRsPRJ-ZA2c0PrrPA16a3SLSvng7nmQFpogb-xotPLif3LSsHjXjJw2beWUW7-NWd6YdVMtW4fdPZ0C4hU2RVEpmRN1ZI-9NoUrdlSQhdvQNENWZ8sKoMMkRathYGWTOyMf-9cwK80Sb-Wzu0-qwR-YrJkv9U1uQ59SsZmCEk2AFdVkONO9W-gpsvcUq1MlkBepoXauXW7jrueAY9VeSxxZZQlKHjhQSfALmxmASD97xtxUb16ieMV8wBoe7MtjzneGHU</value>
         </entry>
      </authorizationInfo>
      <authorizationType>Bearer</authorizationType>
   </authorizationRequest>
   <connectionTimeout>0</connectionTimeout>
   <followRedirects>false</followRedirects>
   <httpBody></httpBody>
   <httpBodyContent>{
  &quot;contentType&quot;: &quot;multipart/form-data&quot;,
  &quot;charset&quot;: &quot;UTF-8&quot;,
  &quot;parameters&quot;: [
    {
      &quot;name&quot;: &quot;names&quot;,
      &quot;value&quot;: &quot; CPAPI-012&quot;,
      &quot;type&quot;: &quot;Text&quot;,
      &quot;contentType&quot;: &quot;&quot;
    }
  ]
}</httpBodyContent>
   <httpBodyType>form-data</httpBodyType>
   <httpHeaderProperties>
      <isSelected>true</isSelected>
      <matchCondition>equals</matchCondition>
      <name>Content-Type</name>
      <type>Main</type>
      <value>multipart/form-data</value>
      <webElementGuid>74f54df5-c6bb-4046-91b2-ab14f170ed0d</webElementGuid>
   </httpHeaderProperties>
   <httpHeaderProperties>
      <isSelected>true</isSelected>
      <matchCondition>equals</matchCondition>
      <name>Authorization</name>
      <type>Main</type>
      <value>Bearer eyJ0eXAiOiJKV1QiLCJhbGciOiJSUzI1NiJ9.eyJhdWQiOiIzIiwianRpIjoiYTNmNGUwNjM5N2ZlYzYxMzA1MzQxZGZiMzY2NTA5NDg4NTc3YmFmZGFlNTgxMzY3YWY4OTMyNWY1MDRmZTYwMmIyODUzNjA4MTBlYmNlZmYiLCJpYXQiOjE2NzIwNzA2OTMuMjYyMTYsIm5iZiI6MTY3MjA3MDY5My4yNjIxNjMsImV4cCI6MTcwMzYwNjY5My4yNjA2OTcsInN1YiI6IjEwNiIsInNjb3BlcyI6W119.c52XdNsxv2o9_w2ok491dHXVbnvRNac3d1kedpkPcUD1UxaVbPDX5b2e97pDPGG5Vf2CXNFrgqH6Q91yJXIKPDWxISBg3w8zP8PlMu-mLieRcnBLDNMAOo7k0XAGRc1YyhILkdyCfmKv_dqRAnm6g6ccsFZEIEMfjjAmLUnF4oqEUtXriTdN_kMiVV3nggPmGAiF4Hdrf2TQJpwQzQlLFXgh3B3MXe96WDhymafuVdAj7HtFyWoHzIdiaDWPBlG6pjddMI-oOmbDqr5UMSPIsBbuZ3juWPKNJ09wOUmox0Aiwgv9ChFBpH4wfCKi4Lz0rgrmKldNf1D9lVrCIUZ8NZa16rc7ySMhL25aEUxKd2DmbVPI9_tcP_g9HpMwm-dPhw3pMFOk4a63bfwOqiHl4kz9HJE38GViFkuBgNnRsPRJ-ZA2c0PrrPA16a3SLSvng7nmQFpogb-xotPLif3LSsHjXjJw2beWUW7-NWd6YdVMtW4fdPZ0C4hU2RVEpmRN1ZI-9NoUrdlSQhdvQNENWZ8sKoMMkRathYGWTOyMf-9cwK80Sb-Wzu0-qwR-YrJkv9U1uQ59SsZmCEk2AFdVkONO9W-gpsvcUq1MlkBepoXauXW7jrueAY9VeSxxZZQlKHjhQSfALmxmASD97xtxUb16ieMV8wBoe7MtjzneGHU</value>
      <webElementGuid>954f550e-7abd-492f-a4b0-3a2de8497a27</webElementGuid>
   </httpHeaderProperties>
   <katalonVersion>8.5.2</katalonVersion>
   <maxResponseSize>0</maxResponseSize>
   <migratedVersion>5.4.1</migratedVersion>
   <restRequestMethod>POST</restRequestMethod>
   <restUrl>https://demo-app.online/api/updateprofile</restUrl>
   <serviceType>RESTful</serviceType>
   <soapBody></soapBody>
   <soapHeader></soapHeader>
   <soapRequestMethod></soapRequestMethod>
   <soapServiceEndpoint></soapServiceEndpoint>
   <soapServiceFunction></soapServiceFunction>
   <socketTimeout>0</socketTimeout>
   <useServiceInfoFromWsdl>true</useServiceInfoFromWsdl>
   <verificationScript>import static org.assertj.core.api.Assertions.*

import com.kms.katalon.core.testobject.RequestObject
import com.kms.katalon.core.testobject.ResponseObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webservice.verification.WSResponseManager

import groovy.json.JsonSlurper
import internal.GlobalVariable as GlobalVariable

RequestObject request = WSResponseManager.getInstance().getCurrentRequest()

ResponseObject response = WSResponseManager.getInstance().getCurrentResponse()
assertThat(response.getStatusCode()).isEqualTo(200)</verificationScript>
   <wsdlAddress></wsdlAddress>
</WebServiceRequestEntity>
