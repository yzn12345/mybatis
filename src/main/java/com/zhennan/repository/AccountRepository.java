package com.zhennan.repository;

import com.zhennan.entity.Account;

import java.util.List;

public interface AccountRepository {
    public int save(Account account);
    public int update(Account account);
    public int delete(long id);
    public List<Account> findAll();
    public Account findById(long id);
}
