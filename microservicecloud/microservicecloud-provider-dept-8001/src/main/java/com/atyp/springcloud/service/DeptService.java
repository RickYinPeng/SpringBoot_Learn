package com.atyp.springcloud.service;

import com.atyp.springcloud.entites.Dept;

import java.util.List;

/**
 * @author: RickYin
 * @version: 1.0
 * @createDate: 2019/08/04 下午3:13
 * @see: com.atyp.springcloud.service
 * @desception:
 */
public interface DeptService {
    boolean add(Dept dept);

    Dept get(Long id);

    List<Dept> list();
}
