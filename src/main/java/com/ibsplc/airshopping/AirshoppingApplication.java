package com.ibsplc.airshopping;

import com.ibsplc.airshopping.Service.AirShoppingService;
import org.iata.iata.edist.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationPropertiesScan;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigInteger;

@SpringBootApplication
@ConfigurationPropertiesScan("com.ibsplc.airshopping, org.iata.iata.edist")
public class AirshoppingApplication {

	@Autowired
	private AirShoppingService airShoppingService;

	public static void main(String[] args) {
		SpringApplication.run(AirshoppingApplication.class, args);
		AirShoppingRequestBuilder airShoppingRequestBuilder = new AirShoppingRequestBuilder();
		AirShoppingRQ airShoppingRQ = airShoppingRequestBuilder.buildAirShoppingRequest();
        AirShoppingService service = new AirShoppingService();
        String result = service.invokeService(airShoppingRQ);
		System.out.println(result);
	}


}
