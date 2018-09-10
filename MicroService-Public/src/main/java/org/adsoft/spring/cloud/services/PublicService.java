package org.adsoft.spring.cloud.services;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PublicService {
	
	@Value("{rest.service.cloud.config.example}")
	String valueExample = null;
	
	private static Logger log = LoggerFactory.getLogger(PublicService.class);
	
	@RequestMapping(value = "/publicService")
	public String example() {
		String result = "{Empty value}";
		if(valueExample.equals(null)) {
			log.error("PrivateRestService - Llamada a configuration con error con la propiedad rest.service.cloud.config.example");
		}else {
			log.info("PrivateRestService - Llamada exitosa a configuration con la propierdad: (rest.service.cloud.config.example:"+valueExample+")");
			result = valueExample;
		}
		
		return result;
	}

}
