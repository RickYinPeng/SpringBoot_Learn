package com.atyp.springboot.bean;

import lombok.Data;
import org.omg.CORBA.INTERNAL;

/**
 * @author: RickYin
 * @version: 1.0
 * @createDate: 2019/07/23 下午9:13
 * @see: com.atyp.springboot.bean
 * @desception:
 */
@Data
public class Employee {
    private Integer id;
    private String lastName;
    private Integer gender;
    private String email;
    private Integer dId;
}
