package com.jasvinder.ecommerce.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jasvinder.ecommerce.entity.ProductInOrder;

/**
 */
public interface ProductInOrderRepository extends JpaRepository<ProductInOrder, Long> {

}