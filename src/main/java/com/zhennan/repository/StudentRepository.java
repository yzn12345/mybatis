package com.zhennan.repository;

import com.zhennan.entity.Student;

public interface StudentRepository {

    public Student findByIdLazy(long id);
}
