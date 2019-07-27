package com.atyp.springboot.mapper;

import com.atyp.springboot.bean.Department;
import org.apache.ibatis.annotations.*;
import org.springframework.web.bind.annotation.Mapping;

/**
 * @author: RickYin
 * @version: 1.0
 * @createDate: 2019/07/23 下午9:16
 * @see: com.atyp.springboot.mapper
 * @desception:
 */
//指定这是一个操作数据库的mapper(指定了MapperScan)
public interface DepartmentMapper {

    @Select("select * from department where id=#{id}")
    Department getDeptById(Integer id);

    @Delete("delete from department where id=#{id}")
    int deleteDeptById(Integer id);

    @Options(useGeneratedKeys = true,keyProperty = "id")
    @Insert("insert into department(department_name) values(#{departmentName}) ")
    int insertDept(Department department);

    @Update("update department set department_name=#{departmentName} where id=#{id}")
    int updateDept(Department department);
}
