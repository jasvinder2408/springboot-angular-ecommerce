package com.jasvinder.ecommerce.service;

import java.util.List;

import com.jasvinder.ecommerce.entity.ProductCategory;

/**
 */
public interface CategoryService {

    List<ProductCategory> findAll();

    ProductCategory findByCategoryType(Integer categoryType);

    List<ProductCategory> findByCategoryTypeIn(List<Integer> categoryTypeList);

    ProductCategory save(ProductCategory productCategory);


}
