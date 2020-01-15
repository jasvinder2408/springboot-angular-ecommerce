package com.jasvinder.ecommerce.service;

import java.util.Collection;

import com.jasvinder.ecommerce.entity.Cart;
import com.jasvinder.ecommerce.entity.ProductInOrder;
import com.jasvinder.ecommerce.entity.User;

/**
 */
public interface CartService {
    Cart getCart(User user);

    void mergeLocalCart(Collection<ProductInOrder> productInOrders, User user);

    void delete(String itemId, User user);

    void checkout(User user);
}
