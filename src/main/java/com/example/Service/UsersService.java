package com.example.Service;

import com.example.entity.Users;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

/**
 * (Users)表服务接口
 *UsersService
 * @author makejava
 * @since 2022-05-02 17:55:44
 */
public interface UsersService {

    /**
     * 通过ID查询单条数据
     *
     * @param uid 主键
     * @return 实例对象
     */
    Users queryById(Integer uid);

    /**
     * 分页查询
     *
     * @param users 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
    Page<Users> queryByPage(Users users, PageRequest pageRequest);

    /**
     * 新增数据
     *
     * @param users 实例对象
     * @return 实例对象
     */
    Users insert(Users users);

    /**
     * 修改数据
     *
     * @param users 实例对象
     * @return 实例对象
     */
    Users update(Users users);

    /**
     * 通过主键删除数据
     *
     * @param uid 主键
     * @return 是否成功
     */
    boolean deleteById(Integer uid);

}
