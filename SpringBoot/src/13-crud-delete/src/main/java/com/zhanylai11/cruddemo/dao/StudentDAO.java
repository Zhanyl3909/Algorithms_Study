package com.zhanylai11.cruddemo.dao;

import com.zhanylai11.cruddemo.entity.Student;

public interface StudentDAO {
     void save(Student theStudent);
     void delete(Integer id);

     Student findById(Integer id);
}
