package com.jasvinder.ecommerce.service;

import com.jasvinder.ecommerce.entity.ProductInOrder;
import com.jasvinder.ecommerce.entity.User;

/**
 */
public interface ProductInOrderService {
    void update(String itemId, Integer quantity, User user);
    ProductInOrder findOne(String itemId, User user);
}
