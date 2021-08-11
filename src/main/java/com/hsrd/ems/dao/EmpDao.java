package com.hsrd.ems.dao;

import com.hsrd.ems.entity.Emp;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface EmpDao {
    List<Emp> findAll();

    void save(Emp emp);

    void delete(String name);

    Emp findByName(String name);

    void update(String name);


}
