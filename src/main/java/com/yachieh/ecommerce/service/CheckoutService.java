package com.yachieh.ecommerce.service;

import com.yachieh.ecommerce.dto.Purchase;
import com.yachieh.ecommerce.dto.PurchaseResponse;

public interface CheckoutService {
    PurchaseResponse placeOrder(Purchase purchase);
}
