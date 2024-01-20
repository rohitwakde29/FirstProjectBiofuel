package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.model.Order;
import com.service.OrderServiceInterface;

@RestController
@CrossOrigin(origins="http://localhost:4200")
@RequestMapping("/o")
public class OrderController {

	@Autowired
	OrderServiceInterface orderService;
	
	@PostMapping("/saveOrder")
	public Order saveOrder(@RequestBody Order o) {
		orderService.saveOrder(o);
		return o ;
	}
	
   
	@GetMapping("/getAllOrders")
	public List<Order> getAllOrder() {
		
		return orderService.getAllOrder();
	}
	
   
	@GetMapping("/getOrder/{id}")
	public Order getOrderById(@PathVariable long id) {
		
		return orderService.getOrderById(id);
	}
	
	@PutMapping("/updateOrder")
	public Order updateOrder(@RequestBody Order o) {
        return orderService.updateOrder(o);
    }
	
	@DeleteMapping("/deleteOrderbyid/{id}")
	public void deleteOrder(@PathVariable ("id")long id) {
		orderService.deleteOrder(id);
		
	}
}
