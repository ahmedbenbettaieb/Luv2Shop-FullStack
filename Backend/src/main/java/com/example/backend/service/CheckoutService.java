package com.example.backend.service;

import com.example.backend.dao.dto.Purchase;
import com.example.backend.dao.dto.PurchaseResponse;

public interface CheckoutService {

    PurchaseResponse placeOrder(Purchase purchase);
}
