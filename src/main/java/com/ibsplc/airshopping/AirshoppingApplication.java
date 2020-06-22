package com.ibsplc.airshopping;


import com.sun.deploy.net.HttpResponse;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationPropertiesScan;
import org.springframework.http.ResponseEntity;
import org.xmlsoap.schemas.soap.envelope.Envelope;


import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import java.io.File;
import java.math.BigInteger;

@SpringBootApplication
@ConfigurationPropertiesScan("com.ibsplc.airshopping, org.iata.iata.edist, org.oasis_open.docs.wss._2004._01.oasis_200401_wss_wssecurity_secext_1_0,org.w3._2001.xmlschema_instance,org.xmlsoap.schemas.soap.envelope")
public class AirshoppingApplication {


	public static void main(String[] args) throws JAXBException {
		SpringApplication.run(AirshoppingApplication.class, args);


		AirShoppingRequestBuilder airShoppingRequestBuilder = new AirShoppingRequestBuilder();
		Envelope airShoppingRQ = airShoppingRequestBuilder.buildAirShoppingRequest();


		/*
		//convert Request to xml string ---- Test Request passing is correct or not
		JAXBContext context = JAXBContext.newInstance(Envelope.class);
		Marshaller m = context.createMarshaller();
		m.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
		m.marshal(airShoppingRQ, System.out);
		m.marshal(airShoppingRQ, new File("test.xml"));
		*/


		AirShoppingClient airShoppingClient = new AirShoppingClient();
		try {
			ResponseEntity<String> response = airShoppingClient.getResults(airShoppingRQ);
			System.out.println("Response code is " +response.getStatusCode());
		}catch (Exception e){
			e.printStackTrace();
		}

	}





}
