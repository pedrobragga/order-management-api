package com.pedrobraga.order_management_api.service;

import com.pedrobraga.order_management_api.domain.model.Order;
import com.pedrobraga.order_management_api.repository.OrderRepository;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class OrderService {

    private final OrderRepository orderRepository;

    public OrderService(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }

    public Order create(Order order) {
        order.setCreatedAt(LocalDateTime.now());
        return orderRepository.save(order);
    }

    public List<Order> findAll() {
        return orderRepository.findAll();
    }

    public Order findById(Long id) {
    return orderRepository.findById(id)
            .orElseThrow(() -> new RuntimeException("Pedido não encontrado"));
    }

   public Order update(Long id, Order order) {
    Order existingOrder = findById(id);

    existingOrder.setDescription(order.getDescription());
    existingOrder.setAmount(order.getAmount());
    existingOrder.setStatus(order.getStatus());

    return orderRepository.save(existingOrder);
    }

  public void delete(Long id) {
    Order order = findById(id);
    orderRepository.delete(order);
    }
}

