package com.example.dao;

import com.example.entity.Orderdetail;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.data.domain.Pageable;
import java.util.List;


/**
 * (Orderdetail)表数据库访问层
 *
 * @author makejava
 * @since 2022-05-23 16:34:43
 */
@Mapper
public interface OrderdetailDao {

    /**
     * 通过ID查询单条数据
     *
     * @param odid 主键
     * @return 实例对象
     */
    Orderdetail queryById(Integer odid);

    /**
     * 查询指定行数据
     *
     * @param orderdetail 查询条件
     * @param pageable         分页对象
     * @return 对象列表
     */
    List<Orderdetail> queryAllByLimit(Orderdetail orderdetail, @Param("pageable") Pageable pageable);

    /**
     * 统计总行数
     *
     * @param orderdetail 查询条件
     * @return 总行数
     */
    long count(Orderdetail orderdetail);

    /**
     * 新增数据
     *
     * @param orderdetail 实例对象
     * @return 影响行数
     */
    int insert(Orderdetail orderdetail);

    /**
     * 批量新增数据（MyBatis原生foreach方法）
     *
     * @param entities List<Orderdetail> 实例对象列表
     * @return 影响行数
     */
    int insertBatch(@Param("entities") List<Orderdetail> entities);

    /**
     * 批量新增或按主键更新数据（MyBatis原生foreach方法）
     *
     * @param entities List<Orderdetail> 实例对象列表
     * @return 影响行数
     * @throws org.springframework.jdbc.BadSqlGrammarException 入参是空List的时候会抛SQL语句错误的异常，请自行校验入参
     */
    int insertOrUpdateBatch(@Param("entities") List<Orderdetail> entities);

    /**
     * 修改数据
     *
     * @param orderdetail 实例对象
     * @return 影响行数
     */
    int update(Orderdetail orderdetail);

    /**
     * 通过主键删除数据
     *
     * @param odid 主键
     * @return 影响行数
     */
    int deleteById(Integer odid);

}

