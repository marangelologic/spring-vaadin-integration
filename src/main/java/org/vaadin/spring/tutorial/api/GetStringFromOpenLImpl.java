package org.vaadin.spring.tutorial.api;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class GetStringFromOpenLImpl implements GetStringFromOpenLSample {

	@Override
	public String getString() {
		RestTemplate rs = new  RestTemplate();
		String url = "http://localhost:8080/webservice/REST/Example3-AutoPolicyCalculation/getPolicyProfile3";
		return rs.getForObject(url, String.class);
	}

}
