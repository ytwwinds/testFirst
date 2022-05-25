package com.jiayi.goods.service.Impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.jiayi.goods.bean.Goods;
import com.jiayi.goods.bean.HotSailProduct;
import com.jiayi.goods.mapper.HotSailProductMapper;
import com.jiayi.goods.service.HotSailProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author ytw
 * @date 2022/5/25 10:26
 */

@Service
public class HotSailProductServiceImpl implements HotSailProductService {

    @Autowired
    private HotSailProductMapper hotSailProductMapper;

    /*
     * 查询热门类别对应的商品
     * */
    @Override
    public List<Goods> queryHotSailProduct(String cateId) {
        List<Goods> hotSailProductList = hotSailProductMapper.queryHotSailProduct(cateId);
        return hotSailProductList;
    }

    /*
     * 添加热门类别对应的商品
     * */
    @Override
    public int addHotSailProduct(HotSailProduct hotSailProduct) {
        List<HotSailProduct> list = hotSailProductMapper.selectHotSailProducts(hotSailProduct);
        if (list.size() != 0) {
            return 0;
        }
        return hotSailProductMapper.insert(hotSailProduct);
    }

    /*
     * 修改热门类别
     * */
    @Override
    public int updateHotSailProduct(HotSailProduct hotSailProduct) {
        return this.hotSailProductMapper.updateHotSailProduct(hotSailProduct);
    }

    /*
    * 删除热门类别
    * */
    @Override
    public int delHotSailProduct(String cateId) {
        QueryWrapper queryWrapper=new QueryWrapper();
        queryWrapper.eq("cate_id",cateId);
        return this.hotSailProductMapper.delete(queryWrapper);
    }
}
