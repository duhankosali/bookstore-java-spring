package com.oredata.bookStore.webApi.controllers;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.oredata.bookStore.business.abstracts.OrderService;
import com.oredata.bookStore.business.requests.CreateOrderRequest;
import com.oredata.bookStore.business.responses.GetByOrderIdOrderDetailsResponse;
import com.oredata.bookStore.business.responses.GetByUserIdOrdersResponse;

import lombok.AllArgsConstructor;

// POST /orders : Place a new order for a user with a minimum price of 25$.
// GET /orders/{userId} : Get all orders for a specific user ordered by update date DESC.
// GET /orders/details/{orderId} : Get details of a specific order by its ID with the books under that order.
@RestController // REST controller
@RequestMapping("/orders")
@AllArgsConstructor
public class OrdersController {
	private OrderService orderService;
	
	@GetMapping("/{userId}")
	public List<GetByUserIdOrdersResponse> getByUserId(@PathVariable Long userId) {
		return orderService.getByUserId(userId);	
	}	
	
	@GetMapping("/details/{orderId}")
	public List<GetByOrderIdOrderDetailsResponse> getByOrderId(@PathVariable Long orderId){
		return orderService.getByOrderId(orderId);	
	}
	
	@PostMapping
	@ResponseStatus(code=HttpStatus.CREATED)
	public void add(@RequestBody CreateOrderRequest createOrderRequest) {
		System.out.println("DUHANKOSSSS");
		this.orderService.add(createOrderRequest);
	}
}
