package com.jasvinder.ecommerce.service;


import java.util.Collection;

import com.jasvinder.ecommerce.entity.User;

/**
 */
public interface UserService {
    User findOne(String email);

    Collection<User> findByRole(String role);

    User save(User user);

    User update(User user);
}
