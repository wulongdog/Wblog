package com.xhy.wblog.service;

import com.xhy.wblog.domain.User;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

// 事务管理: 默认 只读
@Transactional(readOnly = true)
public interface UserService {


    /**
     *  默认给出了五个接口（基本的CRUD），根据自己业务需求，增加接口。
     * @param user
     * @return
     */
    @Transactional(readOnly = false)
    boolean save(User user);
    @Transactional(readOnly = false)
    boolean update(User user);
    @Transactional(readOnly = false)
    boolean remove(Integer id);


    // 一般最多的操作是查询，所以有关查询的，最好开启只读
    User get(Integer id);
    List<User> list();
}
