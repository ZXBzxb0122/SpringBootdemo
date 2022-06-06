package com.example.Service;

import com.example.entity.Orderdetail;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

/**
 * (Orderdetail)表服务接口
 *
 * @author makejava
 * @since 2022-05-23 16:34:44
 */
public interface OrderdetailService {

    /**
     * 通过ID查询单条数据
     *
     * @param odid 主键
     * @return 实例对象
     */
    Orderdetail queryById(Integer odid);

    /**
     * 分页查询
     *
     * @param orderdetail 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
    Page<Orderdetail> queryByPage(Orderdetail orderdetail, PageRequest pageRequest);

    /**
     * 新增数据
     *
     * @param orderdetail 实例对象
     * @return 实例对象
     */
    Orderdetail insert(Orderdetail orderdetail);

    /**
     * 修改数据
     *
     * @param orderdetail 实例对象
     * @return 实例对象
     */
    Orderdetail update(Orderdetail orderdetail);

    /**
     * 通过主键删除数据
     *
     * @param odid 主键
     * @return 是否成功
     */
    boolean deleteById(Integer odid);

}
