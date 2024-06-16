/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.ijse.mvc.controller;

import edu.ijse.mvc.dto.OrderDetailDto;
import edu.ijse.mvc.dto.OrderDto;
import edu.ijse.mvc.model.OrderModel;
import java.util.ArrayList;

/**
 *
 * @author anjan
 */
public class OrderController {
    
    private final OrderModel ORDER_MODEL;

    public OrderController() {
        this.ORDER_MODEL = new OrderModel();
    }
    
    
    
    public String placeOrder(OrderDto orderDto, ArrayList<OrderDetailDto> orderDetailDtos) throws Exception{
        return ORDER_MODEL.placeOrder(orderDto, orderDetailDtos);
    }
    
}
