<?xml version="1.0" encoding="UTF-8"?>
<WebServiceRequestEntity>
   <description></description>
   <name>Update Profile</name>
   <tag></tag>
   <elementGuidId>3331208f-0cbb-4476-904a-b810945eb8de</elementGuidId>
   <selectorMethod>BASIC</selectorMethod>
   <useRalativeImagePath>false</useRalativeImagePath>
   <connectionTimeout>0</connectionTimeout>
   <followRedirects>false</followRedirects>
   <httpBody></httpBody>
   <httpBodyContent>{
  &quot;contentType&quot;: &quot;multipart/form-data&quot;,
  &quot;charset&quot;: &quot;UTF-8&quot;,
  &quot;parameters&quot;: [
    {
      &quot;name&quot;: &quot;NAME&quot;,
      &quot;value&quot;: &quot;Yoshua Dwi &quot;,
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
      <value>Bearer eyJ0eXAiOiJKV1QiLCJhbGciOiJSUzI1NiJ9.eyJhdWQiOiIzIiwianRpIjoiMzExMWEzN2FiMDMxZjlkN2Y0ZGYxNjc0MGJlNTBjY2M0Njc1NmRhYzI0M2YzZjQyODZmYzQ2MmU3MGNmZTY2OTljMmU5ODJkOWQ1ODk5NGEiLCJpYXQiOjE2NzIwNzE2NzguOTUyMTE3LCJuYmYiOjE2NzIwNzE2NzguOTUyMTIsImV4cCI6MTcwMzYwNzY3OC45NTAyMTEsInN1YiI6IjExNSIsInNjb3BlcyI6W119.FkrvQH2CYXZnujWBYfdrsmj8SB1DUlf3pLgPMNa71sudedQT3SXuqtxrcPpNtta4W9-hNrpEddSjg4kTbT091UVcp8M9tvQaAMzX9VIrXzz2W3TGdhgAEtri8mRe71za_1X5YhSoWG-Y0-xdwqUM4ANukQEq2cVO58Xp1UBYehJ3OZw1bU7dcTchyEKRu6Efda_8qUDx2C0d6NhYyBfcQG9QvBpnMyI6gs8YqcBgRASkf1GARXrNc5usu38Lo7MKhUn3Ue851-XVDq0bIzGYjEAUcAWKU1fuNsCkdrZLbhvficICjcIEvqrmPasky535GWu6AjL_z0x5zjC8TV13VXF2b1oeM6ZzVwmGASf24ZHsWDAE6aytkhwPTVdiSw3wHmnQbSF8kWRKJ7v7U5nVNfPWPuL-r_T1sEUb3xacjQW1NSLh918d86Y4Bik4hkutJ50SISc1zty1m1o6k1jT8gR021i77SVkApv_-pPSL6O0d0OJmdc6qG9aSSrvaFdIcQpVv0MC1yDY2CIAhqs2P9FPrXFvDYsH5XE-sIqqNa_LjA24vMfYMUPnP-qG6SspMfKzqtqEZ1Spiy4_rXXO7BEFs6u4aat5o4z9JHqTwp7Y_Ig7KBi7QgqXlR0MiB3KDs25HDueIKHuC6Lk5M4HAzKXuZrhnIbsnA_AwlzccEk</value>
      <webElementGuid>2226d7c0-73c2-4c7c-9193-e0aa3c8c39c1</webElementGuid>
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

ResponseObject response = WSResponseManager.getInstance().getCurrentResponse()</verificationScript>
   <wsdlAddress></wsdlAddress>
</WebServiceRequestEntity>
