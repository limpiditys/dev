package com.jfl.service.impl;

import com.jfl.dao.StudentDao;
import com.jfl.dao.impl.StudentDaoImpl;
import com.jfl.vo.PageInfo;
import com.jfl.entity.Student;
import com.jfl.service.StudentService;

import java.util.List;

public class StudentServiceImpl implements StudentService {
    // 业务逻辑层依赖数据访问层
    StudentDao studentDao = new StudentDaoImpl();

    @Override
    public PageInfo<Student> getPageInfo(int pageNo, int pageSize) {
        int totalCount = studentDao.getTotalCount();
        List<Student> list = studentDao.getList(pageNo, pageSize);

        return new PageInfo<>(totalCount, pageSize, pageNo, list);
    }
}
