package com.service;

import java.util.List;

import com.model.Order;



public interface OrderServiceInterface {

    public Order saveOrder(Order o);
	
	public List<Order> getAllOrder();
	
	public Order getOrderById(long id);
	
    public Order updateOrder(Order o);
    
    public void deleteOrder(long id);
}
