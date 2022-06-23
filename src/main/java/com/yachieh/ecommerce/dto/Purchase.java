package com.yachieh.ecommerce.dto;

import com.yachieh.ecommerce.entity.Address;
import com.yachieh.ecommerce.entity.Customer;
import com.yachieh.ecommerce.entity.Order;
import com.yachieh.ecommerce.entity.OrderItem;
import lombok.Data;

import java.util.Set;


@Data
public class Purchase {

    private Customer customer;
    private Address shippingAddress;
    private Address billingAddress;
    private Order order;
    private Set<OrderItem> orderItems;

}
