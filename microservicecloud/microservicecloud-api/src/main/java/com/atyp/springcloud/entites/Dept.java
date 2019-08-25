package com.atyp.springcloud.entites;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * @author: RickYin
 * @version: 1.0
 * @createDate: 2019/08/04 上午11:16
 * @see: com.atguigu.springcloud.entites
 * @desception:
 */
@SuppressWarnings("serial")
@NoArgsConstructor
@Data
@Accessors(chain=true)
public class Dept implements Serializable {
    private Long deptno;
    private String dname;
    private String db_source;

    public Dept(String dname) {
        super();
        this.dname = dname;
    }
}
