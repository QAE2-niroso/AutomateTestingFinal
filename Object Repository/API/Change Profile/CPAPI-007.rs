<?xml version="1.0" encoding="UTF-8"?>
<WebServiceRequestEntity>
   <description></description>
   <name>CPAPI-007</name>
   <tag></tag>
   <elementGuidId>b88c8c35-9f5d-4b22-9cfd-70f73257f4ca</elementGuidId>
   <selectorMethod>BASIC</selectorMethod>
   <useRalativeImagePath>false</useRalativeImagePath>
   <authorizationRequest>
      <authorizationInfo>
         <entry>
            <key>bearerToken</key>
            <value>eyJ0eXAiOiJKV1QiLCJhbGciOiJSUzI1NiJ9.eyJhdWQiOiIzIiwianRpIjoiOTNkODg0NTI0NDQ0N2VkZWZlOWZiZTM2MmUwNGY0YmU0M2EyM2YzOTM5YjIyMmE2OWE5YTJjNDAwNDY4NTZlNTNiMmFjYjYzMjQ1Mjg2ZjgiLCJpYXQiOjE2NzIxMzI1NzEuOTYyOTg5LCJuYmYiOjE2NzIxMzI1NzEuOTYyOTkzLCJleHAiOjE3MDM2Njg1NzEuOTU2Nzk3LCJzdWIiOiIxMTUiLCJzY29wZXMiOltdfQ.OMkLvDEw8yD6t0-YRiewMRG2jbq7Fs8WeyYDqo61o9B1riSOOtT1dpFc1HCnp78NRWQM2euWWmn_R_tG-vIdFVaFEMQ_LNH-8u4HMKe2d_uSVBqTELY0Ih0ZGxM5u3D7Tev58VlgYvtxHCQMd7r4mUilH56qNVLIjv63Vwg6zzubzMAv4rPe0id0NqTDW4JI1BIEGWcOIAtRfPXLwuED9YwiyyYSzUJ-sIzuUSuJqsOg5jUblSIpeiAdCBWWQX8MmHweESQCtXroWAZ-NUWjBCJCzYdCaokz2W-yWY_CqoIff4W7qX-ijBiD53C_afLIAhr-dsyYUCqG3etRpiSzCEuQiIMjRtBq8UaHqLNl-KXMPq_Cp6yivuGmiNOOwmpnhKE2GTnxuCGVj9zToL5-WsBXauSBfeqzH2aIjcbcCZQZdJhGNrkCIEKAPu8Q989UXsee8xPgVpODS3dm_xCiSHox0ZWIomThNYTXMMALy2JUXOoTZcvNEnFMPIahDXS3ZAPPgXZElYD1RwID1_kwP6fJ-l0s6Hc_LYPt6koZ1DxS7VKeRTfh3BfE7uw32B9E1PFEo83N0AkdMiD1UYnkdW_zJuSGkhQznPp0aoaa1y-dmzP3nUVjpFC9FYWkPSK2UJ7N6TvpgZInBPvaqSy1wRpS-CbZqXcMjEotIWLlYPI</value>
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
      &quot;name&quot;: &quot;birth_date&quot;,
      &quot;value&quot;: &quot;${date}&quot;,
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
      <value>Bearer eyJ0eXAiOiJKV1QiLCJhbGciOiJSUzI1NiJ9.eyJhdWQiOiIzIiwianRpIjoiOWQ1YzIzNDVlNTYwZmIwMmMwMjJjODg1MTc1NTg5ZGJjMzRjM2RmZjliOWEyMzZmOThkZDlkNWRkZGYyNjM0NzhiYzJlODU0NDRkNzcwNjkiLCJpYXQiOjE2NzIxMzI0ODYuMjg2MTQ5LCJuYmYiOjE2NzIxMzI0ODYuMjg2MTUxLCJleHAiOjE3MDM2Njg0ODYuMjg0MzE2LCJzdWIiOiIxMTUiLCJzY29wZXMiOltdfQ.fNsknX_pnpDBzkVXRdo6-tR8QQQy_oDUCGAJ4KWb2bTpZBOZkB5SbMeZy74DlMH0zm33tQADEldMf81lE2sXtxCon98ujksqy7SLpZAmUb1S-AhyPyY5KqBbg7RdWDtmVOlrrV3FROY5q7gpOmdFTAe8yxvPxUSly3YltChmNRirtjA_ChvMUWRSD1y6cmgmrnri--bk7mMgVVFDnWZNr7eUfu-WsY_Rr_HFpYT_DKDXnb_Dv5OCXmaxKrp5uhMgrKtp1iWsKjg2cuwsFngbVqJw-8QGQTqwmw12YxHNL0hfyMW6oqA_AM796Wm7y9OHP1CP7k0eiq0aG3dCA8bA-hxFoYuCs1lllMRwJt-GHCCxRmDOfAIabfaLZ4F0PUgj4ldUNisguupj_hAFXU4yhQMWHQiIxLe0zQM4GFqsWGBydNnRB51HYuFdotsvMB7y1CV_QNlDtRsSPM2IAuD_5HDHTq8EruxJB4y0wq8U2mQjEr1q0ndbeZDoBnLRho9Sq6OvWNOoGcknVg0SKA8GXA_fb-tny5OD2e_ZHWXknecGOyrjTUZKVDZ8mXOMUjM1t7Mzmgoya_DV_wyGK7pKtYoDDSERkpYDLgFNSyAwwA4ZMDlVgsw4jgj-1LjkELBgYOzb93KbFYv_qvQH23SzANeHm2nSCHG8MzuYTM9FozY</value>
      <webElementGuid>c24e5b60-61e9-4889-99b0-199db557c526</webElementGuid>
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
   <variables>
      <defaultValue>'2000-05-06'</defaultValue>
      <description></description>
      <id>120fa793-cc11-46af-9700-f897bef0315f</id>
      <masked>false</masked>
      <name>date</name>
   </variables>
   <verificationScript>import static org.assertj.core.api.Assertions.*

import com.kms.katalon.core.testobject.RequestObject
import com.kms.katalon.core.testobject.ResponseObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webservice.verification.WSResponseManager

import groovy.json.JsonSlurper
import internal.GlobalVariable as GlobalVariable

RequestObject request = WSResponseManager.getInstance().getCurrentRequest()

ResponseObject response = WSResponseManager.getInstance().getCurrentResponse()

assertThat(response.getStatusCode()).isEqualTo(401)</verificationScript>
   <wsdlAddress></wsdlAddress>
</WebServiceRequestEntity>
