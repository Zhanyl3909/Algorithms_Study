package com.zhanylai11.cruddemo.dao;

import com.zhanylai11.cruddemo.entity.Student;
import jakarta.persistence.EntityManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
public class StudentDAOImpl implements StudentDAO {

    //define field for entity manager
    private EntityManager entityManager;


    //inject entity manager using constructor injection
    @Autowired
    public StudentDAOImpl(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    //implement save method
    @Transactional
    @Override
    public void save(Student theStudent) {
        entityManager.persist(theStudent);
    }
}
