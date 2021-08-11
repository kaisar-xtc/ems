package com.hsrd.ems.service;

import com.hsrd.ems.dao.EmpDao;
import com.hsrd.ems.entity.Emp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class EmpService {
    @Autowired
    private EmpDao empDao;
    public List<Emp> findAll() {
        return empDao.findAll();
    }

    public void save(Emp emp) {
        emp.setId(UUID.randomUUID().toString());
        empDao.save(emp);
    }

    public void delete(String name) {
        empDao.delete(name);
    }

    public Emp findByName(String name) {
        return empDao.findByName(name);
    }

    public void update(String name) {
        empDao.update(name);
    }
}
