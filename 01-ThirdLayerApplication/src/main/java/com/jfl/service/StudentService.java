package com.jfl.service;

import com.jfl.vo.PageInfo;
import com.jfl.entity.Student;

// 业务层接口
public interface StudentService {
    PageInfo<Student> getPageInfo(int pageNo, int pageSize);
}
