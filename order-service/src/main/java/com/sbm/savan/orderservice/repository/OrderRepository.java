package com.sbm.savan.orderservice.repository;

import com.sbm.savan.orderservice.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
