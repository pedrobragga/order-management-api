package com.pedrobraga.order_management_api.repository;

import com.pedrobraga.order_management_api.domain.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {
}
