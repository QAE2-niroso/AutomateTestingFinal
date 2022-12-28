<?xml version="1.0" encoding="UTF-8"?>
<WebServiceRequestEntity>
   <description></description>
   <name>CPAPI-014</name>
   <tag></tag>
   <elementGuidId>84a9ee2b-7b84-47eb-a553-92f8fb0d08a2</elementGuidId>
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
      &quot;name&quot;: &quot;Name&quot;,
      &quot;value&quot;: &quot; CPAPI-013&quot;,
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
      <value>Bearer eyJ0eXAiOiJKV1QiLCJhbGciOiJSUzI1NiJ9.eyJhdWQiOiIzIiwianRpIjoiOTNkODg0NTI0NDQ0N2VkZWZlOWZiZTM2MmUwNGY0YmU0M2EyM2YzOTM5YjIyMmE2OWE5YTJjNDAwNDY4NTZlNTNiMmFjYjYzMjQ1Mjg2ZjgiLCJpYXQiOjE2NzIxMzI1NzEuOTYyOTg5LCJuYmYiOjE2NzIxMzI1NzEuOTYyOTkzLCJleHAiOjE3MDM2Njg1NzEuOTU2Nzk3LCJzdWIiOiIxMTUiLCJzY29wZXMiOltdfQ.OMkLvDEw8yD6t0-YRiewMRG2jbq7Fs8WeyYDqo61o9B1riSOOtT1dpFc1HCnp78NRWQM2euWWmn_R_tG-vIdFVaFEMQ_LNH-8u4HMKe2d_uSVBqTELY0Ih0ZGxM5u3D7Tev58VlgYvtxHCQMd7r4mUilH56qNVLIjv63Vwg6zzubzMAv4rPe0id0NqTDW4JI1BIEGWcOIAtRfPXLwuED9YwiyyYSzUJ-sIzuUSuJqsOg5jUblSIpeiAdCBWWQX8MmHweESQCtXroWAZ-NUWjBCJCzYdCaokz2W-yWY_CqoIff4W7qX-ijBiD53C_afLIAhr-dsyYUCqG3etRpiSzCEuQiIMjRtBq8UaHqLNl-KXMPq_Cp6yivuGmiNOOwmpnhKE2GTnxuCGVj9zToL5-WsBXauSBfeqzH2aIjcbcCZQZdJhGNrkCIEKAPu8Q989UXsee8xPgVpODS3dm_xCiSHox0ZWIomThNYTXMMALy2JUXOoTZcvNEnFMPIahDXS3ZAPPgXZElYD1RwID1_kwP6fJ-l0s6Hc_LYPt6koZ1DxS7VKeRTfh3BfE7uw32B9E1PFEo83N0AkdMiD1UYnkdW_zJuSGkhQznPp0aoaa1y-dmzP3nUVjpFC9FYWkPSK2UJ7N6TvpgZInBPvaqSy1wRpS-CbZqXcMjEotIWLlYPI</value>
      <webElementGuid>ca15b02c-8bff-4387-9c9a-127b33720a1e</webElementGuid>
   </httpHeaderProperties>
   <katalonVersion>8.5.2</katalonVersion>
   <maxResponseSize>0</maxResponseSize>
   <migratedVersion>5.4.1</migratedVersion>
   <restRequestMethod>GET</restRequestMethod>
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

print(token)</verificationScript>
   <wsdlAddress></wsdlAddress>
</WebServiceRequestEntity>
