package com.tcs.controller;

import com.tcs.lists.Lists;
import org.apache.http.conn.ssl.NoopHostnameVerifier;
import org.apache.http.conn.ssl.SSLConnectionSocketFactory;
import org.apache.http.conn.ssl.TrustStrategy;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.http.client.HttpComponentsClientHttpRequestFactory;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.net.ssl.SSLContext;
import java.security.KeyManagementException;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.cert.X509Certificate;


@RestController
public class APUController {
    @RequestMapping("/Dashboard/apu/{port}")
    public String greeting(@PathVariable("port") String port) throws KeyManagementException, NoSuchAlgorithmException, KeyStoreException {
        CloseableHttpClient httpClient
                = HttpClients.custom()
                .setSSLHostnameVerifier(new NoopHostnameVerifier())
                .build();
        HttpComponentsClientHttpRequestFactory requestFactory
                = new HttpComponentsClientHttpRequestFactory();
        requestFactory.setHttpClient(httpClient);
        String apuDataurl = Lists.apuurl + port + Lists.append;
        HttpHeaders requestHeaders = new HttpHeaders();
        requestHeaders.set("Authorization", Lists.auth);
        HttpEntity<?> requestEntity = new HttpEntity<Object>(requestHeaders);
        TrustStrategy acceptingTrustStrategy = (X509Certificate[] chain, String authType) -> true;
        SSLContext sslContext = org.apache.http.ssl.SSLContexts.custom()
                .loadTrustMaterial(null, acceptingTrustStrategy)
                .build();
        SSLConnectionSocketFactory csf = new SSLConnectionSocketFactory(sslContext);
        CloseableHttpClient httpClient2 = HttpClients.custom()
                .setSSLSocketFactory(csf)
                .build();
        HttpComponentsClientHttpRequestFactory requestFactory2 = new HttpComponentsClientHttpRequestFactory();

        requestFactory2.setHttpClient(httpClient2);

        RestTemplate restTemplate2 = new RestTemplate(requestFactory2);
        ResponseEntity<String> entity
                = restTemplate2.exchange(apuDataurl, HttpMethod.GET, requestEntity, String.class);
        return entity.getBody().toString();
    }

    @RequestMapping("/Dashboard/apu")
    public String apu(@RequestParam(value = "name", defaultValue = "APU") String name) {
        return "Please select Port or No data exist for this PORT";
    }
}

