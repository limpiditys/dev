package com.jfl.dao;

import com.jfl.entity.Student;

import java.util.List;

public interface StudentDao {
    int getTotalCount();

    List<Student> getList(int pageNo, int pageSize);
}
