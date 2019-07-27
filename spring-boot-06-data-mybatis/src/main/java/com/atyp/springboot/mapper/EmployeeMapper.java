package com.atyp.springboot.mapper;

import com.atyp.springboot.bean.Employee;
import org.omg.CORBA.INTERNAL;

/**
 * @author: RickYin
 * @version: 1.0
 * @createDate: 2019/07/27 上午11:45
 * @see: com.atyp.springboot.mapper
 * @desception:
 */
//@Mapper 或者 @MapperScan 将接口扫描装配到容器中
public interface EmployeeMapper {


    Employee getEmpById(Integer id);

    void insertEmp(Employee employee);


}
