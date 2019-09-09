package org.vaadin.spring.tutorial.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.vaadin.spring.tutorial.api.GetStringFromOpenLImpl;

@RestController
public class getOpenTableCars {

	@Autowired
	private GetStringFromOpenLImpl impl;

	@GetMapping("/getCarsTutorial")
	public String jsonFromTutorial() {
		return impl.getString();
	}	

}
