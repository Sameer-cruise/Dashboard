package com.tcs.configurations;

import com.tcs.components.QSOAFlights;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.oxm.xmlbeans.XmlBeansMarshaller;

/**
 * Created by 547885 on 10/10/2015.
 */
@Configuration
public class QSOAConfiguration {

    @Bean
    public XmlBeansMarshaller xmlBeansMarshaller() {
        //Register the XML BEAN Marshaller to use
        XmlBeansMarshaller marshaller = new XmlBeansMarshaller();
        return marshaller;
    }
    @Bean
    QSOAFlights qsoaFlightsClient(XmlBeansMarshaller xmlBeansMarshaller){
        //Register Client as Bean
        QSOAFlights client = new QSOAFlights();
        client.setDefaultUri("https://api.qantas.com.au/flightops/flightdata/soap/v1");
        client.setMarshaller(xmlBeansMarshaller);
        client.setUnmarshaller(xmlBeansMarshaller);
        return client;
    }
}
