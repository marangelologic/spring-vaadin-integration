package org.vaadin.spring.tutorial;

import org.springframework.stereotype.Component;

import com.vaadin.annotations.AutoGenerated;
import com.vaadin.annotations.DesignRoot;
import com.vaadin.ui.Button;
import com.vaadin.ui.FormLayout;
import com.vaadin.ui.NativeSelect;
import com.vaadin.ui.TextField;
import com.vaadin.ui.declarative.Design;

/** 
 * !! DO NOT EDIT THIS FILE !!
 * 
 * This class is generated by Vaadin Designer and will be overwritten.
 * 
 * Please make a subclass with logic and additional interfaces as needed,
 * e.g class LoginView extends LoginDesign implements View { }
 */
@DesignRoot
@AutoGenerated
@SuppressWarnings("serial")
public class CustomerFormDesign extends FormLayout {
	protected TextField firstName;
	protected TextField lastName;
	protected TextField email;
	protected NativeSelect status;
	//protected PopupDateField birthDate;
	protected Button save;
	protected Button delete;

	public CustomerFormDesign() {
		Design.read(this);
	}
}
