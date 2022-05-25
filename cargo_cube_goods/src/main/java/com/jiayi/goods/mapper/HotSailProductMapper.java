package com.jiayi.goods.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.jiayi.goods.bean.Goods;
import com.jiayi.goods.bean.HotSailProduct;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
/**
 * @author ytw
 * @date 2022/5/25 10:24
 */

@Mapper
public interface HotSailProductMapper extends BaseMapper<HotSailProduct> {

    List<Goods> queryHotSailProduct(String cateId);

    int updateHotSailProduct(HotSailProduct hotSailProduct);

    List<HotSailProduct> selectHotSailProducts(HotSailProduct hotSailProduct);
}
