package org.adsoft.spring.cloud.services;

import org.apache.log4j.spi.LoggerFactory;
import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PrivateServiceExample {
	
	@Value("{rest.serice.cloud.config.example}")
	String valueExample = null;
	
	private static Logger log = org.slf4j.LoggerFactory.getLogger(PrivateServiceExample.class);
	
	@RequestMapping(value = "/publicService")
	public String example() {
		String result = "{Empty Value}";
		
		if(valueExample.equals(null)) {
			log.error("PublicService - Llamada con error la propiedad rest.service.cloud.config.example esta vacia");
		}else {
			log.info("PublicService - Llamada correctamente ejecutada con la propiedad: (rest.service.cloud.config.example"+valueExample+")");
			result = valueExample;
		}
		
		return result;
	}

}
