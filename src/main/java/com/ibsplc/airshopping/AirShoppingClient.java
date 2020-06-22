package com.ibsplc.airshopping;

import com.sun.deploy.net.HttpResponse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.http.ResponseEntity;
import org.springframework.http.converter.StringHttpMessageConverter;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;
import org.springframework.ws.client.core.WebServiceTemplate;
import org.springframework.ws.client.core.support.WebServiceGatewaySupport;
import org.springframework.ws.soap.client.core.SoapActionCallback;
import org.springframework.ws.soap.saaj.SaajSoapMessageFactory;
import org.xmlsoap.schemas.soap.envelope.Envelope;

import javax.xml.soap.MessageFactory;

public class AirShoppingClient extends WebServiceGatewaySupport  {
    private static final Logger log = LoggerFactory.getLogger(AirShoppingClient.class);

    public ResponseEntity<String> getResults(Envelope envelope) {

        log.info("Requesting location for " + envelope);

        WebServiceTemplate webServiceTemplate = new WebServiceTemplate();
        Jaxb2Marshaller marshaller = new Jaxb2Marshaller();
        marshaller.setContextPath("org.iata.iata.edist");
        webServiceTemplate.setMarshaller(marshaller);
        webServiceTemplate.setUnmarshaller(marshaller);
        log.info("Sending request");

        ResponseEntity<String> response = null;
        try {
            response = (ResponseEntity<String>) webServiceTemplate.marshalSendAndReceive("http://192.168.160.142:8082/aggregation-engine/ae-services/NDCAirShopping1.1.4Port", envelope);
            log.info(String.valueOf(response.getStatusCode()));
        } catch (Exception e){
            e.printStackTrace();
        }
        return response;
    }

}
