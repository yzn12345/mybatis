package com.zhennan.repository;

import com.zhennan.entity.Customer;

public interface CustomerRepository {
    public Customer findById(long id);
}
