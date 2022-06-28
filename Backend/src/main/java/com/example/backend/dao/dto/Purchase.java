package com.example.backend.dao.dto;

import com.example.backend.entites.Address;
import com.example.backend.entites.Customer;
import com.example.backend.entites.Order;
import com.example.backend.entites.OrderItem;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.util.Set;

@Data
public class Purchase {

    private Customer customer;
    private Address shippingAddress;
    private Address billingAddress;
    private Order order;
    private Set<OrderItem> orderItems;

}
