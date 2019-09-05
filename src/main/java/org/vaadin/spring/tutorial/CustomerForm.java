package org.vaadin.spring.tutorial;


import org.springframework.beans.factory.annotation.Autowired;

import com.vaadin.event.ShortcutAction.KeyCode;


public class CustomerForm extends CustomerFormDesign {
	
	@Autowired
    private CustomerService service;
    
    
    private Customer customer;	
    private MyUI myUI;

    public CustomerForm(MyUI myUI) {
        this.myUI = myUI;
        //status.addItems(CustomerStatus.values());
        save.setClickShortcut(KeyCode.ENTER);
        save.addClickListener(e -> this.save());
        delete.addClickListener(e -> this.delete());
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
        //BeanFieldGroup.bindFieldsUnbuffered(customer, this);

        // Show delete button for only customers already in the database
        delete.setVisible(customer.isPersisted());
        setVisible(true);
        firstName.selectAll();
    }

    private void delete() {
        service.delete(customer);
        setVisible(false);
    }

    private void save() {
        service.save(customer);
        setVisible(false);
    }
}