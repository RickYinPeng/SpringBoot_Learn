package com.atyp.springboot.repository;

import com.atyp.springboot.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author: RickYin
 * @version: 1.0
 * @createDate: 2019/07/27 下午12:59
 * @see: com.atyp.springboot.repository
 * @desception:
 */
//继承 JpaRepository 来完成对数据库的操作
public interface UserRepository extends JpaRepository<User,Integer> {

}
