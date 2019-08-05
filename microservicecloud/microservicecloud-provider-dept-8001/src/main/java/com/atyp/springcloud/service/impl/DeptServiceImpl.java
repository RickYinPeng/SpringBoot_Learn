package com.atyp.springcloud.service.impl;

import com.atguigu.springcloud.entites.Dept;
import com.atyp.springcloud.dao.DeptDao;
import com.atyp.springcloud.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.AutoConfigureOrder;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author: RickYin
 * @version: 1.0
 * @createDate: 2019/08/04 下午3:14
 * @see: com.atyp.springcloud.service.impl
 * @desception:
 */
@Service
public class DeptServiceImpl implements DeptService {

    @Autowired
    private DeptDao deptDao;

    @Override
    public boolean add(Dept dept) {

        return deptDao.addDept(dept);
    }

    @Override
    public Dept get(Long id) {
        return deptDao.findById(id);
    }

    @Override
    public List<Dept> list() {
        return deptDao.findAll();
    }
}
