package com.oredata.bookStore.business.abstracts;

import java.util.List;

import org.springframework.http.ResponseEntity;

import com.oredata.bookStore.business.requests.CreateOrderRequest;
import com.oredata.bookStore.business.responses.GetByOrderIdOrderDetailsResponse;
import com.oredata.bookStore.business.responses.GetByUserIdOrdersResponse;

public interface OrderService {
	List<GetByUserIdOrdersResponse> getByUserId(Long userId);
	List<GetByOrderIdOrderDetailsResponse> getByOrderId(Long orderId);
	ResponseEntity<String> add(CreateOrderRequest createOrderRequest);
}
