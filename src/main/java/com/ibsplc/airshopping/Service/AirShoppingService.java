package com.ibsplc.airshopping.Service;

import org.iata.iata.edist.AirShoppingRQ;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.ws.client.core.WebServiceTemplate;

@Service
public class AirShoppingService {

    @Autowired
    private Jaxb2Marshaller marshaller;

    private WebServiceTemplate webServiceTemplate;


    public String invokeService(AirShoppingRQ airshoppingRQ){
        return this.getAirShoppingResponse(airshoppingRQ);
    }

    public String getAirShoppingResponse(AirShoppingRQ airShoppingRQ){
        webServiceTemplate= new WebServiceTemplate(marshaller);
        String response = (String) webServiceTemplate.marshalSendAndReceive("http://192.168.175.144:8082/aggregation-engine/ae-services/NDCAirShopping1.1.4Port", airShoppingRQ);
        return response;
    }

}
