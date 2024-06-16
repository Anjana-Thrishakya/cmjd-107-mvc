/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.ijse.mvc.controller;

import edu.ijse.mvc.dto.CustomerDto;
import edu.ijse.mvc.model.CustomerModel;

/**
 *
 * @author anjan
 */
public class CustomerController {
    
    private final CustomerModel CUSTOMER_MODEL;

    public CustomerController() throws Exception {
        this.CUSTOMER_MODEL = new CustomerModel();
    }
    
    public CustomerDto searchCustomer(String custId) throws Exception{
        return CUSTOMER_MODEL.getCustomer(custId);
    }
    
}
