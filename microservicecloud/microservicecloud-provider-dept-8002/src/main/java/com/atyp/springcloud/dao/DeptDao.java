package com.atyp.springcloud.dao;

import com.atguigu.springcloud.entites.Dept;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @author: RickYin
 * @version: 1.0
 * @createDate: 2019/08/04 下午2:29
 * @see: com.atyp.springcloud.dao
 * @desception:
 */
@Mapper
public interface DeptDao {
    boolean addDept(Dept dept);

    Dept findById(Long id);

    List<Dept> findAll();
}
