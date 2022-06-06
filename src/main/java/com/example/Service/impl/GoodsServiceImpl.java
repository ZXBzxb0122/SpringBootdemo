package com.example.Service.impl;

import com.example.dao.GoodsDao;
import com.example.entity.Goods;
import com.example.Service.GoodsService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.concurrent.TimeUnit;

@Service
public class GoodsServiceImpl implements GoodsService {

    @Resource
    GoodsDao goodsDao;

    @Resource
    private RedisTemplate redisTemplate;


//    private RedisTemplate redisTemplate;
//
//    @Autowired(required = false)
//    public void setRedisTemplate(RedisTemplate redisTemplate) {
//        RedisSerializer stringSerializer = new StringRedisSerializer();
//        redisTemplate.setKeySerializer(stringSerializer);
//        //redisTemplate.setValueSerializer(stringSerializer);
//        redisTemplate.setHashKeySerializer(stringSerializer);
//       // redisTemplate.setHashValueSerializer(stringSerializer);
//        this.redisTemplate = redisTemplate;
//    }

    @Override
    public PageInfo<Goods> queryAll(Integer pageNum, Integer pageSize) {
        PageHelper.startPage(pageNum,pageSize);
        List<Goods> list = goodsDao.queryAll();
        PageInfo<Goods> pageInfo = new PageInfo<>(list);
        return pageInfo;
    }

    @Override
    public int deleteByID(Integer id) {
        return goodsDao.deleteByID(id);
    }


    @Override
    public Goods findById(Integer id) {
        boolean flag = redisTemplate.hasKey("goods_"+id);
        if (flag) {
            // 从缓存查
            Object object = redisTemplate.opsForValue().get("goods_" + id);
            if (object != null) {
                return (Goods) object;
            }
        }
        // 从数据库中查
        Goods goods = goodsDao.findById(id);
        redisTemplate.opsForValue().set("goods_"+id,goods,1, TimeUnit.DAYS);
        return goods;
    }

    @Override
    public int update(Goods goods) {
        return goodsDao.update(goods);
    }

    @Override
    public int insert(Goods goods) {
        return goodsDao.insert(goods);
    }

}

