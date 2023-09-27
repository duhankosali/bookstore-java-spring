package com.oredata.bookStore.dataAccess.abstracts;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.oredata.bookStore.entities.concretes.Orders;

public interface OrderRepository extends JpaRepository<Orders, Long>{
	@Query("SELECT o FROM Orders o WHERE o.user.id = :userId")
    List<Orders> findOrdersByUserId(@Param("userId") Long userId);
}
