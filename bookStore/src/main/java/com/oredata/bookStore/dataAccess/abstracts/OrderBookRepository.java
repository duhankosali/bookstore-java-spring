package com.oredata.bookStore.dataAccess.abstracts;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.oredata.bookStore.entities.concretes.OrderBook;

public interface OrderBookRepository extends JpaRepository<OrderBook, Long> {
	@Query("SELECT ob FROM OrderBook ob WHERE ob.order.id = :orderId")
    List<OrderBook> findOrderBooksByOrderId(@Param("orderId") Long orderId);
}
