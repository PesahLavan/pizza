package com.pesahlavan.pizza.service;

import com.pesahlavan.pizza.domain.Order;

public interface PricingEngine {
  public float calculateOrderTotal(Order order);
}
