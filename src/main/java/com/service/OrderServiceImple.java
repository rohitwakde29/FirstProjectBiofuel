package com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.model.Order;
import com.repository.OrderRepository;

@Service
public class OrderServiceImple implements OrderServiceInterface {

	@Autowired
	OrderRepository orderRepo;
	
	
	@Override
	public Order saveOrder(Order o) {
		orderRepo.save(o);
		return o ;
	}
	

	@Override
	public List<Order> getAllOrder() {
		
		return orderRepo.findAll();
	}
	

	@Override
	public Order getOrderById(long id) {
		
		return orderRepo.findById(id).orElse(null);
	}

	@Override
	public Order updateOrder(Order o) {
		Order existOrder=orderRepo.findById(o.getOrderId()).orElse(null);
		existOrder.setOrderName(o.getOrderName());
		return orderRepo.save(existOrder);
	}

	@Override
	public void deleteOrder(long id) {
		orderRepo.deleteById(id);
		
	}

}
