package com.example.pizzamaker.Service;

import com.example.pizzamaker.controller.OrderController;
import com.example.pizzamaker.model.Order;
import com.example.pizzamaker.model.dto.OrderDto;

import java.util.List;

public interface OrderService {

    void create(Order order);

    OrderDto read(int tableId);

    List<OrderDto> readAll();

    Order update(Order order);

    void delete(int tableId);
}
